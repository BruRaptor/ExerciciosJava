package brunoexer04;

import java.util.Scanner;

public class ExerJava01 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double[] pontuacao = new double[5];
		double maiorPonto = 0.0;
		
		for(int contador = 0; contador < pontuacao.length; contador++){
			
			System.out.println("Digite um valor: ");
			pontuacao[contador] = read.nextDouble();
			
			if(pontuacao[contador] > maiorPonto){
				
				maiorPonto = pontuacao[contador];
			}
		}
		System.out.println("Maior valor: " + maiorPonto);
		read.close();
	}

}
