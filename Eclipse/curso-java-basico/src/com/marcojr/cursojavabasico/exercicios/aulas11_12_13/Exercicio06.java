package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		//Conversão de metros para centímetros.
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("--Conversão de metros para centímetros--");
		System.out.println("\n Informe um valor em metros:");
		double valorMetros = scan.nextDouble();
		
		double valorCentimetros = valorMetros*100;
		
		System.out.println(valorMetros + " m é igual a " + valorCentimetros + " cm");
		

	}

}
