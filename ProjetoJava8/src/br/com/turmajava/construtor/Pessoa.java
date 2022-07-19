package br.com.turmajava.construtor;

public class Pessoa {
	
	String nome;
	int idade;
	
	//contrutor de classe inicializar.
	Pessoa( String n, int i) {
		System.out.println("Eu sou o construtor da classe pessoa!");
		this.nome = n;
		idade = i;
	}

}
