public class Persona {
	private Long id; 
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	
	public Persona() {

	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, String apellidoPaterno) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
	}

	public Persona(String nombre, String apellidoPaterno,  String apellidoMaterno) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}

	public Persona(Long id, String nombre, String apellidoPaterno, String apellidoMaterno) {
		this.id = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setApellidoPaterno(String apellidoPaterno){
		this.apellidoPaterno = apellidoPaterno;
	}
	
	public String getApellidoPaterno(){
		return this.apellidoPaterno;
	}
	
	public void setApellidoMaterno(String apellidoMaterno){
		this.apellidoMaterno = apellidoMaterno;
	}
	
	public String getApellidoMaterno(){
		return this.apellidoMaterno;
	}
	
	public void imprimirPersona(){
		System.out.println("Id: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido Paterno: " + this.apellidoPaterno);
		System.out.println("Apellido Materno: " + this.apellidoMaterno);
	}
}