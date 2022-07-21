package br.com.turmajava.collections3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		
		System.out.println("Quantos alunos você deseja adicionar: ");
		int numeroAlunos = entrada.nextInt();
		
		for (int i = 0; i < numeroAlunos; i++) {
			System.out.println("Digite a idade do aluno: ");
			int idade = entrada.nextInt();
			entrada.nextLine(); //na mesma rodada eu preciso pegar o nome(pular uma linha e abaixo pegar o nome.
			
			System.out.println("Digite o nome do aluno: ");
			String nome = entrada.next();// na mesma rodada preciso pegar o nome
		
			listaAlunos.add(new Aluno(idade, nome));
		
		}
		//Imprimir a lista de alunos que vamos informar no console.
		for (Aluno i : listaAlunos) {
			System.out.println(i);
		}
	entrada.close();	
	}

}
