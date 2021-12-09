package br.com.generation.brunoexer;
/*Programa: O Valor de D.
 * Autor: Bruno Ribeiro
 * Turma: 42
 * Data: 08/12/2021
*/

import java.util.Scanner;

public class ExerJava04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
			int a, b, c, soma1, soma2;
			double r, s, d;
			
			//Input
			System.out.println("Digite o valor de A: ");
			a = leia.nextInt();
			System.out.println("Digite o valor de B: ");
			b = leia.nextInt();
			System.out.println("Digite o valor de C: ");
			c = leia.nextInt();
			
			//Process
			soma1 = a + b;
			soma2 = b + c;
			
			r = Math.pow(soma1, 2.0);
			s = Math.pow(soma2, 2.0);
			d = (r + s)/2;
			
			System.out.println("O valor de D é: " + d);
			System.out.println("O Valor de R é: " + r);
			System.out.println("O Valor de S é: " + s);
			
			leia.close();
	}

}
