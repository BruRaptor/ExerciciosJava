package brunoexer03;
	// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
import java.util.Scanner;

public class ExerJava02 {

	public static void main(String[] args) {
		
		int x, vezesPar = 0 , vezesImpar = 0;
		
		Scanner read = new Scanner(System.in);
		
		for(int vezes = 0 ; vezes < 10; vezes++) {
			
			System.out.println("Digite um valor: ");
			x = read.nextInt();
			
			if(x % 2 ==0){
				vezesPar++;
			}
			else{
				vezesImpar++;
			}
		}
		System.out.println("\nA quantidade de n�meros pares: " + vezesPar);
		System.out.println("\nA quantidade de n�meros �mpares: " + vezesImpar);
		
		read.close();
	}

}
