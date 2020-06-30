package model;

import java.sql.Date;

public class Usuario extends Pessoa {
		private Long id_usuario;
		private String usuario;
		private String Senha;
		
		
		public Usuario(model.Endereco endereco, String nome, String cpf,
				String rg, String sexo, Date dt_Nasc, Long id_usuario,
				String usuario, String senha) {
			super(endereco, nome, cpf, rg, sexo, dt_Nasc);
			this.id_usuario = id_usuario;
			this.usuario = usuario;
			Senha = senha;
		}
		public Usuario(){
			
		}
		public Long getId_usuario() {
			return id_usuario;
		}
		public void setId_usuario(Long id_usuario) {
			this.id_usuario = id_usuario;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getSenha() {
			return Senha;
		}
		public void setSenha(String senha) {
			Senha = senha;
		}

}
