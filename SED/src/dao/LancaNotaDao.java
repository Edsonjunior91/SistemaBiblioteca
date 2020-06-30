package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.NotaEnt;
import model.TipoPagamento;


public class LancaNotaDao extends GenericDao {
	public void salvar (NotaEnt ne)throws SQLException{
		String insert = "INSERT INTO nota_entrada(fornecedor_cnpj, tipo_pagamento_id_pagamento, cod_verificacao, data_emissao, data_receb, valor_nota, valor_produto, vencimento, numero_nota, serie) VALUES(?,?,?,?,?,?,?,?,?,?)";
        save(insert,  ne.getCnpj(),ne.getTipo_pag(), ne.getCod_ver(), ne.getData_emiss(), ne.getData_receb(), ne.getValor_nota(), 
        		ne.getValor_produto(), ne.getVenc(), ne.getNumero(), ne.getSerie()); 
	}
	
}
