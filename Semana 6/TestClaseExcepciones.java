public class TestClaseExcepciones {
	public static void main(String[] args) {
		ClaseExcepciones claseExcepciones = new ClaseExcepciones();
		int[] arreglo = {45, 23, 56};
		try {
			claseExcepciones.imprimirElemento(arreglo, 1);
		} catch(ListaException e) {
			System.out.println("Hubo un error en el manejo de las listas.");
		}
	}
}