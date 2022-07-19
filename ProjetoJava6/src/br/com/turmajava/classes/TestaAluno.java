package br.com.turmajava.classes;

public class TestaAluno { // Classe.
	
	public static void main(String[] args) { //Método main
		
		//Isso também é conhecido como instanciar o objeto(criar).
		//Meu new construtor.
		Aluno al1 = new Aluno(); // Meu objeto referente a classe Aluno.
		
		//Podemos criar um segundo objeto com os mesmos atributos, alterando as informações.
		Aluno al2 = new Aluno();
		
		al1.nome = "Daniele"; //Usando os astributos da nossa classe aluno, para modificar.
		al1.idade = 30;
		al1.curso = "Java Puro";
		
		System.out.println("Meu nome: " + al1.nome);
		System.out.println("Minha idade: " + al1.idade);
		System.out.println("Meu curso: " + al1.curso);
		al1.estudar(); //Chamada de método.
		
		System.out.println();
		
		al2.nome = "Lívia"; //Usando os astributos da nossa classe aluno, para modificar.
		al2.idade = 2;
		al2.curso = "Escolinha";
		
		System.out.println("Nome: " + al2.nome);
		System.out.println("Idade: " + al2.idade);
		System.out.println("Curso: " + al2.curso);
		al2.estudar();
		
	}

}
