package controller;

import java.sql.SQLException;
import java.text.ParseException;

import dao.ProdutoDao;
import model.Produto;

public class ProdutoController {
	public void Salvar(Produto p)
			throws SQLException, ParseException 
	{
		new ProdutoDao().salvar(p);
	}
}
