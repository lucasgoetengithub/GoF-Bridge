package com.estudo.gof;

public class Brid {
	public static void main(String[] args) {
		publicar();
	}

	public static void publicar() {
		Livro livro = new Livro("Design Patterns", "GoF");
		System.out.println(livro);
	}
}
