import java.util.*;

public class Usuario {
	public String userName;
	public String name;

	public void imprimirUsuario(List<Usuario> lista, String userName){
		for (Usuario usuario: lista) {
			if (usuario.userName.equals(userName)) {
				System.out.println(usuario.name);
			}
		}
	}

	public void imprimirUsuario(HashMap<String, String> map, String userName) {
		System.out.println(map.get(userName));
	}
}