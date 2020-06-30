package model;

import java.sql.Date;

public class Fornecedor extends Pessoa {
	
	private Long id_forn;
	private String razaoSocial;
	private String Fantasia;
	private String CNPJ;
	private String Insc_Est;
	private Date dataCriacao;
	private Date dataCadastro;
	private String telefone;
	
	
	
	
	public Fornecedor(Long id_forn, String razaoSocial, String fantasia,
			String cNPJ, String insc_Est, Date dataCriacao,
			Date dataCadastro, String telefone ) {
		
		this.id_forn = Long.valueOf(id_forn);
		this.razaoSocial = razaoSocial;
		Fantasia = fantasia;
		CNPJ = cNPJ;
		Insc_Est = insc_Est;
		this.dataCriacao = dataCriacao;
		this.dataCadastro = dataCadastro;
		this.telefone = telefone;
	}
	public Fornecedor(){
		
		
	}
	public Long getId() {
		return id_forn;
	}
	public void setId(Long id) {
		this.id_forn = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getFantasia() {
		return Fantasia;
	}
	public void setFantasia(String fantasia) {
		Fantasia = fantasia;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cnpj) {
		CNPJ = cnpj;
	}
	public String getInsc_Est() {
		return Insc_Est;
	}
	public void setInsc_Est(String insc_Est) {
		Insc_Est = insc_Est;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
