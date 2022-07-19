package br.com.turmajava.colearning05_07;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Didite o primeiro número:");
		float numero1 = entrada.nextFloat();
		
		System.out.println("Digite qual operação matemática deseja resolver:");
		char operacao = entrada.next().charAt(0);
		
		System.out.println("Digite o segundo número:");
		float numero2 = entrada.nextFloat();
		
		float resultado = 0;
		
		switch (operacao) {
		
		case '+':
			resultado = numero1 + numero2;
			System.out.println("Soma: " + resultado);
			break;
		case '-':
			resultado = numero1 - numero2;
			System.out.println("Subtração: " + resultado);
			break;
		case '*':
			resultado = numero1 * numero2;
			System.out.println("Multiplicação: " + resultado);
			break;
		case '/':
			resultado = numero1 / numero2;
			System.out.println("Divisão: " + resultado);
			break;
		case '%':
			resultado = numero1 % numero2;
			System.out.println("Resto da Divisão: " + resultado);
			break;
		default:
			System.out.println("Opção inválida!");
			break;	
			
		}
		entrada.close();
		
		
	}

}
