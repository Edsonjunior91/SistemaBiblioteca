package controller;

import java.sql.SQLException;
import java.text.ParseException;

import dao.TpPagDao;
import model.TipoPagamento;
import model.Usuario;

public class TpPagController {
	public void salvar (TipoPagamento tp)
		throws SQLException, ParseException
	{
		new TpPagDao().salvar(tp);
	}
	
	public TipoPagamento buscaTipoPag(Long id) throws SQLException {
        TpPagDao dao = new TpPagDao();
        return dao.findByName(String.valueOf(id));
    }
	
}
