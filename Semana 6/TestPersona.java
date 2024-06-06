public class TestPersona {
	public static void main(String[] args) {
		String x = "Bastian";
		String y = "Riveros";
		String z = "Caceres";
		Long id = 23L;
		Persona persona = new Persona(x);
		persona.imprimirPersona();

		Persona persona2 = new Persona(x, y);
		persona2.setId(id);
		persona2.imprimirPersona();

		Persona persona3 = new Persona(id, x, y, z);
		persona3.imprimirPersona();

		String nombreEstudiante = "Jorge";
		String apePatEstudiante = "Moya";
		String apeMatEstudiante = "Berrios";		

		Estudiante estudiante = new Estudiante(nombreEstudiante, apePatEstudiante, apeMatEstudiante);
		estudiante.setCodigoEstudiante(11123L);
		estudiante.setPromedioPonderado(19.5);
		estudiante.imprimirPersona();
	}
}