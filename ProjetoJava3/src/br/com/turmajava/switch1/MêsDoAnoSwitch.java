package br.com.turmajava.switch1;

import java.util.Scanner;

public class MêsDoAnoSwitch {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite em forma de número em que mês estamos:");
		int mes = entrada.nextInt();
		
		
		// usuário informa o número e aparece qual o mês referente a ele.
		/*
		if(mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes ==11) {
			System.out.println("Novembro");
		} else if (mes == 12) {
			System.out.println("Dezembro");
		} else {
			System.out.println("Número inválido");
		}
		**/
		
		
		// usuario informa mês em número, e retorna qual mês se refere
		switch (mes) {
			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereiro");
				break;
			case 3:
				System.out.println("Março");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Maio");
				break;
			case 6:
				System.out.println("Junho");
				break;
			case 7:
				System.out.println("Julho");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Setembro");
				break;
			case 10:
				System.out.println("Outubro");
				break;
			case 11:
				System.out.println("Novembro");
				break;
			case 12:
				System.out.println("Dezembro");
				break;
			default:
				System.out.println("Mês inválido!");
				break;
		}
		
	entrada.close();	
	}

}


		
