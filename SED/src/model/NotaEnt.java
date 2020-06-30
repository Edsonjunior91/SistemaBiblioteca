package model;

import java.util.Date;

public class NotaEnt {
	private int id_nota;
	private String cod_ver;
	private Date data_emiss;
	private Date data_receb;
	private double valor_nota;
	private double valor_produto;
	private String serie;
	
	
	private Date venc;
	private int tipo_pag;
	private String numero;
	private String cnpj;
	

	

	public NotaEnt(int id_nota, String cod_ver, Date data_emiss, Date data_receb,
			double valor_nota, Date venc,int tipo_pag, String numero, double valor_produto, String serie, String cnpj) 
	{
		super();
		this.id_nota = id_nota;
		this.cod_ver = cod_ver;
		this.data_emiss = data_emiss;
		this.data_receb = data_receb;
		this.valor_nota = valor_nota;
		this.venc = venc;
		this.tipo_pag = tipo_pag;
		this.numero = numero;
		this.valor_produto = valor_produto;
		this.serie = serie;
		this.cnpj = cnpj;
	}
	
	public NotaEnt(){
		
	}
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
	public double getValor_produto() {
		return valor_produto;
	}

	public void setValor_produto(double valor_produto) {
		this.valor_produto = valor_produto;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public int getId_nota() {
		return id_nota;
	}
	public void setId_nota(int id_nota) {
		this.id_nota = id_nota;
	}
	public String getCod_ver() {
		return cod_ver;
	}
	public void setCod_ver(String cod_ver) {
		this.cod_ver = cod_ver;
	}
	public Date getData_emiss() {
		return data_emiss;
	}
	public void setData_emiss(Date data_emiss) {
		this.data_emiss = data_emiss;
	}
	public Date getData_receb() {
		return data_receb;
	}
	public void setData_receb(Date data_receb) {
		this.data_receb = data_receb;
	}
	public double getValor_nota() {
		return valor_nota;
	}
	public void setValor_nota(double valor_nota) {
		this.valor_nota = valor_nota;
	}
	public Date getVenc() {
		return venc;
	}
	public void setVenc(Date venc) {
		this.venc = venc;
	}
	public int getTipo_pag() {
		return tipo_pag;
	}
	public void setTipo_pag(int tipo_pag) {
		this.tipo_pag = tipo_pag;
	}
	
	
}
