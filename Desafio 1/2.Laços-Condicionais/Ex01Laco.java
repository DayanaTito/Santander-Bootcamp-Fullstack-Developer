package br.com.generation.java;

import java.util.Scanner;

public class Ex01Laco {
// 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	
	int n;
	int maiorN = 0;
	
	
	for (int x=0; x<3; x++) {
		System.out.println("Digite o valor: ");
		n = entrada.nextInt();
		
		
		if (maiorN<n) {
			
			maiorN = n;
		}
	} 
	
	entrada.close();
	
	System.out.println("O maior valor � "+ maiorN);
	
	

	}

}
