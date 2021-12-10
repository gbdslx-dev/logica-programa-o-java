package br.com.generation.gbexe;

import java.util.Scanner;

/* programa: programação-sequencial
 * autor: Gabi Lima
 * turma: 42
 * data: 08/12/2021
*/
public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, anosTotais, mesesTotais, diasTotais, restoAno, restoMes
;
		
		//Input
		System.out.println("Insira sua idade em dias: ");
		dias = leia.nextInt();
		
		//Process
		anosTotais = dias /365;
		restoAno = dias % 365;
		mesesTotais= restoAno /30;
                restoMes = restoAno % 30;

		
		//Output
		System.out.println("Anos: " + anosTotais);
		System.out.println("Anos: " + mesesTotais);
		System.out.println("Anos: " + restoTotais);
		
	close();

	}

}