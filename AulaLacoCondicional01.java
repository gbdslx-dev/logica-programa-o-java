package br.com.generation.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExemploLacoCondicional {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a Primeira Nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a Segunda Nota: ");
		nota2 = ler.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 6.0 && media < 10) {			
			System.out.println("Aprovado." + "\nM�dia: " + media);
		}
		else if(media >= 3.0 && media < 6.0) {
			System.out.println("Recupera��o: " + "\nM�dia: " + media);
		}
		else if(media < 3.0){
			System.out.println("Reprovado." + "\nM�dia: " + media);
		}
		else {
			System.out.println("Nota Inv�lida!");
		}
		ler.close();
	}
}
