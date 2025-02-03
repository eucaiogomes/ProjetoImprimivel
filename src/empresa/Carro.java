package empresa;

public class Carro implements Imprimivel {

	String marca;
	String cor;
	int portas;
	@Override
	public void imprimir() {
	 System.out.println("Marca"+marca);
	 System.out.println("Cor: "+cor);
	 System.out.println("Numero de porta: "+portas);
		System.out.println("-------------------------");
	}
	public Carro(String marca, String cor, int portas) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
	}
	
}
