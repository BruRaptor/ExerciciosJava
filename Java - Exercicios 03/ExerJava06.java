package brunoexer03;

import java.util.Scanner;

public class ExerJava06 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int nume, counter;
		double divisao = 0, multiplica = 0, total;
		
		do {
			System.out.println(" Digite um valor: ");
			nume = read.nextInt();
			
			if (nume % 3 == 0 && nume != 0) {
				multiplica = multiplica + nume;
				
				divisao++;
			}
			counter = nume;
		} while(counter != 0);
		total = multiplica / divisao;
		System.out.println("Média de números Múltiplos de 3 é: " + total);
		
		read.close();
	}

}
