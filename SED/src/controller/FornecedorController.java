package controller;



import javax.swing.*;

import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import dao.FornecedorDao;
import model.Endereco;
import model.Fornecedor;
 
public class FornecedorController {
	 
    private Date formatarData(String data) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return new Date( formatter.parse(data).getTime() );
    }
 
   /* public void salvar( String razaoSocial, String fantasia,
			String cNPJ, String insc_Est, Date dataCriacao,
			Date dataCadastro, String telefone, Endereco end) 
        throws SQLException, ParseException 
    {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setFantasia(fantasia);
        fornecedor.setRazaoSocial(razaoSocial);
        fornecedor.setCNPJ(cNPJ);
        fornecedor.setInsc_Est(insc_Est);
        fornecedor.setDataCriacao(dataCriacao);
        fornecedor.setDataCadastro(dataCadastro);
        fornecedor.setTelefone(telefone);
        fornecedor.setEndereco(end);
        new FornecedorDao().salvar(fornecedor);
    }*/
 
    
    public void salvar(Fornecedor f) 
        throws SQLException, ParseException 
    {
        new FornecedorDao().salvar(f);
    }
    
    
    
  /*  public void editar(String fantasia, String razao, String CNPJ, String InscEstadual, Date dtcriacao, Date dtcadastro, 
			String telefone  ) 
					throws SQLException, ParseException 
	{
    	Fornecedor fornecedor = new Fornecedor();
    	fornecedor.setFantasia(fantasia);
    	fornecedor.setRazaoSocial(razao);
    	fornecedor.setCNPJ(CNPJ);
    	fornecedor.setInsc_Est(InscEstadual);
    	fornecedor.setDataCriacao(dtcriacao);
    	fornecedor.setDataCadastro(dtcadastro);
    	fornecedor.setTelefone(telefone);
    	new FornecedorDao().editar(fornecedor);
	}*/
    public void editar(Fornecedor f) 
            throws SQLException, ParseException 
        {
            new FornecedorDao().editar(f);
        }
    
 
    public List<Fornecedor> listaFornecedores() {
        FornecedorDao dao = new FornecedorDao();
        try {
            return dao.findFornecedores();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
                "Problemas ao localizar contaton" + 
                e.getLocalizedMessage()
            );
        }
        return null;
    }
 
    public void excluir(long id) throws SQLException {
        new FornecedorDao().excluir(id);
    }
 
    public Fornecedor buscaFornecedorporCnpj(String cnpj) throws SQLException {
        FornecedorDao dao = new FornecedorDao();
        return dao.findByrazao(cnpj);
    }
}
