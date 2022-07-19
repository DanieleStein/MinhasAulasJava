package br.com.turmajava.operadoresaritmeticos;

public class OperadoresAritmeticos {

	public static void main(String args[]) {
		
		double x = 10;
		double y = 3;
		double resultado;
		
		resultado = x + y;
		System.out.println("Soma: " + resultado);
		
		resultado = x - y;
		System.out.println("Subtração: " + resultado);
		
		resultado = x * y;
		System.out.println("Multiplicação: " + resultado);
		
		resultado = x / y;
		System.out.println("Divisão: " + resultado); // %.2f ele deixa só duas casas depois da virgula.No lugar do mais+ usa a ,virgula
		
		resultado = x % y;
		System.out.println("Resto da Divisão: " + resultado);
		
		
		

	}

}
