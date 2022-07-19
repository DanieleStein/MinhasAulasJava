package br.com.turmajava.sobrecargametodo;

public class Sobrecarga {
	
	public static void main(String[] args) {
		
		linha('x', 10);
		linha('x');
		linha();
		linha("x", 40);
		
	}
	//Só mudamos a forma que os argumentos estão sendo tratados dentro do método.
	
	public static void  linha(char tipo, int tamanho) {
		System.out.println("1º versão: ");
		
		for (int i = 0; i <= tamanho; i++) {
			System.out.printf("%c" , tipo);
		}
		System.out.println();
	}
	
	public static void  linha(char tipo) {
		System.out.println("2º versão: ");
		
		for (int i = 0; i <= 20; i++) {
			System.out.printf("%c" , tipo);
		}
		System.out.println();
	}
	
	public static void  linha() {
		System.out.println("3º versão: ");
		
		for (int i = 0; i <= 30; i++) {
			System.out.print("x");
		}
		System.out.println();
	}
	
	public static void  linha(String tipo, int tamanho) {
		System.out.println("4º versão: ");
		
		for (int i = 0; i <= tamanho; i++) {
			System.out.printf("%s" , tipo);
		}
		System.out.println();
	}

}
