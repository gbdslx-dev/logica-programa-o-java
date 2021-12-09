package br.com.generation.condicionais;

import java.util.Scanner;

public class ExemploCondicional03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Escreva uma letra de A até D: ");
		//cadeia nome = "Luiz Mellin 123  @#$%"
		String letra = entrada.nextLine();
		
		switch(letra) {
			case "a", "A", "á":
				System.out.println("Ana");			
			break;
			case "b":
				System.out.println("Bruno");
			break;
			case "c":
				System.out.println("Carlos");
			break;
			case "d":
				System.out.println("Daniela");
			break;
			default:
				System.out.println("Opção Inválida!");
			break;
		}
		entrada.close();

	}

}
