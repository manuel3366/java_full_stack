public class TestUsuario{
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario();
		usuario1.userName = "mvictoriano";
		usuario1.aplicacion = "Discord";
		Usuario usuario2 = new Usuario();
		usuario2.userName = "msaucedo";
		usuario2.aplicacion = "Facebook";

		usuario1.iniciarSesion();
		usuario2.iniciarSesion();
		
		int a = 6;
		System.out.println(a%(2*3));

	}
}