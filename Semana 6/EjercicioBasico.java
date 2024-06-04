public class EjercicioBasico{
	public void imprimirNumerosDesdeHasta(int desde, int hasta) {
		for (int i = desde; i <= hasta; i++) {
			System.out.println(i);
		}
	}

	public void imprimirImparesDesdeHasta(int desde, int hasta){
		for (int i = desde; i <= hasta; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

	public void imprimirNumerosYSumaDesdeHasta(int desde, int hasta) {
		int suma = 0;
		for (int i = desde; i <= hasta; i++) {
			suma = suma + i;
			System.out.println("Nuevo numero : " + i + " Suma : " + suma);
		}
	}

	public void imprimirElementosArreglo(int[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}

	public int obtenerMaximo(int[] arreglo) {
		int maximo = 0;
		for (int i = 0; i < arreglo.length; i++) {
			if (i == 0) {
				maximo = arreglo[i];
			}
			if (maximo < arreglo[i]) {
				maximo = arreglo[i];
			}
		}
		return maximo;
		
	}
}