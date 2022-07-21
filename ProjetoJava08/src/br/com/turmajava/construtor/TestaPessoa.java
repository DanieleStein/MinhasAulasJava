package br.com.turmajava.construtor;

import java.util.Scanner;

public class TestaPessoa {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = entrada.next();
		
		System.out.print("Informe a idade: ");
		int idade = entrada.nextInt();
		
		//Meu objeto esta puxando o meu construtor, e o que tiver dentro dele, ele vai inicializar.
		Pessoa p1 = new Pessoa(nome, idade);
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
		
		//Se eu tiver um segundo objeto, se referindo a mesma classe, ele puxará também todas as informações que estão no meu construtor.
		Pessoa p2 = new Pessoa("Daniele", 20);//Posso também já colocar o nome aqui, porque lá no construtor eu já declarei os parâmetros.
		
		System.out.println(p2.nome + " " + p2.idade);
		
	entrada.close();	
	}

}
