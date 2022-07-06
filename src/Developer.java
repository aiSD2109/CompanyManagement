//Mustafa Said Çanak	150120020
import java.util.*;

public class Developer extends RegularEmployee {
	private ArrayList<Project> projects = new ArrayList<>();
	public static int numberOfDevelopers;

	public Developer() {
		super();
		numberOfDevelopers++;
	}

	public Developer(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, double salary, Calendar hireDate, Department department, double pScore,
			ArrayList<Project> p) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate, department,
				pScore);
		this.projects = p;
		numberOfDevelopers++;
	}
	
	public Developer(RegularEmployee re, ArrayList<Project> p) {
		re = new RegularEmployee();
		this.projects = p;
		numberOfDevelopers++;
	}
	
	public boolean addProject(Project s) {
		if(projects.contains(s)) {
			System.out.println("Project " + s + " is already exist.");
		return false;
		}
		else if (!projects.contains(s)) {
			projects.add(s);
			return true;
		}
		else 
			return false;
	}
	
	public boolean removeProject(Project s) {
		if(projects.contains(s)) {
			projects.remove(s);
		return true;
		}
		else if (!projects.contains(s)) {
			System.out.println("Project " + s + " is not exist.");
			return false;
		}
		else 
			return false;
	}
	
	@Override
	public String toString() {
		return "Developer [projects=" + projects + "]";
	}
	
}
