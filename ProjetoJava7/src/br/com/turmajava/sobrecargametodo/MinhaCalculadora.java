package br.com.turmajava.sobrecargametodo;

public class MinhaCalculadora {
		
	
	    //Os três métodos tem o mesmo nome, porém com alteração de parametos e atributos.
		public static int soma (int numero1, int numero2) {
			System.out.println("Inteiro: ");
			return numero1 + numero2;
		}
		//Assinatura do método, é a juncão do nome dos métodos com os parâmetros.
		public static double soma (double numero1, double numero2) {
			System.out.println("Double: ");
			return numero1 + numero2;
		}
		
		public static double soma (double numero1, double numero2, double numero3) {
			System.out.println("Double, 3 números: ");
			return numero1 + numero2 + numero3;
		}

}
