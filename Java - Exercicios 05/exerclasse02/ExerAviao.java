package exerclasse02;

public class ExerAviao {

	public static void main(String[] args) {

		ClasseAviao aviao = new ClasseAviao();
		
		System.out.println("Modelo do avião: " + aviao.modeloAviao("Cessna 406"));
		System.out.println();
		System.out.println("Velocidade Máxima: " + aviao.velocidadeAviaoMax(424) + "km/h");
		System.out.println();
		System.out.println("Autonomia de voo: " + aviao.Autonomiadevoo("2.135 km"));
		
		
		System.out.println();
		System.out.println("Modelo: " + aviao.modelo + " | " + " Velocidade Máxima: " + aviao.velocidadeMax + " | " + " Autonomia " + aviao.Autonomiadevoo);
	}

}
