package br.com.generation.jeffex;
import java.util.Scanner;
public class Ex05Ps {
//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
//	aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
//	respectivamente.
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	
	double n1;
	double n2;
	double n3;
	double media;
	
	System.out.println("Digite a 1� nota: ");
	n1 = entrada.nextDouble();

	System.out.println("Digite a 2� nota: ");
	n2 = entrada.nextDouble();

	System.out.println("Digite a 3� nota: ");
	n3 = entrada.nextDouble();
	
	entrada.close();
	
	n1 = n1*2;
	n2 = n2*3;
	n3 = n3*5;
	
	media = (n1 + n2 + n3)/10;
	
	System.out.println("Sua m�dia final � "+ media);
	
	
	}

}
