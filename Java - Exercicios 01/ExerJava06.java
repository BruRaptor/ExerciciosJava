package br.com.generation.brunoexer;

import java.util.Scanner;

/*Programa: Distância
 * Autor: Bruno Ribeiro
 * Turma: 42
 * Data: 08/12/2021
*/
public class ExerJava06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, p1, p2, d;
		
		//Input
		System.out.println("Digite o valor de X no primeiro ponto: ");
        x1 = leia.nextDouble();

        System.out.println("Digite o valor de Y no primeito ponto: ");
        y1 = leia.nextDouble();

        System.out.println("Digite o valor de X no segundo ponto: ");
        x2 = leia.nextDouble();

        System.out.println("Digite o valor de Y no segundo ponto: ");
        y2 = leia.nextDouble();
        
        //Process
        p1 = Math.pow((x2 - x1),2);
        p2 = Math.pow((y2 - y1),2);

        d = Math.sqrt(p1 + p2);
        
        //Output
        System.out.println("A distancia entre os dois pontos é : " + d);

        leia.close();
		
	}

}
