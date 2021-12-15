package br.com.generation.lacosrepeticao;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
  21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
  idade for = -99. (WHILE)*/
public class Ex_repeticao03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade = 0, menos21 = 0, mais50 = 0, cont = 0;
		boolean pausa = true;
		
		while(pausa) {
			System.out.println("Digite uma idade: ");
			idade = input.nextInt();
			if(idade > 0) {
				cont++;				
			}
			if(idade < 21 && idade > 0) {
				menos21++;
			}
			if(idade > 50) {
				mais50++;
			}
			if(idade == -99) {
				pausa = false;
			}
			if(idade < 0 && idade != -99) {
				System.out.println("Idade inválida! Ninguém tem idade negativa!");
			}
		}
		System.out.println("O número de idades digitadas foi " + cont);
		System.out.println("O número de pessoas com menos de 21 anos foi de " + menos21 + " pessoas.");
		System.out.println("O número de pessoas com mais de 50 anos foi de " + mais50 + " pessoas.");
		
		
		
		input.close();

	}

}