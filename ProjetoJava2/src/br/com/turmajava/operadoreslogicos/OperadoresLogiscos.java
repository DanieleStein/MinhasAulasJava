package br.com.turmajava.operadoreslogicos;

public class OperadoresLogiscos {

	public static void main(String[] args) {
	
		//&& --> e
		//|| --> ou
		//^  --> ou exclusivo
		//!  --> not
		
		int idade = 20;
		boolean precisaVotar = idade >= 18 && idade < 70; // Ambas deverão ser verdadeiras para dar true.
		System.out.println(precisaVotar);
		
		int nrAmarelo = 2, nrVermelho = 1;
		boolean suspenso = nrAmarelo == 0 || nrVermelho == 7; // Só um pode ser verdadeiro para dar true.
		System.out.println(suspenso);
		
		int x = 11, y = 8;
		boolean teste = x > 10 ^ y > 10;
		System.out.println(teste);
		
		int idade1 = 20;
		boolean maior1Idade = !(idade1 >= 18);
		System.out.println(maior1Idade);
		
		
		
		
		
		
		

	}

}
