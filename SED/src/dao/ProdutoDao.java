package dao;

import java.sql.SQLException;

import model.Produto;

public class ProdutoDao extends GenericDao{
	public void salvar (Produto p)throws SQLException{
		String insert = "INSERT INTO produto(nome, descricao, cod_barras, valor) VALUES(?,?,?,?)";
        save(insert,  p.getNome(), p.getDescricao(), 
        	p.getCodBar(), p.getValor());
	}
}
