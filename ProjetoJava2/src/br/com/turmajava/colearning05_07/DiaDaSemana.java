package br.com.turmajava.colearning05_07;

import java.util.Scanner;

public class DiaDaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe em número, qual é o seu dia da semana favorito?");
		int numeroDia = entrada.nextInt();
		
		String dia = numeroDia == 1 ? "Domingo" :
			         numeroDia == 2 ? "Segunda-feira" :
			         numeroDia == 3 ? "Terça-feira"   :
			         numeroDia == 4 ? "Quarta-feira"  :
			         numeroDia == 5 ? "Quinta-feira"  :
			         numeroDia == 6 ? "Sexta-feira"   :
			         numeroDia == 7 ? "Sábado"  :
			        	 "Dia Inválido!";
		
		System.out.println(dia);
		
	entrada.close();	
	}

}
