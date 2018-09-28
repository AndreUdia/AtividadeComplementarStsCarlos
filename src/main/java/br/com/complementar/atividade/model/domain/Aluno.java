package br.com.complementar.atividade.model.domain;

public class Aluno {
	
	private String ra;
	private String nome;
	
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aluno(String ra, String nome) {
		super();
		this.ra = ra;
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
