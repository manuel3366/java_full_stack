public class ClaseImpresion {
	public void imprimirDesdeHasta(int desde, int hasta){
		for(int i = desde; i <= hasta; i++) {
			System.out.println(i);
		}
	}

	public void imprimirImparesDesdeHasta(int desde, int hasta) {
		for (int i = desde; i <= hasta; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

	public void imprimirSeparacion(){
		System.out.println("----------------------------------------------");
	}
}