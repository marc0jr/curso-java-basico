package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		//Convers�o de metros para cent�metros.
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("--Convers�o de metros para cent�metros--");
		System.out.println("\n Informe um valor em metros:");
		double valorMetros = scan.nextDouble();
		
		double valorCentimetros = valorMetros*100;
		
		System.out.println(valorMetros + " m � igual a " + valorCentimetros + " cm");
		

	}

}
