public class TestVehiculo{
	public static void main(String[] args) {
		String marca = "Mazda";
		String modelo = "CX9";
		Integer anioFabricacion = 2024;
		String color = "Plomo";
		Vehiculo vehiculo = new Vehiculo(marca, modelo, anioFabricacion, color);
		vehiculo.imprimirInformacion();
		boolean esDelAnio = vehiculo.esVehiculoDelAnio(2024);
		System.out.println(esDelAnio);

		String marcaMoto = "Yamaha";
		String modeloMoto = "R100";
		Integer anioFabricacionMoto = 2024;
		String colorMoto = "Negro";
		Integer cilindradaMoto = 150;
		Motocicleta motocileta = new Motocicleta(marcaMoto, modeloMoto, anioFabricacionMoto, colorMoto, cilindradaMoto);		
		motocileta.imprimirInformacion();

		String marcaAuto = "Toyota";
		String modeloAuto = "Yaris";
		Integer anioFabricacioAuto = 2024;
		String colorAuto = "Rojo";
		Integer numeroAsientos = 4;
		Integer numeroBolsasAire = 2;
		Automovil automovil = new Automovil(marcaAuto, modeloAuto, anioFabricacioAuto, colorAuto, numeroAsientos, numeroBolsasAire);
		automovil.imprimirInformacion();

	}
}