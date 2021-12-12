package brunoexer03;

import java.util.Scanner;

public class ExerJava05 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		 int nume, soma = 0;
		 
		    do{    
		    	System.out.println("Você irá digitar alguns números e caso queira parar é só digitar zero: ");
		    	nume = read.nextInt();
		    	
		    	soma += nume;
		    }while(nume != 0);
		    
		    System.out.println("A soma de todos os números é: " + soma);
		    
		    read.close();
	}

}
