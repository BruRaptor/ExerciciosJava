package brunoexer04;

import java.util.Scanner;

public class ExerJava04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int somaTotal = 0, somaDiagonal = 0;
		
		System.out.println("Digite os valores da matriz:\n");

		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Posição [%d][%d]: ", linha, coluna);
					matriz[linha][coluna] = read.nextInt();
			}
		}
				
		System.out.println("Matriz:");
				
		for(int linha = 0; linha < 3; linha++) {
			System.out.println();
			for(int coluna = 0; coluna < 3; coluna++){
				
				somaTotal += matriz[linha][coluna];
				
				if(linha == coluna){
					somaDiagonal += matriz[linha][coluna];
				}
				System.out.print(" | " + matriz[linha][coluna] + " | ");
			}
		}			
		System.out.println("\n\nSoma dos valores: " + somaTotal);
		System.out.println("\nSoma da diagonal principal: " + somaDiagonal);
		read.close();
	}

}
