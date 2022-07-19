package br.com.turmajava.exemplodowhile;

import java.util.Scanner;

public class DoWhile02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new  Scanner(System.in);
		
		int i = 0;
		
		do {
			
			System.out.println("Entre com o número 1: ");
			int num1 = entrada.nextInt();
			
			System.out.println("Entre com o número 2: ");
			int num2 = entrada.nextInt();
			
			if (num2 == 0) {
			System.out.println("Não pode dividir por 0.");
			continue; // ele vai ver que é zero, mas vai continuar o programa.
			}
			
			System.out.println((i+1) + "º resultado: " + num1 + "/" + num2 + ": " + (num1/num2));
			i++;
		} while (i < 3);
		System.out.println("Fim do programa!");
	entrada.close();	
	}

}
