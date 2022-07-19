package br.com.turmajava.exemplowhile;

import java.util.Scanner;

public class While02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		while (numero != 10) {
			System.out.print("Informe sua idade: ");
			numero = entrada.nextInt();
			
			if(numero >= 18 && numero < 70) {
				System.out.println("Pode votar!");
			} else if (numero >= 16) {
				System.out.println("Voto opcional!");
			} else {
				System.out.println("Você pode votar ainda!");
			}
		}
		entrada.close();	
	}

}
