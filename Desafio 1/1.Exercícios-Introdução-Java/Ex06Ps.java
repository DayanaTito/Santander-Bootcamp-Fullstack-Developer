package br.com.generation.jeffex;
import java.util.Scanner;
public class Ex06Ps {
//Construa um programa em c que, tendo como dados de entrada dois pontos
//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula
	
//	d = raiz{ (x2-x1)� + (y2 - y1)�}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double p;
		double p2;
		double x1;
		double x2;
		double y1;
		double y2;
		double d;
		
		System.out.println("Digite o 1� ponto no plano x,y: ");
		x1 = entrada.nextDouble();
		y1 = entrada.nextDouble();
		
		System.out.println("Digite o 2� ponto no plano x,y: ");
		x2 = entrada.nextDouble();
		y2 = entrada.nextDouble();
		
		p = x2-x1;
		p = Math.pow(p, 2);
		
		p2 = y2 - y1;
		p2 = Math.pow(p2,2);
		d = p + p2;
		d = Math.sqrt(d);
		
	
		entrada.close();
		
		System.out.println("A dist�ncia entre os dois pontos �: " + d);
		
	}

}
