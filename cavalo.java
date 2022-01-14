package br.com.generation.heranca;

public class Cavalo extends Animal {
	
	public void correr() {
		System.out.println("O cavalo está cavalgando...");
	}
	
	public void emitirSom(String nome) {
		System.out.println(nome + " está relinchando!");
	}
}