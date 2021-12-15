package br.com.generation.lacosrepeticao;

import java.util.Scanner;

/*	Escrever um programa que receba vários números inteiros no teclado. E no
	final imprimir a média dos números múltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE)*/

public class Ex_repeticao06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double num, soma = 0, media = 0, contMedia = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = input.nextInt();
			if(num % 3 == 0 && num != 0) {
				soma += num;
				contMedia++;	
			}
			
		}
		while(num != 0);
		
		media = soma / contMedia;
		System.out.println("Foram digitados " + contMedia + " número(s) múltiplos de 3.");
		System.out.println("A soma dos números múltiplos de 3 é igual a: " + soma);
		System.out.println("A média desses números é igual a: " + media);
		
		
		input.close();

	}

}