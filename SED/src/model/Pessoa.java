package model;

import java.sql.Date;

public class Pessoa {
	private int Id_pessoa;
	private Endereco Endereco;
	private String Nome;
	private String cpf;
	private String rg;
	private String Sexo;
	private Date dt_Nasc;


	public Pessoa(model.Endereco endereco, String nome, String cpf, String rg,
			String sexo, Date dt_Nasc) {
		super();
		Endereco = endereco;
		Nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		Sexo = sexo;
		this.dt_Nasc = dt_Nasc;
		Id_pessoa = getId_pessoa();
	}
	
	public Pessoa(){
		
	}
	public int getId_pessoa() {
		return Id_pessoa;
	}

	public void setId_pessoa(int i) {
		Id_pessoa = i;
	}
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public Date getDt_Nasc() {
		return dt_Nasc;
	}

	public void setDt_Nasc(Date dt_Nasc) {
		this.dt_Nasc = dt_Nasc;
	}

	public Endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}

	
}
