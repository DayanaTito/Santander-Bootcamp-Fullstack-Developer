package br.com.generation.repet;

import java.util.Scanner;

public class ExRep05 {

	public static void main(String[] args) {
	//	5 - Crie um programa que leia um n�mero do teclado at� que encontre um
	//	n�mero igual a zero. No final, mostre a soma dos n�meros
	//	digitados.(DO...WHILE)
		
		Scanner entrada = new Scanner(System.in);
		
		float n;
		float soma = 0;
		
		System.out.println("Digite um n�mero: ");
		
		do { 
			n = entrada.nextFloat();
			soma = n + soma;
			
		}
		while( n != 0 ); 
			
		System.out.printf("Soma: %.1f", soma);
	}

}
