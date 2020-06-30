package dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Fornecedor;
import Cadastro.Cadastro_Fornecedor;
 
public class FornecedorDao extends GenericDao {
 
    public void salvar(Fornecedor fornecedor) throws SQLException {
    	//EnderecoDao end = new EnderecoDao();
        //end.salvar(fornecedor.getEndereco());
        
    	String insert = "INSERT INTO fornecedor(razao_social, nome_fantasia, cnpj, insc_estad) VALUES(?,?,?,?)";
        save(insert,  fornecedor.getRazaoSocial(), fornecedor.getFantasia(), 
        	fornecedor.getCNPJ(), fornecedor.getInsc_Est());
        //String insertend = "INSERT INTO endereco() VALUES()";
        //save(insertend,fornecedor.getEndereco().getRua(),fornecedor.getEndereco().getCidade());
        
        
    }
    public void editar(Fornecedor f) throws SQLException {
		 String update = "UPDATE fornecedor " +
	                "SET razao_social=?, nome_fantasia=?, cnpj=?, insc_estad=?, endereco_id_endereco=? " +
	                "WHERE id_fornecedor=?";
	        update(update,  f.getId(), f.getRazaoSocial(), f.getFantasia(), 
	            	f.getCNPJ(), f.getInsc_Est());
		EnderecoDao end = new EnderecoDao();
		end.editar(f.getEndereco());
	}
   
 
    public void excluir(long id) throws SQLException {
        String delete = "DELETE FROM fornecedor WHERE id_fornecedor = ?";
        delete(delete, id);
    }
 
    public List<Fornecedor> findFornecedores() throws SQLException {
        List<Fornecedor> contatos = new ArrayList<Fornecedor>();
 
        String select = "SELECT * FROM fornecedor";
 
        PreparedStatement stmt = 
            getConnection().prepareStatement(select);
             
        ResultSet rs = stmt.executeQuery();
 
        while (rs.next()) {
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setId(rs.getLong("id_fornecedor"));
            fornecedor.setRazaoSocial(rs.getString("razao_social"));
            fornecedor.setFantasia(rs.getString("nome_fantasia"));
            fornecedor.setCNPJ(rs.getString("cnpj"));
            fornecedor.setInsc_Est(rs.getString("insc_estad"));
            
        }
 
        rs.close();
        stmt.close();
 
        return contatos;
    }
 
    public Fornecedor findByrazao(String cnpj) throws SQLException {
        String select = "SELECT * FROM fornecedor WHERE cnpj = ?";
        Fornecedor fornecedor = null;
        PreparedStatement stmt = 
            getConnection().prepareStatement(select);
             
        stmt.setString(1, cnpj);
        ResultSet rs = stmt.executeQuery();
 
        while (rs.next()) {
        	fornecedor = new Fornecedor();
            fornecedor.setId(rs.getLong("id_fornecedor"));
            fornecedor.setRazaoSocial(rs.getString("razao_social"));
            fornecedor.setFantasia(rs.getString("nome_fantasia"));
            fornecedor.setCNPJ(rs.getString("cnpj"));
            fornecedor.setInsc_Est(rs.getString("insc_estad"));
        }
 
        rs.close();
        stmt.close();
        return fornecedor;
    }

  
	
}
