public class Automovil extends Vehiculo {
	private Integer numeroAsientos;
	private Integer numeroBolsasAire;
	
	public Automovil(String marca, String modelo, Integer anioFabricacion, String color, Integer numeroAsientos, Integer numeroBolsasAire){
		super(marca, modelo, anioFabricacion, color);
		this.setNumeroRuedas(4);
		this.numeroAsientos = numeroAsientos;
		this.numeroBolsasAire = numeroBolsasAire;
	}
	
	@Override
	public void imprimirInformacion(){
		super.imprimirInformacion();
		System.out.println("Núumero de Asientos: " + numeroAsientos);
		System.out.println("Número de Bolsas de Aire: " + numeroBolsasAire);

	}

}