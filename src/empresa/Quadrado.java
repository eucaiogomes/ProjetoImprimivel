package empresa;

public class Quadrado implements Imprimivel{

	int medidaLado;

	@Override
	public void imprimir() {
		System.out.println("Quadrado");
		System.out.println("Medida lado: "+medidaLado);
		System.out.println("Area:  "+4*medidaLado);
		System.out.println("-------------------");
	}

	public Quadrado(int medidaLado) {
		super();
		this.medidaLado = medidaLado;
	}
}
