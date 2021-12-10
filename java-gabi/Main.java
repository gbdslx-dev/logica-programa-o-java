package condicional;


import java.util.Scanner;
public class Main {

	public static void main(String[] args) {



				
				Scanner entrada = new Scanner(System.in);
				int num1, num2, num3;
				
				System.out.println("Insira três números: ");
				num1 = entrada.nextInt();
				num2 = entrada.nextInt();
				num3 = entrada.nextInt();
				
				//condicionais
				
				if(num1 > num2 && num1 > num3) {
					System.out.println("O maior número é: \n" + num1);
				} else if(num2 > num1 && num2 > num3 ) {
					System.out.println("O maior número é: \n" + num2);
				}else {
					System.out.println("O maior número é: \n" + num3);
				}

	}

}
