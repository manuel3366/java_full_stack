import java.util.*;
public class TestUsuario {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		for(int i = 1; i <= 1000; i++) {			
			String userName = "user" + i;
			String userApellido = "Apellido " + i;
			map.put(userName, userApellido);
		}

		Usuario usuario1 = new Usuario();
		usuario1.imprimirUsuario(map, "user50");
	}
}