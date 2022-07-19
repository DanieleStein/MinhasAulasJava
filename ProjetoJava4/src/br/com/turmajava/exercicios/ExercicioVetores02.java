package br.com.turmajava.exercicios;

import java.util.Random;

public class ExercicioVetores02 {
	
	public static void main(String[] args) {
		
		int[] lancamentos = new int[10];
		Random r = new Random();
		int quantidade = 0;
		
		for (int i = 0; i < lancamentos.length; i++) {
			lancamentos[i] = r.nextInt(6);
			System.out.println(lancamentos[i]);
			quantidade = quantidade + lancamentos[i];	
		
		}
	
	}

}
