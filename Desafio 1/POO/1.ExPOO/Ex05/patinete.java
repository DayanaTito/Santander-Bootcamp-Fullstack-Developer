package br.com.generation.POO;
/*5) Crie uma classe patinete e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class patinete {
	
	String modelo;
	int velociodade;
	String indicacaoIdade;
	String suportePeso;
	
	void dados() {
		System.out.println("Dados do patinete: ");
		System.out.println("\nModelo: " + modelo);
		System.out.println("Indicado para crian�as de: " + indicacaoIdade);
		System.out.println("Susporta: " + suportePeso);
	}
	
}
