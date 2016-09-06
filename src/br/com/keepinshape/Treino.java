package br.com.keepinshape;

import java.util.ArrayList;
import java.util.Collection;

public class Treino {
	
	private String nome;
	private String tipo;
	private String diaSemana;
	private Collection<Exercicio> exercicios;
	private double pontosTotal;
	private double pontosMaximo;
	
	public Treino(String nome, String tipo, String diaSemana, double pontosTotal,
			double pontosMaximo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.diaSemana = diaSemana;
		this.exercicios = new ArrayList<>();
		this.pontosTotal = pontosTotal;
		this.pontosMaximo = pontosMaximo;
	}
	
	public void adicionarExercicio(final Exercicio exercicio){
		exercicios.add(exercicio);
	}
	
	public void removerExercicio(final Exercicio exercicio){
		for (Exercicio ex : exercicios) {
			if(ex.equals(exercicio)){
				exercicios.remove(exercicio);
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public Collection<Exercicio> getExercicios() {
		return exercicios;
	}

	public double getPontosTotal() {
		return pontosTotal;
	}

	public double getPontosMaximo() {
		return pontosMaximo;
	}
	
	

}
