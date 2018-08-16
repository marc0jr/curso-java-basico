package com.marcojr.cursojavabasico.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		 
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 1;
		System.out.println(resultado);
		
		resultado = resultado % 2;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		resultado = resultado -1;
		System.out.println(resultado);
		
		String primeiroNome = "Marco ";
		String segundoNome = "Júnior ";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println("Nome completo: "+ terceiroNome);
		
		System.out.println(resultado++);
		// é o mesmo que:
		//System.out.println(resultado);
		//resultado += 1;
		
		System.out.println(++resultado);
		// é o mesmo que:
		//resultado += 1;
		//System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		
		System.out.println(--resultado);
		

	}

}
