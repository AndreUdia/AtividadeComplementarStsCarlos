package br.com.complementar.atividade.model.domain;

import java.util.Calendar;
import java.util.Date;

public class LancamentoAtividade {


	private int codigo;
	private int quantidadeHoras;
	private Date dataInicio;
	private Date dataFim; 
	private Aluno aluno;
	private Atividade atividade;
	
	public String getSemestreAtividade() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataFim);
		int ano = calendar.get(Calendar.YEAR);
		int mes = calendar.get(Calendar.MONTH);
		return mes > 5 ? (ano + "-2") : (ano + "-1");
	}
}

