package br.com.generation.java;

import java.util.Scanner;

public class Ex04laco {
//	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
//	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
//	�mpar exiba o n�mero elevado ao quadrado.
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);	
	
	double valor;
	
	System.out.println("Digite um n�mero: ");
	valor = entrada.nextInt();
	entrada.close();
	if(valor % 2 == 0) {
		System.out.println("Este n�mero � par");
		valor = Math.sqrt(valor);
		System.out.println("A raiz quadrada desse n�mero � " + valor );
	}else {
		System.out.println("Este n�mero � �mpar");
		valor = Math.pow(valor, 2);
		System.out.println("Este n�mero elevado ao quadrado � " + valor);
	} if(valor == 0) {
		System.out.println("Valor neutro!");
	}
	
	}

}
