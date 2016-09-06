package br.com.keepinshape;

public class Exercicio {
	
	private Integer _id;
	private String nome;
	private int tempo;
	private float peso;
	private int quantidade;
	private double pontuacao;
	
	public Exercicio(Integer _id, String nome, int tempo, float peso, int quantidade, double pontuacao) {
		super();
		this._id = _id;
		this.nome = nome;
		this.tempo = tempo;
		this.peso = peso;
		this.quantidade = quantidade;
		this.pontuacao = pontuacao;
	}
	
	public Integer get_id() {
		return _id;
	}
	public String getNome() {
		return nome;
	}
	public int getTempo() {
		return tempo;
	}
	public float getPeso() {
		return peso;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public double getPontuacao() {
		return pontuacao;
	}
	
	

}
