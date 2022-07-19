package br.com.turmajava.variaveis;

public class ExemploVariavel02 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		int x = 10;
		double d = 20.0; // var double recebe um valor inteiro, e ele mesmo poe o ponto.
		long l = x;
		int w = 1;
		
		System.out.println(d);
		
		double valorDouble = 29.99; 
		int valorInt = (int) valorDouble; // como o int aceita só numeros inteiros ele perde os depois do ponto.
		
		System.out.println(l * w);
		
		System.out.println(valorInt);
		

	}

}
