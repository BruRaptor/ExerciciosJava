package brunoexer02;

import java.util.Scanner;

public class ExerJava04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double nume, raiz, potencia;
		
		System.out.println("Digite um valor: ");
		nume = read.nextDouble();
		
		if(nume %2 == 0) {
			raiz = Math.sqrt(nume);
			
			System.out.println("O número Par e sua raiz quadrada é: " + raiz);
		}
		else {
			potencia = Math.pow(nume, 2);
			System.out.println("O número Ímpar e sua potência é: " + potencia);
		}
		read.close();
	}

}
