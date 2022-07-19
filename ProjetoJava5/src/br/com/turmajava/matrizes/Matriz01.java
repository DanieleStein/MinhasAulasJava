package br.com.turmajava.matrizes;

import java.util.Scanner;

public class Matriz01 {
	
	public static void main(String[] args) {
		
		//Declaracao de matriz
		
		
		double[][]notasAlunos = new double[2][4]; //quantidade de linhas[2] e colunas[4] da matriz
		Scanner entrada = new Scanner(System.in);
		
		
		notasAlunos[0][0] = 9.9;    // linha 0, coluna 0
		notasAlunos[0][1] = 8.8;    // linha 0, coluna 1
		notasAlunos[0][2] = 9.9;    // linha 0, coluna 2
		notasAlunos[0][3] = 8.8;    // linha 0, coluna 3
		
		notasAlunos[1][0] = 7.8;    // linha 1, coluna 0
		notasAlunos[1][1] = 3.8;    // linha 1, coluna 1
		notasAlunos[1][2] = 4.9;    // linha 1, coluna 2
		notasAlunos[1][3] = 2.8;    // linha 1, coluna 3
		
		
		// adicionando valores nas matrizes
		for (int l = 0; l < notasAlunos.length; l++) {         // laco para as linhas
			for(int c = 0; c < notasAlunos[l].length; c++) {   // laco para colunas
				System.out.printf("Digite as notas: [%d] [%d]:" , l,c);
				notasAlunos[l][c] = entrada.nextDouble();
				//System.out.print(notasAlunos[l][c] + " | ");
			}
			System.out.println();
		}
		// mostrando os valores
		for (int l = 0; l < notasAlunos.length; l++) {         // laco para as linhas
			for(int c = 0; c < notasAlunos[l].length; c++) {   // laco para colunas
				System.out.print(notasAlunos[l][c] + " | ");
			}
			System.out.println();
		}
		entrada.close();
	}

}
