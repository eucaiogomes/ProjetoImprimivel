package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Funcionario f = new Funcionario("Maerio", "111221212.2121212.1212-4");
		Carro c = new Carro("Palio","cinza",4);
		Quadrado q = new Quadrado (10);
		
		
		ArrayList<Imprimivel>lista = new ArrayList<Imprimivel>();
		
		lista.add(q);
		lista.add(c);
		lista.add(f);
				
		
	}

}
