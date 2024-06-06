import java.time.Year;

public class Vehiculo {
	private String marca;
	private String modelo;
	private Integer anioFabricacion;
	private String color;
	private Integer numeroRuedas;

	public Vehiculo(String marca, String modelo, Integer anioFabricacion, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.color = color;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setAnioFabricacion(Integer anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public Integer getAnioFabricacion() {
		return this.anioFabricacion;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setNumeroRuedas(Integer numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public Integer getNumeroRuedas() {
		return this.numeroRuedas;
	}

	public void imprimirInformacion(){
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Año Fabricación: " + anioFabricacion);
		System.out.println("Color: " + color);
		System.out.println("Número de Ruedas: " + numeroRuedas);
	}

	public boolean esVehiculoDelAnio() {
		boolean resultado = false;
		int anioActual = Year.now().getValue();		
		if (anioActual == this.anioFabricacion.intValue()) {
			resultado = true;
		}
		return resultado;
	}

	public boolean esVehiculoDelAnio(int anioActual) {
		boolean resultado = false;
		if (anioActual == this.anioFabricacion.intValue()) {
			resultado = true;
		}
		return resultado;
	}

}