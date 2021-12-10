package condicional;

public class Exercicio03 {

	public static void main(String[] args) {
		//um programa que receba a idade de uma pessoa e mostre na saída em qual
		//categoria ela se encontra: 10-14 infantil -> 15-17 juvenil -> 18-25 adulto
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.println("Insira sua idade: ");
		idade = 0;
		
	//condicionais
				if(idade <= 14) {
					System.out.println("Infantil.");
				}else if(idade >= 15 && idade <= 17) {
					System.out.println("Juvenil.");
				}else if (idade >= 18 && idade <=25) {
					System.out.println("Adulto.");
				}
	}

}
