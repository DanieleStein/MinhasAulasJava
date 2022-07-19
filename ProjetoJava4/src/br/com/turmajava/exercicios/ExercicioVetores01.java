package br.com.turmajava.exercicios;

import java.util.Arrays;

public class ExercicioVetores01 {
	
	public static void main(String[] args) {
		
		
		double[] pontuacao = {1.5, 5.7, 3.5, 4.2, 2.0};
		
		Arrays.sort(pontuacao); // Pega o menor valor e poe na primeira posicao
		int tamanho = pontuacao.length;
		System.out.println(pontuacao[tamanho -1]);
	}

}
