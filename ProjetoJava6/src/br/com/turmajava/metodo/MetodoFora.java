package br.com.turmajava.metodo;

public class MetodoFora {
	
	//Este é o nosso método 07, e a chamada dele vai ser dentro da main que esta na classe TestaMetodo.
	public static String metodo07(int i, int f) {
		String numeroString = "";       //Var vazia
		for (int c = i; c <= f; c++) {
			numeroString += c + " | ";
		//Como o método é uma String e os parâmetros números, o código pede um return de String. Por isso usamos um return.
		}
		return numeroString;
		//Esse resultado será em String, e não poderá ser usado para fazer cálculos.
	}

}
