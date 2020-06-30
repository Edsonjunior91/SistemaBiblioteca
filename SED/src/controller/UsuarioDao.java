package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.GenericDao;
import model.Usuario;


public class UsuarioDao extends GenericDao {
	 public Usuario findByName(String id_usuario) throws SQLException {
	        String select = "SELECT * FROM pessoa WHERE cpf  = ?";
	        Usuario usuario = null;
	        PreparedStatement stmt = 
	            getConnection().prepareStatement(select);
	             
	        stmt.setString(1, id_usuario);
	        ResultSet rs = stmt.executeQuery();
	 
	        while (rs.next()) {
	            
	        	usuario = new Usuario();
	            usuario.setId_pessoa(rs.getInt("id_pessoa"));
	            usuario.setNome(rs.getString("nome"));
	            usuario.setRg(rs.getString("Rg"));
	            usuario.setCpf(rs.getString("Cpf"));
	        }
	 
	        rs.close();
	        stmt.close();
	        return usuario;
	    }
}
