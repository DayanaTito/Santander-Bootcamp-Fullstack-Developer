package br.com.generation.repet;

import java.util.Scanner;

public class ExRep02 {
//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n ;
		int i;
		int x = 0;
		int p = 0;
		
		for (i = 0; i<10;i++) {
			int y = 0; 
			y++;
			System.out.println("Digite o " + y +"�" + " n�mero: ");
			 n = entrada.nextInt();	
		if(n % 2 == 1) {
			x++;
		}else {
			p++;
		}
		}
		entrada.close();
		System.out.println(x +" n�mero s�o �mpares. ");
		System.out.println(p +" n�mero s�o pares. ");
	}

}
