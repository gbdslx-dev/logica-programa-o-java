package br.com.generation.gabi;

public class Main {

	public static void main(String[] args) {

		//Instanciando primeiro objeto cliente sem construtor
		Cliente cliente = new Cliente();
		
		cliente.ID = 1;
		cliente.Nome = "Thomas Mendes";
		cliente.CPF = "111.222.333-44";
		cliente.Email = "th.mendes1997@gmail.com";
		cliente.Telefone = "1199999999";
		cliente.Endereco = "Rua Teste";
		
		//Instanciando primeiro objeto cliente com construtor
		Cliente cliente2 = new Cliente(2,"Gabriela","5556666554","gabiussauro@gmail.com","11999999999","Rua das Bolinhas 53");
		
				
		cliente.AlterarTelefone("11983611973");
		
		
		
		Cliente cliente3 = new Cliente();
		
		cliente3.CriarCliente();
		
		cliente.Imprimir();
		System.out.println("\n");
		cliente2.Imprimir();
		System.out.println("\n");
		cliente3.Imprimir();
		
		
		
	}

}
