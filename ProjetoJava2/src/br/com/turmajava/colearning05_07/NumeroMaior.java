package br.com.turmajava.colearning05_07;

import java.util.Scanner;

public class NumeroMaior {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número:");
		int numero2 = entrada.nextInt();
		
		int numeroMaior = 0;
		
		numeroMaior = numero1 > numero2 ? numero1 : numero2;
		System.out.println("O número " + numeroMaior + " é o maior entre o primeiro e segundo número!");
		
	entrada.close();	
	}
	
}
