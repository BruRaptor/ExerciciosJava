package exerclasse02;

public class ExerAviao {

	public static void main(String[] args) {

		ClasseAviao aviao = new ClasseAviao();
		
		System.out.println("Modelo do avi�o: " + aviao.modeloAviao("Cessna 406"));
		System.out.println();
		System.out.println("Velocidade M�xima: " + aviao.velocidadeAviaoMax(424) + "km/h");
		System.out.println();
		System.out.println("Autonomia de voo: " + aviao.Autonomiadevoo("2.135 km"));
		
		
		System.out.println();
		System.out.println("Modelo: " + aviao.modelo + " | " + " Velocidade M�xima: " + aviao.velocidadeMax + " | " + " Autonomia " + aviao.Autonomiadevoo);
	}

}
