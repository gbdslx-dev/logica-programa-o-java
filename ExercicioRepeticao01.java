package br.com.generation.lacosrepeticao;

/*	Informar todos os números de 1000 a 1999 que quando divididos por 11
	obtemos resto = 5. (FOR)*/

public class Ex_repeticao01 {

	public static void main(String[] args) {
		
		
		
		for(int num = 1000; num < 2000; num++ ) {
			if(num % 11 == 5) {
				System.out.print("\n" + num + " / 11 = " + (num / 11) + " com resto " + (num % 11));
			}
		}

	}

}