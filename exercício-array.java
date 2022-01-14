package br.com.generation.array;

import java.util.ArrayList;

public class Array_Collections {

	public static void main(String[] args) {

		String dado1 = "Prato";
		String dado2 = "Copo";
		String dado3 = "Colher";
		String dado4 = "Garfo";
		
		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(dado1);
		estoque.add(dado2);
		estoque.add(dado3);
		estoque.add(dado4);
		
		System.out.println("Dados do array:" + estoque);
		
		estoque.remove(1);
		System.out.println("Removendo 'Copo' do array: " + estoque);

		estoque.add(1, "Faca");
		System.out.println("Adicionando 'Faca' no índice 1: " + estoque);
	}

}