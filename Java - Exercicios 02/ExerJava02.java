package brunoexer02;

import java.util.Scanner;

public class ExerJava02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int nume1, nume2, nume3;
		
		System.out.println("Digite o primeiro n�mero: ");
		nume1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		nume2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		nume3 = leia.nextInt();
		
		if(nume1 <= nume2 && nume2 <= nume3) {
			System.out.println("A 1� ordem crescente �:\n" + nume1 + "\n" + nume2 + "\n" + nume3);
		}
		else if(nume1 <= nume3 && nume3 <= nume2) {
			System.out.println("A 2� ordem crescente �:\n" + nume1 + "\n" + nume3 + "\n" + nume2);
		}
		else if(nume2 <= nume1 && nume1 <= nume3) {
			System.out.println("A 3� ordem crescente �:\n" + nume2 + "\n" + nume1 + "\n" + nume3);
		}
		else if(nume2 <= nume3 && nume3 <= nume1) {
			System.out.println("A 4� ordem crescente �:\n" + nume2 + "\n" + nume3 + "\n" + nume1);
		}
		else if(nume3 <= nume1 && nume1 <= nume2) {
			System.out.println("A 5� ordem crescente �:\n" + nume3 + "\n" + nume1 + "\n" + nume2);
		}
		else {
			System.out.println("A 6� ordem crescente �:\n" + nume3 + "\n" + nume2 + "\n" + nume1);
		}
		
		leia.close();
	}

}
