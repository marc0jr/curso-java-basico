package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Salario Bruto e L�quido
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o valor ganho por hora: ");
		int valorHora = scan.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas no m�s: ");
		int qdtHorasMes = scan.nextInt();
		int salarioBruto = valorHora*qdtHorasMes;
		System.out.println("Seu salaro bruto mensal � de: "+salarioBruto);
		
		double descontoIR = (salarioBruto * 1.11) - salarioBruto;
		double pagamentoINSS = (salarioBruto * 1.08) - salarioBruto;
		double pagamentoSindicado = (salarioBruto * 1.05) - salarioBruto;
		double salarioLiquido = salarioBruto - descontoIR - pagamentoINSS - pagamentoSindicado;
		
		System.out.println("Voc� pagou ao INSS: "+pagamentoINSS);
		System.out.println("Voc� pagou ao Sindicato: "+pagamentoSindicado);
		System.out.println("Seu salario L�quido � de: "+ salarioLiquido);
		
		

	}

}
