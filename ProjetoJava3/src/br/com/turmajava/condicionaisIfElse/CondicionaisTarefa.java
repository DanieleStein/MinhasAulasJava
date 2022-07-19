package br.com.turmajava.condicionaisIfElse;

import java.util.Scanner;

public class CondicionaisTarefa {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe primeiro número: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Informe segundo número");
		int num2 = entrada.nextInt();
		
		System.out.println("Informe terceiro número");
		int num3 = entrada.nextInt();
		
		
		// Informar o maior número
		if (num1 > num2 && num1 > num3) {
			System.out.println("Primeiro Maior!");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Segundo Maior!");
		} else {
			System.out.println("Terceiro Maior");
		}
		
	entrada.close();	
	}

}
