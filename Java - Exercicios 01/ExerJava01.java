package br.com.generation.brunoexer;

import java.util.Scanner;
/*Programa: Quantos dias você já viveu?
 * Autor: Bruno Ribeiro
 * Turma: 42
 * Data: 08/12/2021
*/
public class ExerJava01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anoA, anoN, idade, dias;
		
		anoA = 2021;
		
		//Input
		System.out.println("Digite o ano de nascimento: ");
		anoN = leia.nextInt();
		
		//Process
		idade = anoA - anoN;
		dias = idade *365;
		
		//Output
		System.out.println("Você tem aproximadamente: " + dias + " Dias de vida.");
		
		leia.close();
	}

}
