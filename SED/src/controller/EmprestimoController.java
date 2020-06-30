package controller;

import java.sql.SQLException;
import java.text.ParseException;

import dao.EmprestimoDao;
import model.Emprestimo;

public class EmprestimoController {
	public void emprestar (Emprestimo e)
		throws SQLException, ParseException
		{
			new EmprestimoDao().emprestar(e);
		}
	
}
