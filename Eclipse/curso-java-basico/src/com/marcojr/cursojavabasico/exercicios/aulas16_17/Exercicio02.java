package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		/*System.out.println("Nome do usuário: ");
		String usuario = scan.next();
		System.out.println("Informe a senha: ");
		String senha = scan.next();
		
		while (usuario.equalsIgnoreCase(senha)) {
			System.out.println("Senha não pode ser igual ao usuario.");
			System.out.println("Informe nova senha: ");
			senha = scan.next();
		}
		
		System.out.println("Usuario cadastrado com sucesso!");*/
		
		
		//Outro metodo de resolução:
		
		boolean infoValidas = false;
		String usuario;
		String senha;
		
		do {
			System.out.println("Nome do usuário: ");
			usuario = scan.next();
			System.out.println("Informe a senha: ");
			senha = scan.next();
			
			if (usuario.equalsIgnoreCase(senha)) {
				System.out.println("Usuario e senha iguais, digite novamente.");
			} else {
				System.out.println("Usuario cadastrado com sucesso!");
				infoValidas = true;
			}
		} while (!infoValidas);
		
		}
	}


