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
			
			System.out.println("O n�mero Par e sua raiz quadrada �: " + raiz);
		}
		else {
			potencia = Math.pow(nume, 2);
			System.out.println("O n�mero �mpar e sua pot�ncia �: " + potencia);
		}
		read.close();
	}

}
