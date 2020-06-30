package controller;

import java.sql.SQLException;

import model.Usuario;



public class UsuarioController {
	public Usuario buscaContatoPorCPF(String CPF) throws SQLException {
        UsuarioDao dao = new UsuarioDao();
        return dao.findByName(CPF);
    }
}
