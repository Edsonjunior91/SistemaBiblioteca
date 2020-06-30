package model;

public class Produto {
	int id_produto;
	String nome, descricao, codBar;
	Double valor;
	Integer estoque;
	
	
	public Produto(int id_produto, String nome, String descricao,
			String codBar, Double valor, Integer estoque) {
		super();
		this.id_produto = id_produto;
		this.nome = nome;
		this.descricao = descricao;
		this.codBar = codBar;
		this.valor = valor;
		this.estoque = estoque;
	}
	public Produto(){
		
		
	}
	public int getId_produto() {
		return id_produto;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodBar() {
		return codBar;
	}
	public void setCodBar(String codBar) {
		this.codBar = codBar;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
}
