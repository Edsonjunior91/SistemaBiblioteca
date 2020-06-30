package dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Endereco;;
 
public class EnderecoDao extends GenericDao {
 
    public void salvar(Endereco endereco) throws SQLException {
        String insert = "INSERT INTO endereco(rua, bairro, estado,cidade, numero, cep,logradouro) VALUES(?,?,?,?,?,?,?)";
        save(insert, endereco.getRua(), endereco.getBairro(), endereco.getEstado(), endereco.getCidade(), endereco.getNumero(),
        			endereco.getCep(), endereco.getLogradouro());
    }
 
    public void editar(Endereco endereco) throws SQLException {
        String update = "UPDATE endereco " +
                "SET logradouro=?, rua=?, numero=?, bairro=?, cep=?, cidade=?, id_estado=? " +
                "WHERE id_endereco = ?";
        update(update, endereco.getLogradouro(), endereco.getRua(), endereco.getNumero(), endereco.getBairro(), endereco.getCep(),
    			endereco.getCidade(), endereco.getEstado());
    }
 
    public void excluir(long id_endereco) throws SQLException {
        String delete = "DELETE FROM endereco WHERE id_endereco = ?";
        delete(delete, id_endereco);
    }
 
    public List<Endereco> findEnderecos() throws SQLException {
        List<Endereco> enderecos = new ArrayList<Endereco>();
 
        String select = "SELECT * FROM endereco";
 
        PreparedStatement stmt = 
            getConnection().prepareStatement(select);
             
        ResultSet rs = stmt.executeQuery();
 
        while (rs.next()) {
            Endereco endereco = new Endereco();
            endereco.setLogradouro(rs.getString("logradouro"));
            endereco.setRua(rs.getString("rua"));
            endereco.setNumero(rs.getString("numero"));
            endereco.setBairro(rs.getString("bairro"));
            endereco.setCep(rs.getString("cep"));
            endereco.setCidade(rs.getString("cidade"));
            endereco.setEstado(rs.getString("id_estado"));
            enderecos.add(endereco);
        }
 
        rs.close();
        stmt.close();
 
        return enderecos;
    }
 
    public Endereco findByName(String rua) throws SQLException {
        String select = "SELECT * FROM endereco WHERE rua = ?";
        Endereco endereco = null;
        PreparedStatement stmt = 
            getConnection().prepareStatement(select);
             
        stmt.setString(1, rua);
        ResultSet rs = stmt.executeQuery();
 
        while (rs.next()) {
        	endereco = new Endereco();
            endereco.setLogradouro(rs.getString("logradouro"));
            endereco.setRua(rs.getString("rua"));
            endereco.setNumero(rs.getString("numero"));
            endereco.setBairro(rs.getString("bairro"));
            endereco.setCep(rs.getString("cep"));
            endereco.setCidade(rs.getString("cidade"));
            endereco.setEstado(rs.getString("id_estado"));
        }
 
        rs.close();
        stmt.close();
        return endereco;
    }
}