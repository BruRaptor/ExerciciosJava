package br.com.generation.brunoexer;

/*Programa: Média ponderada
 * Autor: Bruno Ribeiro
 * Turma: 42
 * Data: 08/12/2021
*/
import java.util.Scanner;

public class ExerJava05 {

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			double nume1, nume2, nume3, media;
			
			//Input
			System.out.println("Digite sua primeira nota: ");
			nume1 = leia.nextDouble();
			
			System.out.println("Digite sua segunda nota: ");
			nume2 = leia.nextDouble();
			
			System.out.println("Digite sua terceira nota: ");
			nume3 = leia.nextDouble();
			
			//Process
			media = (2 *nume1 + 3* nume2 + 5* nume3) / (2 + 3 +5);
			
			//Output
			System.out.println("Sua média é: " + media);
			
			leia.close();
		}
}
