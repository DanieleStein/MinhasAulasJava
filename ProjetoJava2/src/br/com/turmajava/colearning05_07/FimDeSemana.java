package br.com.turmajava.colearning05_07;

import java.util.Scanner;

public class FimDeSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe em forma de número seu dia favorito da semana:");
		int diaSemana = entrada.nextInt();
		
		
		switch (diaSemana) {
		
		case 1:
		case 7:
			System.out.println("Seu dia favorito é no final de semana!");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Seu dia favorito é no dia de semana!");
			break;
		default:
			System.out.println("Dia inválido, tente novamente!");
			
		}
	entrada.close();	
	}

}
