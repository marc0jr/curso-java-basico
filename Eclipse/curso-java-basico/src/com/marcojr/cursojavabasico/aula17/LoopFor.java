package com.marcojr.cursojavabasico.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		//for normal
		for (int i = 0; i < 5; i++) {
			System.out.println("O valor de i será: "+ i);
		}
		
		for (int i = 5; i > 0; i--) {
			System.out.println("O valor de i será: "+ i);
		}

		//for com mais de uma variavel
		
		for (int i = 0, j = 10; i < j ; i++, j--) {
			System.out.println("i tera valor de: "+ i + " e j tera valor de: "+ j);	
		}
		
		for (int i = 0, soma = 0; i < 5 ; soma += ++i) {
			System.out.println("Valor da soma: "+ soma);
		}
	}

}
