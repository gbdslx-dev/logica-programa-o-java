package br.com.generation.lacosrepeticao;

import java.util.Scanner;

/*	Uma empresa desenvolveu uma pesquisa para saber as características
	psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	pessoas, calcule e mostre: (WHILE)
 	o número de pessoas calmas;
	o número de mulheres nervosas;
 	o número de homens agressivos;
 	o número de outros calmos;
 	o número de pessoas nervosas com mais de 40 anos;
 	o número de pessoas calmas com menos de 18 anos.*/
public class Ex_repeticao04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		int cont = 0, idade = 0, sexo= 0, psi = 0, fem = 0, mas = 0, out = 0, calm = 0 , mulherNerv = 0, homemAggr = 0, outCalm = 0, calmMenos18 = 0, nervMais40 = 0;
		
		System.out.println("--- Analisador de personalidades ---");
		while(cont != 1) {
			System.out.println("-----------------------------------------------------------");
			System.out.print("\n\nDigite a idade da pesoa: ");
			idade = input.nextInt();
			System.out.print("Escolha o sexo da pessoa:\n\n1) Feminino\n2) Masculino\n3) Outros \n-->");
			sexo = input.nextInt();
			
			System.out.println("Digite as características psicológicas:\n\n1) A pessoa era calma\n2) A pessoa era nervosa\n3) A pessoa era agressiva");
			psi = input.nextInt();
			cont++;
			
		}
		System.out.println(cont);
		System.out.println("Calculando...");
		
		if(psi == 1) {
			calm++;
		}
		if(sexo == 1 && psi == 2) {
			mulherNerv++;
		}
		if(sexo == 2 && psi == 3) {
			homemAggr++;
		}
		if(sexo == 3 && psi == 1) {
			outCalm++;
		}
		if(idade > 40 && psi == 2) {
			nervMais40++;
		}
		if(idade < 18 && psi == 1) {
			calmMenos18++;
		}
		
		System.out.print("O número de pessoas calmas foi: " + calm + ";\n");
		System.out.print("O número de mulheres nervosas foi: " + mulherNerv +  ";\n");
		System.out.print("O número de homens agressivos foi: " + homemAggr + ";\n");
		System.out.print("O número de outros calmo foi: " + outCalm + ";\n");
		System.out.print("O número de pessoas nervosas maiores de 40 anos foi:" + nervMais40 + ";\n");
		System.out.print("O número de pessoas calmas menores de 18 anos foi: " + calmMenos18 + ".\n");
		
		
		
		
		input.close();
		System.out.println("FIM DO PROGRAMA");
	}

}