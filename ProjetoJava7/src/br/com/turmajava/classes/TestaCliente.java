package br.com.turmajava.classes;

import java.util.Scanner;

public class TestaCliente {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		Cliente cl1 = new Cliente();
		
		cl1.setNomeCliente("");
		cl1.setSexoCliente(' ');
		cl1.setIdadeCliente(0);
		
		
		
		
		System.out.print("Informe seu nome: ");
		cl1.setNomeCliente(entrada.next());
		
		System.out.print("Informe seu sexo (F) Feminino, (M) Masculino: ");
		cl1.setSexoCliente(entrada.next().charAt(0));
		
		System.out.print("Informe sua idade: ");
		cl1.setIdadeCliente(entrada.nextInt());
		
		System.out.println();
		
		cl1.abrir();
		
		
		System.out.println(cl1.getNomeCliente() + ", obrigado por nos escolher como seu parceiro, estaremos sempre a disposição!" );
		
		entrada.close();
	}
}

