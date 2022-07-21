package br.com.turmajava.construtor;

//Nossa classe.
public class Pessoa {
	
	//Nossos atributos(características).
	//OBS:é bem comum vermos os atributos, sempre na classe.
	String nome;
	int idade;
	
	//Contrutor de classe.
	//O nome da classe + () {}
	//OBS:Não preciso fazer o construtor em todos os projetos, só quando precisar que o objeto inicialize com valores dentro atributos.
	Pessoa( String n, int i) { //Estes atributos, para podermos usar o Scanner na nossa classe main.
		System.out.println("Eu sou o construtor da classe pessoa!");
		this.nome = n;  //Declarando que o n e o i, são nome e idade.
		this.idade = i;
		
		//nome = "Daniele";//Podemos fazer desse forma quando já temos as informações, e só imprimir lá na nossa classe main, através do objeto.
		//idade = 30;
	}

}
