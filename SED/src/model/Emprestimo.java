package model;

import java.util.Date;

public class Emprestimo {
	private Long id_emprestimo;
	private String nome;
	private String cpf;
	private Date datEmprest;
	private Date datDevolu;
	private Integer quantidade;
	
	
	public Emprestimo(Long id_emprestimo, String nome, String cpf,
			Date datEmprest, Date datDevolu, Integer quantidade) {
		super();
		this.id_emprestimo = id_emprestimo;
		this.nome = nome;
		this.cpf = cpf;
		this.datEmprest = datEmprest;
		this.datDevolu = datDevolu;
		this.quantidade = quantidade;
	}
	public Emprestimo(){
		
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Long getId_emprestimo() {
		return id_emprestimo;
	}
	public void setId_emprestimo(Long id_emprestimo) {
		this.id_emprestimo = id_emprestimo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDatEmprest() {
		return datEmprest;
	}
	public void setDatEmprest(Date datEmprest) {
		this.datEmprest = datEmprest;
	}
	public Date getDatDevolu() {
		return datDevolu;
	}
	public void setDatDevolu(Date datDevolu) {
		this.datDevolu = datDevolu;
	}
	
}
