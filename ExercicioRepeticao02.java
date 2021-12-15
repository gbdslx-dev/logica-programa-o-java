package br.com.generation.lacosrepeticao;

import java.util.Scanner;

/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

public class Ex_repeticao02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 0, contPar = 0, contImpar = 0;
		
		for(int c = 1; c <= 10; c++) { 
			System.out.print("\n Digite o " + c + "º numero:");
			num = input.nextInt();
			if(num % 2 == 0) {
				contPar++; // contPar += 1   contPar = contPar + 1
			}
			else {
				contImpar++;
			}
		}
		System.out.println("Foram digitados " + contPar + " números pares.");
		System.out.println("Foram digitados " + contImpar + " números ímpares.");
	
		
		
		input.close();
	}
}