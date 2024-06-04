import java.util.*;

public class Bucle {
	
	public void imprimirElementosLista(List<String> lista){
		//For imprimir todos los elementos de la lista
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

	public void imprimirElementosListaInvertida(List<String> lista) {
		for (int i = lista.size() - 1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}
	}

	public void imprimirNombresLongitud(List<String> lista, int nroCaractes){
		//For imprimir todos los elementos de la lista
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).length() == nroCaractes) {
				System.out.println(lista.get(i));
			}
		}
	}


	public void ejecutarEjemplosBucle(List<String> lista) {
		//While imprimir "Hola Mundo" 3 veces
		int contador = 0;
		while (contador < 3) {
			System.out.println("Hola Mundo!");
			contador++;
		}

		//For imprimir "Hola Mundo" 3 veces
		for (int i = 0; i < 3; i++) {
			System.out.println("Hola Mundo For!");
		}

		

		//While imprimir todos los elementos de la lista
		int contador2 = 0;
		while (contador2 < lista.size()) {			
			System.out.println(lista.get(contador2));
			contador2++;			
		}
		System.out.println("For para recorrer una lista");

		//For imprimir todos los elementos de la lista
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("For segunda forma");
		// For para recorrer lista
		for (String nombre: lista) {
			System.out.println(nombre);
		}

		List<Integer> listaEnteros = new ArrayList<Integer>();
		listaEnteros.add(24);
		listaEnteros.add(25);
		listaEnteros.add(31);
		listaEnteros.add(28);
		
		System.out.println("For segunda nros enteros");
		for(Integer numero: listaEnteros) {
			System.out.println(numero);
		}

		System.out.println("For inverso");
		for (int i = lista.size() - 1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("For inverso opcion 2");

		for (int i = 0; i < lista.size(); i++) {
			int j = lista.size() - i - 1;
			System.out.println(lista.get(j));
		}
	}
}