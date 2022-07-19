package br.com.turmajava.sobrecargametodo;

public class TestaMinhaCalculadora {
	
	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		//Aqui ele vai identificar em qual dos três métodos ele deve utilizar para fazer os cáculos abaixo
		//de acordo com a assinatura (a junção do nome do método com os parametros do método(soma+int numero1, numero2)).
		System.out.println(MinhaCalculadora.soma(10, 10)); //Parou de dar o erro que esta dando nos abaixo.
		System.out.println(calc.soma(10, 20.50));
		System.out.println(calc.soma(10, 20.50, 10.4));
		
	}

}
