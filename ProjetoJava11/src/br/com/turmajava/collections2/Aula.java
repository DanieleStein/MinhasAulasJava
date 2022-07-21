package br.com.turmajava.collections2;

public class Aula {
	
	//Atributos
	private String titulo;
	private int tempo;
	
	//Nosso construtor pode nascer sem parâmetro também, e lá na classe teste, não precisa passar as informações dentro do nosso objeto.
	//public Aula() {
		
	//}
	
	//Construtor
	public Aula(String titulo, int tempo) {
		super();   //Super classe, uma referencia ao objeto(classe master)
		this.titulo = titulo;
		this.tempo = tempo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getTempo() {
		return tempo;
	}


	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	//toString vai fazer a impressão dos dados que estão na nossa lista. Mas eles não podem ser usados para cálculo, ai vamos ter que fazer com outro método.
	public String toString() {
		return "Aula: " + this.titulo + " | " + this.tempo + " minutos";
	}
	

}
