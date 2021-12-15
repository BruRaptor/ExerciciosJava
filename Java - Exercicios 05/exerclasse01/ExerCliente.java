package exerclasse01;

public class ExerCliente {

	public static void main(String[] args) {
		
		ClasseCliente cliente1 = new ClasseCliente();
				
		System.out.println("\nNome do cliente: " + (cliente1.nomeCliente("Bruno")));
		System.out.println("\nTelefone do cliente: " + (cliente1.telCliente("(11) 97055-6060")));
		System.out.println("\nCidade do cliente: " + (cliente1.CidadeCliente("São Paulo")));
		
		System.out.println();
		System.out.println("Nome: " + cliente1.nome + " | " + " Telefone: " + cliente1.telefone + " | " + " Cidade: " + cliente1.cidade);

	}
}