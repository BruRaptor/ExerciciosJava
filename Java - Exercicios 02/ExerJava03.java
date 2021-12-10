package brunoexer02;

import java.util.Scanner;

public class ExerJava03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Qual sua idade? ");
		idade = leia.nextInt();
		
		if(idade >= 3 && idade <= 9) {
			System.out.println("Criança");
		}
		else if(idade >= 10 && idade <= 14){
			System.out.println("Infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Juvenil");
		}
		else if(idade >= 18 && idade <= 25){
			System.out.println("Adulto");
		}
		else if(idade >= 0 && idade <= 2) {
			System.out.println("Bebê");
		}
		else{
			System.out.println("Idade avançada");
			
			leia.close();
		}
	}

}
