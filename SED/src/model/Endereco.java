package model;

public class Endereco {
	private String rua;
	private String bairro;
	private String estado;
	private String cidade;
	private String numero;
	private String cep;
	private String logradouro;
	
	
	public Endereco(String rua, String bairro, String estado,
			String cidade, String numero, String cep,
			String logradouro) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.estado = estado;
		this.cidade = cidade;
		this.numero = numero;
		this.cep = cep;;
		this.logradouro = logradouro;
	}
	public Endereco(){
		
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

}
