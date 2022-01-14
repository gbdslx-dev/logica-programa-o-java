package br.com.generation.heranca;

public class Cachorro extends Animal {
	
	public void correr(String nome) {
		System.out.println(nome + " está correndo...");
	}
	public void emitirSom(String nome) {
		System.out.println(nome + " está latindo!");
	}
}