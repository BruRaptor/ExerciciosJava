package exerclasse03;

public class ExerEletronico {

	public static void main(String[] args) {
		
		ClasseEletronico eletronico = new ClasseEletronico();
		
		
		System.out.println("Modelo do Produto: " + eletronico.produtoEletronico("Samsung Galaxy S21"));
		System.out.println("Marca do Produto: " + eletronico.marcaEletronico("Samsung"));
		System.out.println("Data de lançamento: " + eletronico.fabricaEletronico("Janeiro/2021"));
		
		System.out.println();
		System.out.println("Produto: " + eletronico.produto + " | " + " Marca: " + eletronico.marca + " | " + " Ano de fabricação: " + eletronico.anoDeFabrica + " | ");
	}

}
