import java.util.List;
public class ClaseExcepciones {
	public void imprimirElemento(int[] arreglo, int indice) throws ListaException {
		try {
			System.out.println(arreglo[indice]);
			List<String> lista = null;
			System.out.println(lista.size());
		} catch(Exception error) {
			System.out.println(error.getMessage());
			throw new ListaException();
		}		
	}
}