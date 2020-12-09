package com.gontijo.cruddisciplinas.dominio;

public class Disciplina {
	public Integer id, periodo;
	public String nome, professor, codigo;
	
	public Disciplina() {
		super();
	}

	public Disciplina(Integer id, Integer periodo, String nome, String professor, String codigo) {
		super();
		this.id = id;
		this.periodo = periodo;
		this.nome = nome;
		this.professor = professor;
		this.codigo = codigo;
	}
	
	public Disciplina(Integer periodo, String nome, String professor, String codigo) {
		super();
		this.periodo = periodo;
		this.nome = nome;
		this.professor = professor;
		this.codigo = codigo;
	}

}
