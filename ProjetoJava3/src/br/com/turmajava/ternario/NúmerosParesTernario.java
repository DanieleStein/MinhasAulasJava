package br.com.turmajava.ternario;

import java.util.Scanner;

public class NúmerosParesTernario {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 
		int numeros = 0;
		int pares = 0;
		
		
		System.out.println("Informe os números: ");
		for (int i = 0; i < 10; i ++) {
			numeros = entrada.nextInt();
			
			if(numeros % 2 == 0 ? true : false) {
				pares++;
				
			}
			
			
		}
		System.out.println("Quantidade de números pares: " + pares); // colocar ele fora do for para não aparecer a mensagem toda a hora do loop
	
		entrada.close();	
		}
		
		
		
	}

