public class Motocicleta extends Vehiculo {
	private Integer cilindrada;	
	
	public Motocicleta(String marca, String modelo, Integer anioFabricacion, String color, Integer cilindrada){
		super(marca, modelo, anioFabricacion, color);
		this.setNumeroRuedas(2);
		this.cilindrada = cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Integer getCilindrada() {
		return this.cilindrada;
	}
	
	@Override
	public void imprimirInformacion(){
		super.imprimirInformacion();
		System.out.println("Cilindrada: " + cilindrada);
	}
}