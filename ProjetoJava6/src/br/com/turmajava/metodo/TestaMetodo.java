package br.com.turmajava.metodo;

//Nossa classe.
public class TestaMetodo {
	
	//Essas são as variáveis globais que ficam dentro da minha classe, e pode ser usada em toda a minha classe.
	static int numero3, numero4, multiplicacao, divisao; 
	
	//Nosso método principal, usado para nosso projeto rodar.
	public static void main(String[] args) {
		
		metodo01();      //Essas são as chamadas de métodos.
		metodo02();
		metodo03();
		//metodo04()
		metodo05();
		metodo06(20,5);  //Estes são os argumentos para podermos fazer o calculo dentro do nosso método
		System.out.println("Resultado da divisão do método 06: " + divisao);
		
		//Chamada do nosso método 07, que esta em outra classe.
		System.out.println("Resultado do métodoFora, método 07: " + MetodoFora.metodo07(0, 10));
	}

	public static void metodo01() { //O nome do método é sempre verbp(calcular, somar, multiplicar, deletar).
		System.out.println("Olá sou o método 01!");
	}
	
	public static void metodo02() {
		int numero1 = 10, numero2 = 30, soma; //Essas são variáveis locais, ficam dentro do método.
		soma = numero1 + numero2;  //Parra esse método rodar, sempre precisao fazer a chamada dentro da main.
		System.out.println("Resultado da soma do método 02: " + soma);
	}
	
	public static void metodo03() { 
		int numero1 = 100, numero2 = 100, subtracao; //Cada bloco é um bloco, então posso repetir o nome das várivesis nos blocos.
		subtracao = numero1 - numero2;
		System.out.println("Resultado da subtração do método 03: " + subtracao);
	}
	
	public static void metodo04() {
		numero3 = 8; numero4 = 5;
		multiplicacao = numero3 * numero4;
		//Mesmo que o resultado esteja no código abaixo, preciso rodar este método para ele poder rodar e fazer o cálculo.
	}
	
	public static void metodo05() {
		metodo04();
		System.out.println("Resultado do método 05 é a multiplicação que esta no metodo 04: " + multiplicacao);
	}
	
	public static void metodo06(int numero5, int numero6) { //Parâmetros.
		divisao = numero5 / numero6;
		//Imprimi o resultado deste método lá no método main.
	}
	
}
