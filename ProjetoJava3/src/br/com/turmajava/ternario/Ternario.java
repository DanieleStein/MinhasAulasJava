package br.com.turmajava.ternario;

import java.util.Scanner;

public class Ternario {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número 1:");
		int numero1 = entrada.nextInt();
		
		System.out.println("Informe o número 2:");
		int numero2 = entrada.nextInt();
		
		int maior = 0;
		
		maior = numero1 > numero2 ? numero1 : numero2;
		//numero 1 é maior que numero 2 ?(se for) verdadeiro maior recebe 1, se for falso maior recebe 2
		//teste ? resultado verdade : resultado falso
		
		System.out.println("Valor: " + maior*10);
		
		
	entrada.close();	
	}

}
