package br.com.generation.matrizes;

import java.util.Scanner;

/*	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
	das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
	posição das matrizes N1 e N2.*/
public class Ex_matriz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int[][] matrizM1 = new int[2][4];
		int[][] matrizM2 = new int[2][4];
		int[][] matriz2 = new int[2][4];
		int[][] matriz3 = new int[2][4];
		
		// gravando os dados na primeira matriz
		System.out.print("Matriz M1\n");
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 4; c++) {
				System.out.print("\nDigite o valor da posição " + "["+l+"]"+"["+c+"]: " );
				matrizM1[l][c] = input.nextInt();
			}
		}
		
		System.out.print("\nMatriz M2\n");
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 4; c++) {
				System.out.print("\nDigite o valor da posição " + "["+l+"]"+"["+c+"]: " );
				matrizM2[l][c] = input.nextInt();
			}
		}
		
		
		// fazer a soma dos dados das matrizes M1 e M2
		for(int l = 0; l < 2; l++) {
			System.out.println("");
			for(int c = 0; c < 4; c++) {
				matriz2[l][c] = matrizM1[l][c] + matrizM2[l][c];
				System.out.print("| "+matriz2[l][c]+" | ");
			}
		}
		
		// fazer a subtração dos dados das matrizes M1 e M2
		System.out.println("");
		for(int l = 0; l < 2; l++) {
			System.out.println("");
			for(int c = 0; c < 4; c++) {
				matriz3[l][c] = matrizM1[l][c] - matrizM2[l][c];
				System.out.print("| "+matriz3[l][c]+" | ");
			}
		}
		
		
		
		input.close();
		
	}

}