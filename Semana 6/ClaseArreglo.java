public class ClaseArreglo {
	public void imprimirElemento(int[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}

	public double obtenerPromedio(int[] arreglo) {
		double suma = 0.0;
		for(int valor: arreglo) {
			suma = suma + valor;
		}

		return suma / arreglo.length;
	}

	public int[] obtenerCuadrado(int[] arreglo) {
		for(int i = 0; i < arreglo.length; i++) {
			arreglo[i] = arreglo[i] * arreglo[i];
		}
		return arreglo;
	}
}