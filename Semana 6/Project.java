public class Project {
	private String nombre;
	private String descripcion;
	private double initialCost;

	public Project() {

	}

	public Project(String nombre) {
		this.nombre = nombre;
	}

	public Project(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Project(String nombre, String descripcion, double initialCost) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.initialCost = initialCost;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion(){
		return this.descripcion;
	}

	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}

	public double getInitialCost(){
		return this.initialCost;
	}

	public String elevatorPitch(){
		return this.nombre + "(" + this.initialCost + "):" + this.descripcion;
	}
}