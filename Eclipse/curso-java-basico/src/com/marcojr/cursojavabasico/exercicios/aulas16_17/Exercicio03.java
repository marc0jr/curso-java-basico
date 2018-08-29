package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		int idade = 0;
		double salario = 0;
		String nome;
		String estadoCivil;
		String sexo;
		boolean infoValida = false;
		
		do {
			System.out.println("Digite seu nome: ");
			nome = scan.next();
						
			if (nome.length() > 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa ter mais que 3 caracteres.");
			}
			
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
						
			if (idade > 0 && idade < 150) {
				infoValida = true;
			} else {
				System.out.println("Informe uma idade entre 0 e 150.");
			}
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			
			System.out.println("Infome seu sexo: ");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				infoValida = true;
			} else {
				System.out.println("Sexo inválido!");
			}
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			
			System.out.println("Informe seu estado civil: ");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s") 
					|| estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") 
					|| estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("Estado Civil inválido");
			}
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			
			System.out.println("Digite seu salario: ");
			salario = scan.nextDouble();
			
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Informe um valor acima de 0.");
			}
		} while (!infoValida);
		
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: "+ idade + " anos.");
		System.out.println("Sexo: "+ sexo);
		System.out.println("Estado Civil: "+ estadoCivil);
		System.out.println("Salario: "+ salario + " reais.");
		
	}

}
