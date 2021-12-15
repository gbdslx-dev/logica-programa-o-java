package br.com.generation.gabi;

import java.util.Scanner;

public class Cliente {

	public int ID;
	public String Nome;
	public String CPF;
	public String Email;
	public String Telefone;
	public String Endereco;
	
	public Cliente() {}
	
	public Cliente(int id,String nome,String cpf, String email,String telefone, String endereco ) {
		ID = id;
		Nome = nome;
		CPF = cpf;
		Email = email;
		Telefone = telefone;
		Endereco = endereco;
	}
	
	public void AlterarTelefone(String telefoneNovo) {
		Telefone = telefoneNovo;
	}
	public void Imprimir() {
		System.out.println("=========== Dados do cliente =========== \n");
		System.out.println("ID: " + ID);
		System.out.println("\n Nome: " + Nome);
		System.out.println("\n CPF: " + CPF);
		System.out.println("\n Email: " + Email);
		System.out.println("\n Telefone: " + Telefone);
		System.out.println("\n Endereço: " + Endereco);	
	}	
	
	public void CriarCliente() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira seu ID: ");
			ID = input.nextInt();
		System.out.println("Insira seu nome: ");
			Nome = input.next();
		System.out.println("Insira seu CPF: ");
			CPF = input.next();
		System.out.println("Insira seu E-mail: ");
			Email = input.next();
		System.out.println("Insira seu telefone: ");
			Telefone = input.next();
		System.out.println("Insira seu endereço: ");		
			Endereco = input.next();
	}
}
