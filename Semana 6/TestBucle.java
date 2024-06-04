import java.util.*;
public class TestBucle {
	public static void main(String[] args){
		List<String> lista = new ArrayList<String>();
		lista.add("Martin");
		lista.add("Matias");
		lista.add("Evymar");
		lista.add("Oscar");
		Bucle bucle = new Bucle();
		bucle.imprimirElementosLista(lista);
		bucle.imprimirElementosListaInvertida(lista);
		bucle.imprimirNombresLongitud(lista, 5);
	}
}