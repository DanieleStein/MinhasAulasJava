package br.com.turmajava.exemplovetores;

public class Vetor01 {
	
	public static void main(String[] args) {
		
		int[] arrayVetor = new int[10]; // vai de 0 a 9 posicões
		
		arrayVetor[5] = 250;
		
		
		int x = 632;
		arrayVetor[7] = x;
		
		
		arrayVetor[2] = 1000;
		int y = arrayVetor[2];
		
		
		for (int i = 0; i < arrayVetor.length; i++) {
		System.out.println(i + " - " + arrayVetor[i]);
		}
		System.out.println(y);
	}

}
