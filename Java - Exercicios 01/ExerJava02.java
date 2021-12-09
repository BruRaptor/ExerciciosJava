package br.com.generation.brunoexer;

import java.util.Scanner;

/*Programa: Dias em idade.
 * Autor: Bruno Ribeiro
 * Turma: 42
 * Data: 08/12/2021
*/
public class ExerJava02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeTotalD, idadeA, idadeM, idadeDias;
		
		//Input
		System.out.println("Digite sua idade em dias: ");
		idadeTotalD = leia.nextInt();
		
		//Process
		idadeA = idadeTotalD /365;
		idadeM = (idadeTotalD - idadeA *365) /30;
		idadeDias = idadeTotalD - (idadeA *365 + idadeM *30);
		
		//Output
		System.out.println("Você tem aproximadamente: " + idadeA + " anos " + idadeM + " Meses " + idadeDias + " Dias ");
		
		leia.close();
	}

}
