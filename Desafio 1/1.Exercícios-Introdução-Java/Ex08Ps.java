package br.com.generation.jeffex;

import java.util.Scanner;

public class Ex08Ps {
//	8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
//	percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
//	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//	escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
//	consumidor.
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	
	double custo_Consumidor;
	double custo_Fabrica;
	double impostos;
	double porcentagem_Do_Distribuidor;
	
	System.out.println("Digite o custo de f�brica do carro: R$ ");
	custo_Fabrica = entrada.nextDouble();
	
	entrada.close();
	
	impostos = 0.45 *custo_Fabrica;
	porcentagem_Do_Distribuidor = 0.28 * custo_Fabrica;
	
	custo_Consumidor = impostos + porcentagem_Do_Distribuidor + custo_Fabrica;
	
	System.out.println("O valor do carro para o consumidor � R$ " + custo_Consumidor);
	

	}

}
