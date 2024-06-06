import java.util.ArrayList;

public class ProjectTest {
	public static void main(String[] args) {
		String nombre = "Project Java";
		String descripcion = "Proyecto acerca de los fundamentos de Java.";
		double initialCost = 4500.0;
		String nombre2 = "Project Python";
		String descripcion2 = "Proyecto acerca de los fundamentos de Python.";
		double initialCost2 = 10900.0;
		Project project = new Project(nombre, descripcion, initialCost);
		Project project2 = new Project(nombre2, descripcion2, initialCost2);
		
		ArrayList<Project> lista = new ArrayList<Project>();
		lista.add(project);
		lista.add(project2);
		
		Portfolio portfolio = new Portfolio(lista);
		portfolio.showPortfolio();
				
	}
}