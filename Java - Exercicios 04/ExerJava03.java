package brunoexer04;

import java.util.Scanner;

public class ExerJava03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int[][] matrizN1 = new int[4][6];
		int[][] matrizN2 = new int[4][6];
		int[][] matrizM1 = new int[4][6];
		int[][] matrizM2 = new int[4][6];
		
		System.out.println("Dados Matriz N1\n");
		
		for(int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 6; coluna++){
				System.out.println("\nDigite o valor da posição " + "["+ linha +"]" + "[" + coluna +"]: ");
				matrizN1[linha][coluna] = read.nextInt();
			}
	}
		System.out.println("\nMatriz N2\n");
		for(int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 6; coluna++){
				System.out.println("\nDigite o valor da posição " + "["+ linha +"]" + "[" + coluna +"]: ");
				matrizN2[linha][coluna] = read.nextInt();
			}
		}
		for (int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 6; coluna++){
				matrizM1[linha][coluna] = matrizN1[linha][coluna] + matrizN2[linha][coluna];
				System.out.println("| " + matrizM1[linha][coluna] + " | ");
			}
		}
		System.out.println("");
		for(int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 6; coluna++){
				matrizM2[linha][coluna] = matrizN1[linha][coluna] - matrizN2[linha][coluna];
				System.out.println("| " + matrizM2[linha][coluna] + " | ");
			}
		}
		read.close();
	}
}