import java.util.ArrayList;

public class Portfolio {
	private ArrayList<Project> projects;
	
	public Portfolio(ArrayList<Project> projects) {
		this.projects = projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}

	public ArrayList<Project> getProjects() {
		return this.projects;
	}

	public double getPortfolioCost() {
		double suma = 0.0;
		for(Project project: this.projects) {
			suma = suma + project.getInitialCost();
		}

		return suma;
	}

	public void showPortfolio() {
		for (Project project: this.projects) {
			System.out.println(project.elevatorPitch());
		}
		System.out.println(this.getPortfolioCost());
	}
}