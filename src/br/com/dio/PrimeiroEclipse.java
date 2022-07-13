package br.com.dio;

import br.com.dio.model.SegundoEclipse;

public class PrimeiroEclipse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SegundoEclipse segundo = new SegundoEclipse();
		Livros livros = new Livros();
		
		System.out.println(segundo);
		System.out.println(livros);
/*		int a = 2;
		int b = 3;
		System.out.println("Hello Folks: a+b=" + (a + b));*/
	}

}
class Livros {
private String titulo;
private String npag;
}