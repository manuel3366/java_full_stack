public class Usuario {
	public String aplicacion;
	public String userName;
	public String password;
	public int nroIniciosSesion;

	public void iniciarSesion() {
		System.out.println("Iniciando sesión para el usuario " + userName + " en la aplicación " + aplicacion);
	}
}