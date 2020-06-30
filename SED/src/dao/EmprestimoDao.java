package dao;

import java.sql.SQLException;

import model.Emprestimo;

public class EmprestimoDao extends GenericDao {
	public void emprestar (Emprestimo e)throws SQLException{
		String insert = "INSERT INTO emprestimo (nome, cpf, data_emprestimo, quantidade)VALUES (?,?,?,?)";
		save(insert, e.getNome(), e.getCpf(), e.getDatEmprest(), e.getQuantidade());
	}
}
