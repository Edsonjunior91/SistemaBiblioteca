package controller;





import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;

import dao.EnderecoDao;
import model.Endereco;
 
public class EnderecoController {
	 
    private Date formatarData(String data) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return new Date( formatter.parse(data).getTime() );
    }
 
    public void salvar(String rua, String bairro, String estado,
			String cidade, String numero, String cep,
			String logradouro)
        throws SQLException, ParseException 
    {
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setBairro(bairro);
        endereco.setEstado(estado);
        endereco.setCidade(cidade);
        endereco.setCep(cep);
        endereco.setLogradouro(logradouro);
        
 
        new EnderecoDao().salvar(endereco);
    }
 
    public void editar( String rua, String bairro, String estado,
			String cidade, String numero, String cep,
			String logradouro) 
        throws ParseException, SQLException 
    {
         
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setBairro(bairro);
        endereco.setEstado(estado);
        endereco.setCidade(cidade);
        endereco.setCep(cep);
        endereco.setLogradouro(logradouro);
 
        new EnderecoDao().editar(endereco);
    }
 
    public List<Endereco> listaEndereco() {
        EnderecoDao dao = new EnderecoDao();
        try {
            return dao.findEnderecos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
                "Problemas ao localizar contaton" + 
                e.getLocalizedMessage()
            );
        }
        return null;
    }
 
    public void excluir(long id_endereco) throws SQLException {
        new EnderecoDao().excluir(id_endereco);
    }
 
    public Endereco buscaEnderecoPorRua(String rua) throws SQLException {
        EnderecoDao dao = new EnderecoDao();
        return dao.findByName(rua);
    }
}