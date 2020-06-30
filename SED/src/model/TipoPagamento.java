package model;

public class TipoPagamento {
	private int id_pagament = 0;
	private String nome_pag;
	
	
	public TipoPagamento(int id_pagament, String nome_pag) {
		super();
		this.id_pagament = id_pagament;
		this.nome_pag = nome_pag;
	}
	public TipoPagamento(){
		
	}
	public int getId_pagament() {
		return id_pagament;
	}
	public void setId_pagament(int id_pagament) {
		this.id_pagament = id_pagament;
	}
	public String getNome_pag() {
		return nome_pag;
	}
	public void setNome_pag(String nome_pag) {
		this.nome_pag = nome_pag;
	}
	
	@Override
	public String toString() {
		return  nome_pag ;
	}
}
