package br.com.generation.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExemploLacoCondicional02 {

	public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		 
		double numero1, numero2, resultado = 0.0;
		char operacao;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = entrada.nextDouble();
		
		System.out.println("Digite a Operação");
		operacao = entrada.next().charAt(0);
		
		System.out.println("Digite o segundo número: ");
		numero2 = entrada.nextDouble();
				
		if(operacao == '+') {
			resultado = numero1 + numero2;
		}
		else if(operacao == '-') {
			resultado = numero1 - numero2;
		}		
		else if(operacao == '*' || operacao == 'x') {
			resultado = numero1 * numero2;
		}		
		else if(operacao == '/') {
			resultado = numero1 / numero2;
		}		
		System.out.println("Resultado: " + resultado);
		entrada.close();
	}
}
