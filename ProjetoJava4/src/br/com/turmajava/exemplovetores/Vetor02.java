package br.com.turmajava.exemplovetores;

import java.util.Scanner;

public class Vetor02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tamanho do Vetor: ");
		int tamanhoVetor = entrada.nextInt();
		
		
		double[] notas = new double[tamanhoVetor]; // posição 0...3 // Podemos tanto colocar o tamanho, como fazer dessa forma do usuario colocar o tamnho.
		double soma = 0.0, media = 0.0;
		
		System.out.println("Digite as notas dos alunos: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.print(i+1 + "ºnota: ");     // i+1 é para aprecer (1º) no texto la embaixo
			notas[i] = entrada.nextDouble();
			soma += notas[i];
			media = soma / notas.length;
			
		}
		System.out.println("Soma das notas do aluno: " + soma);
		System.out.printf("Média das notas do aluno: %.2f" , media); //%.2f deixar so duas casas depois da virgula
	
	entrada.close();
	}
}
