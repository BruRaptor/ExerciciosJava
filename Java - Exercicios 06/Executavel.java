package ExerHerancaJava;

public class Executavel {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica laziness = new Preguica();
		
		dog.setNome("Simba");
		dog.setIdade(4);
		System.out.println("O nome do cachorro é: " + dog.getNome());
		System.out.println("Ele tem: " + dog.getIdade() + " anos");
		dog.correr();
		dog.morder();
		System.out.println("==========================");
		System.out.println();
		
		horse.setNome("Pé de Pano");
		horse.setIdade(12);
		System.out.println("O nome do cavalo é: " + horse.getNome());
		System.out.println("Ele tem: " + horse.getIdade() + " anos");
		horse.correrCavalo();
		horse.coice();
		System.out.println("==========================");
		System.out.println();
		
		laziness.setNome("Sid");
		laziness.setIdade(20);
		System.out.println("O nome da Preguiça é: " + laziness.getNome());
		System.out.println("Ela tem: " + laziness.getIdade() + " anos");
		laziness.subirPreguica();
		laziness.dorme();
		System.out.println("==========================");
	}

}
