package com.marcojr.cursojavabasico.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//Convenção Java
		int idade = 29;
		String nome = "Marco";
		String nomeDoMeuCachorro = "Eros" ;
		String ano2014 = "2014";
		
		//Aceito, mas não utilizado
		int _idade;
		int $idade;
		
		
		//Não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		
		idade = 25;
		
		System.out.println("Meu nome é: " + nome);
		System.out.println("Minha idade é: " + idade);
		System.out.println("Nome do meu cachorro: " + nomeDoMeuCachorro);

		//Má prática (nome de variáveis com difícil significado).
		int a = 10;
		String b = "Marco";
		
	}

}
