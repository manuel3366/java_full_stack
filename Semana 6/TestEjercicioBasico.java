public class TestEjercicioBasico{
	public static void main(String[] args){
		EjercicioBasico ejercicioBasico = new EjercicioBasico();
		ejercicioBasico.imprimirNumerosDesdeHasta(1, 300);
		ejercicioBasico.imprimirImparesDesdeHasta(1, 255);
		ejercicioBasico.imprimirNumerosYSumaDesdeHasta(0, 255);
		int[] arreglo = {34, 45, 37, 95};
		ejercicioBasico.imprimirElementosArreglo(arreglo);
		int maximo = ejercicioBasico.obtenerMaximo(arreglo);
		System.out.println("El numero maximo es " + maximo);
	}
}