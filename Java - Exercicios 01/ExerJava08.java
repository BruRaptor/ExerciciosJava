package br.com.generation.brunoexer;

import java.util.Scanner;

/*Programa:Custo Carro
 * Autor: Bruno
 * Turma: 42
 * Data: 08/12/2021
*/
public class ExerJava08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
		double custo, custoF,distri, imposto, valorF;
		
		//Input
		System.out.println("Qual vusto de fabrica? ");
		custoF = leia.nextDouble();
		
		//Process
		imposto = 0.45;
		distri = 0.28;
		
		valorF = custoF + imposto;
		custo = custoF + distri + valorF;
		
		//Output
		System.out.println("Valor final do carro é: " + custo);
		
		leia.close();
	}

}
