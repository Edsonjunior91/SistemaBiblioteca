package controller;

import java.sql.SQLException;
import java.text.ParseException;

import dao.LancaNotaDao;
import model.NotaEnt;


public class LancamentController {
	public void salvar(NotaEnt ne) 
	        throws SQLException, ParseException 
	    {
	        new LancaNotaDao().salvar(ne);
	    }
}
