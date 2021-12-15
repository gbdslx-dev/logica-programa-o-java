package br.com.generation.matrizes;

import java.util.Random;

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

public class Ex_matriz02 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[][] matriz = new int[3][3];
		int soma = 0, somaDiag = 0;
		
		for(int l = 0; l < 3; l++) {
			System.out.print("\n");
			for(int c = 0; c < 3; c++) {
				matriz[l][c] = random.nextInt(100);
				soma = soma + matriz[l][c];
				somaDiag = matriz[0][0] + matriz[1][1] + matriz[2][2];
				System.out.print("| " + matriz[l][c]+" |");
			}
		}
		System.out.println("\nA soma de todos os valores é igual a " + soma);
		System.out.println("A soma dos valores na diagonal é igual a " + somaDiag);
	}

}