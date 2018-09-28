package br.com.complementar.atividade.model.domain;

public class Atividade {
	
	private int codigo;
	private String nome;
	private int percentualCargaHoraria;
	private int maximoAtividadesSemestre;
	private int percentualPorAtividade;
	
	public Atividade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Atividade(int codigo, String nome, int percentualCargaHoraria, int maximoAtividadesSemestre,
			int percentualPorAtividade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.percentualCargaHoraria = percentualCargaHoraria;
		this.maximoAtividadesSemestre = maximoAtividadesSemestre;
		this.percentualPorAtividade = percentualPorAtividade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPercentualCargaHoraria() {
		return percentualCargaHoraria;
	}

	public void setPercentualCargaHoraria(int percentualCargaHoraria) {
		this.percentualCargaHoraria = percentualCargaHoraria;
	}

	public int getMaximoAtividadesSemestre() {
		return maximoAtividadesSemestre;
	}

	public void setMaximoAtividadesSemestre(int maximoAtividadesSemestre) {
		this.maximoAtividadesSemestre = maximoAtividadesSemestre;
	}

	public int getPercentualPorAtividade() {
		return percentualPorAtividade;
	}

	public void setPercentualPorAtividade(int percentualPorAtividade) {
		this.percentualPorAtividade = percentualPorAtividade;
	}

	
	public Integer getValorLimiteHorasAtividade(Integer totalHorasComplementares) {
		return totalHorasComplementares * percentualPorAtividade / 100;
	}
	
	public Integer getHorasAproveitadasPorAtividade(Integer totalHorasComplementares) {
		return getValorLimiteHorasAtividade(totalHorasComplementares) * percentualCargaHoraria / 100;
	}
	
}
