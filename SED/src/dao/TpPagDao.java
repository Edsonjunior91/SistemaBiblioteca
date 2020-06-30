package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Endereco;
import model.TipoPagamento;
import model.Usuario;

public class TpPagDao extends GenericDao {
	public void salvar(TipoPagamento tp)throws SQLException{
		String insert = "INSERT INTO tipo_pagamento (nome) VALUES(?) ";
		save(insert, tp.getNome_pag());
	}
	
		public TipoPagamento findByName(String id_TpPag) throws SQLException {
	        String select = "SELECT * FROM pessoa WHERE id_pagamento  = ?";
	        TipoPagamento tp = null;
	        PreparedStatement stmt = 
	            getConnection().prepareStatement(select);
	             
	        stmt.setString(1, id_TpPag);
	        ResultSet rs = stmt.executeQuery();
	 
	        while (rs.next()) {
	            
	        	tp = new TipoPagamento();
	            tp.setNome_pag(rs.getString("nome"));
	        }
	 
	        rs.close();
	        stmt.close();
	        return tp;
	    }
		
		
		public List<TipoPagamento> retornaTodos() throws SQLException {
	        List<TipoPagamento> pagamentos = new ArrayList<TipoPagamento>();
	 
	        String select = "SELECT * FROM tipo_pagamento";
	 
	        PreparedStatement stmt = 
	            getConnection().prepareStatement(select);
	             
	        ResultSet rs = stmt.executeQuery();
	 
	        while (rs.next()) {
	            TipoPagamento tp = new TipoPagamento();
	            tp.setId_pagament(rs.getInt("id_pagamento"));
	            tp.setNome_pag(rs.getString("nome"));
	            pagamentos.add(tp);
	        }
	 
	        rs.close();
	        stmt.close();
	 
	        return pagamentos;
	    }
}
