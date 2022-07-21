package br.com.turmajava.collections2;

import java.util.ArrayList;

public class TestaAula {
	
	public static void main(String[] args) {
		
	
	Aula a1 = new Aula("português", 60);
	Aula a2 = new Aula("Matemática", 120);
	Aula a3 = new Aula("História", 60);
	
	//Essa lista vai ser baseada na minha lista, tanto string quanto in ou qualquer outra variável.
	
	ArrayList<Aula> minhasAulas = new ArrayList<>();
	
	minhasAulas.add(a1);
	minhasAulas.add(a2);
	minhasAulas.add(a3);
	
	System.out.println(minhasAulas);
	
	
	}

}
