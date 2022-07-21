package br.com.turmajava.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {
	
	public static void main(String[] args) {
		
		//Collections é um objeto que serve para armazenar muitos elementos.
		
		String aula1 = "A-Code Tank";
		String aula2 = "1-SpringBoot";
		String aula3 = "B-Java - Mobile";
		String aula4 = "C-Java Redes";
		
		//Essa é uma biblioteca como o Scanner um (objeto).String é o tipo de dado que vai dentro da lista.
		//(Diamante<>)
		//Como estamos trabalhando com listas, vetor, ele vai ter as mesmas posições(Começa de 0).
		//Aqui ele vai adicionar e tirar, sempodermos estipular um tamanho nele.
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1); // adicionando a String em aulas.
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		//System.out.println(aulas);
		
		//aulas.remove(2);//remover um item do array.
		//Quando um item é removido, o próximo da lista fica na posição dele.
		//System.out.println(aulas);
		
		//System.out.println(aulas.get(2)); //Mostra qual item esta na posicão.
		
		
		//For each: para percorrer a lista, criamos uma variavel tipo String (no mesmo tipo da nossa lista)para pegar a lista inteira.
		//for(String i : aulas) {
		//	System.out.println(i); //Ela trás o resultado que é a lista completa.	
		//}
		
		//System.out.println(aulas.get(0));
		
	    //String aulaQualquer = aulas.get(3);
		//System.out.println(aulaQualquer);
		
		//aulas.size() percorrer o array. O aulas.get(i) mostra os itens 1 por 1.
		//for (int i = 0; i < aulas.size(); i++) {
		//	System.out.println(aulas.get(i));
		//}
		
		//Para saber o tamanho do nosso array.
		System.out.println(aulas.size());
		
		Collections.sort(aulas);//Sort vai trazer a nossa lista de forma ordenada crescente(A-Z) Mas se tiver números ele vai colocar o número na frente as letras!
		System.out.println(aulas);
		
		Collections.reverse(aulas);//Reverse em ordem decrescente.
		System.out.println(aulas);
		
		Collections.shuffle(aulas);//Lista embaralhada, de forma desordenada.
		System.out.println(aulas);
	}

}
