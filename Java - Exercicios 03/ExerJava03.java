package brunoexer03;

import java.util.Scanner;

public class ExerJava03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int idade = 0, menos21 = 0, mais50 = 0;
		
		while(idade != -99) {
			
			System.out.println("Digite sua idade: ");
			idade = read.nextInt();
			
			if(idade < 21 && idade > 0) {
				menos21++;
			}
			if(idade > 50) {
				mais50++;
			}
			
		}
		System.out.println("Total de pessoas menores que 21 anos: " + menos21);
		System.out.println("Total de pessoas maiores que 50 anos: " + mais50);
		read.close();
	}

}
