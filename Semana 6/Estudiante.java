public class Estudiante extends Persona {
	private Long codigoEstudiante;
	private Double promedioPonderado;

	public Estudiante(String name, String apellidoPaterno, String apellidoMaterno) {
		super(name, apellidoPaterno, apellidoMaterno);
	}

	public void setCodigoEstudiante(Long codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public Long getCodigoEstudiante() {
		return this.codigoEstudiante;
	}

	public void setPromedioPonderado(Double promedioPonderado) {
		this.promedioPonderado = promedioPonderado;
	}

	public Double getPromedioPonderado() {
		return this.promedioPonderado;
	}
	
	@Override
	public void imprimirPersona(){
		super.imprimirPersona();
		System.out.println("Codigo de Estudiante: " + this.codigoEstudiante);
		System.out.println("Promedio Ponderado: " + this.promedioPonderado);
	}
	
	
}