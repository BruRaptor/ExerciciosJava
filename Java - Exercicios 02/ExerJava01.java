package brunoexer02;

import java.util.Scanner;

public class ExerJava01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int nume1, nume2, nume3; 
		
		System.out.println("Digite o primeiro valor: ");
		nume1 = leia.nextInt();	   
		
		System.out.println("Digite o segundo valor: ");
		nume2 = leia.nextInt();	   
		
		System.out.println("Digite o terceiro valor: ");
		nume3 = leia.nextInt();	    
		
		if(nume1 >= nume2 && nume1 >= nume3) {
			
			System.out.println("Maior número é: " + nume1);
		}
		else if(nume2 >= nume1 && nume2 >= nume3) {
			System.out.println("Maior número é: " + nume2);
		}
		else if (nume3 >= nume2 && nume3 >= nume1){
			System.out.println("Maior número é: " + nume3);
		}
		leia.close();
	}

}
