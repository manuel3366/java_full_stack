public class ClaseTester {
	public static void main(String[] args) {
		ClaseImpresion claseImpresion = new ClaseImpresion();
		claseImpresion.imprimirDesdeHasta(1, 300);
		claseImpresion.imprimirSeparacion();
		claseImpresion.imprimirImparesDesdeHasta(1, 255);
		claseImpresion.imprimirSeparacion();

		
		int[] arreglo = {1, 3, 5, 7, 9, 13};

		ClaseArreglo claseArreglo = new ClaseArreglo();
		claseArreglo.imprimirElemento(arreglo);		
		double promedio = claseArreglo.obtenerPromedio(arreglo);
		claseImpresion.imprimirSeparacion();
		System.out.println(promedio);
		claseImpresion.imprimirSeparacion();
		arreglo = claseArreglo.obtenerCuadrado(arreglo);
		claseArreglo.imprimirElemento(arreglo);
		
	}
}