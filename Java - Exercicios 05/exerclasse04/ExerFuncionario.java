package exerclasse04;

public class ExerFuncionario {

	public static void main(String[] args) {
		
		ClasseFuncionario funcionario = new ClasseFuncionario();
		
		System.out.println("Modelo do Produto: " + funcionario.nomeFuncionario("Carlos"));
		System.out.println("Modelo do Produto: " + funcionario.cpfFuncionario("404.835.635-x"));
		System.out.println("Modelo do Produto: " + funcionario.enderecoFuncionario("Rua Ruben D�rio, 510"));
		System.out.println("Modelo do Produto: " + funcionario.cepFuncionario("04860-260"));
		
		System.out.println();
		System.out.println("=======Dados do Funcion�rio========");
		System.out.println("Funcion�rio: " + funcionario.nome + " | " + "Portador do CPF: " + funcionario.cpf + " | " + "Residente no endere�o: " + funcionario.endereco +  " | " + " CEP: " + funcionario.cep);
		

	}

}
