package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o valor ganho por hora: ");
		int valorHora = scan.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
		int qdtHorasMes = scan.nextInt();
		int salarioBruto = valorHora * qdtHorasMes;

		int descontoIR = 0;
		
		if (salarioBruto <= 900) {
			descontoIR = descontoIR;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			descontoIR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			descontoIR = 10;
		} else if (salarioBruto > 2500) {
			descontoIR = 20;
		}

		double IR = (salarioBruto * descontoIR) / 100;
		double INSS = (salarioBruto * 10) / 100;
		double totalDescontos = IR + INSS;
		double depositoFGTS = (salarioBruto * 11) / 100;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("Salário Bruto: (" + valorHora + " * " + qdtHorasMes + "): " + salarioBruto);
		System.out.println("(-) IR (" + descontoIR + "%): " + IR);
		System.out.println("(-) INSS (10%): " + INSS);
		System.out.println("FGTS (11%): " + depositoFGTS);
		System.out.println("Total descontos: " + totalDescontos);
		System.out.println("Salario liquido: " + salarioLiquido);

	}

}
