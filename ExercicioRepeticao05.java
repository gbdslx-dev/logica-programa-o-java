package br.com.generation.lacosrepeticao;

import java.util.Scanner;


/*	Crie um programa que leia um número do teclado até que encontre um
	número igual a zero. No final, mostre a soma dos números
	digitados.(DO...WHILE)*/

public class Ex_repeticao05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, soma = 0, cont = 0;
		
		do { 
			System.out.println("Digite um número: ");
			num = input.nextInt();
			if(num != 0) {
				cont++;				
			}
			soma += num;
		}
		while(num != 0);
		
		System.out.println("Foram digitados " + cont + " números");
		System.out.println("A soma dos números digitados é :" + soma);
		
		
		input.close();

	}

}