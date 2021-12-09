package br.com.generation.brunoexer;

import java.util.Scanner;

/*Programa: Tempo do evento.
 * Autor: Bruno Ribeiro
 * Turma: 42
 * Data: 08/12/2021
*/
public class ExerJava03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int duracaoTSeg, duracaoHora, duracaoMin, duracaoSeg;
		
		//Input
		System.out.println("Digite o tempo da duração do evento em segundos: ");
		duracaoTSeg = leia.nextInt();
		
		//Process
		duracaoHora = duracaoTSeg /60 /60;
		duracaoMin = duracaoHora *60 - duracaoTSeg /60;
		duracaoSeg = duracaoTSeg - (duracaoHora *60 *60 + duracaoMin *60);
		
		//Output
		System.out.println("A duração total é: " + duracaoHora + " Horas " + duracaoMin + " minutos " + duracaoSeg + " segundos ");
		
		leia.close();
	}

}
