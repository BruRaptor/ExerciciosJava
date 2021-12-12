package brunoexer03;
//1-	Informar todos os números de 1000 a 1999
//que quando divididos por 11 obtemos resto = 5. (FOR)

public class ExerJava01 {

	public static void main(String[] args) {
		
		for(int x = 1000; x <= 1999; x++){
			if(x % 11 == 5) {
				
				System.out.print("\n" + x + " / 11 = " + (x / 11) + " com resto " + (x % 11));
			}
		}
	}

}
