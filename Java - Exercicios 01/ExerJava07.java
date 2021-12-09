package br.com.generation.brunoexer;

import java.util.Scanner;

/*Programa: Distância
 * Autor: Bruno Ribeiro
 * Turma: 42
 * Data: 08/12/2021
*/
public class ExerJava07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e, f, conta1x, conta2y;
		
		//Input
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();
		System.out.println("Digite o valor de D: ");
		d = leia.nextDouble();
		System.out.println("Digite o valor de E: ");
		e = leia.nextDouble();
		System.out.println("Digite o valor de F: ");
		f = leia.nextDouble();
		
		//Process
		conta1x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		conta2y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.println("O valor de X é: " + conta1x);
		System.out.println("O valor de Y é: " + conta2y);
		
		leia.close();
	}

}
