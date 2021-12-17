package ExerCollection;

import java.util.ArrayList;

public class LojaDeProdutos {

	public static void main(String[] args) {
		
		ArrayList<String> celular = new ArrayList<String>();
		
		celular.add("Samsung");
		celular.add("Motorola");
		celular.add("Iphone");
		celular.add("Xiaomi");
		celular.add("Hauwei");
		
		celular.set(3, "PocoPhone");
		celular.remove(4);
		
		for(int counter = 0; counter < celular.size(); counter++) {
			
			System.out.println();
			System.out.println("SmartPhone: " + celular.get(counter));
		}

	}

}
