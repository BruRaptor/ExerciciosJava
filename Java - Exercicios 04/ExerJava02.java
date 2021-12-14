package brunoexer04;

import java.util.Scanner;

public class ExerJava02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int[] dados = new int[10];
		double media = 0.0, soma = 0.0, maiorValor = 0.0, contador = 0.0;
		
		for(int vezes = 0; vezes < 10; vezes++){
			
			System.out.print("Rode o dado: ");
			dados[vezes] = read.nextInt();
			
			soma = soma + dados[vezes];
			media = soma / dados.length;
			
			if(dados[vezes] > maiorValor){
				maiorValor = dados[vezes];
			}
		}
		for(int limite = 0; limite < 10; limite++) {
			if(dados[limite] == maiorValor) {
				contador++;
			}
		}
		System.out.println("\nValor da soma: " + soma);
		System.out.println("\nValor da média: " + media);
		System.out.println("Vezes do maior valor: " + contador);
		read.close();
	}

}
