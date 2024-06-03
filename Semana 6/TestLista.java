import java.util.List;
import java.util.ArrayList;

public class TestLista {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Martin");
		lista.add("Oscar");
		lista.add("Justin");
		System.out.println(lista.size());
		System.out.println(lista.get(1));

		List<Integer> listaEnteros = new ArrayList<Integer>();
		listaEnteros.add(5);
		listaEnteros.add(7);
		System.out.println(listaEnteros.get(1));
	}
}