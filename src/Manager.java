//Mustafa Said Çanak	150120020
import java.util.*;

public class Manager extends Employee {
	private ArrayList<RegularEmployee> regularEmployees = new ArrayList<>();
	private double bonusBudget;

	public Manager() {
		super();
	}

	public Manager(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, double salary, Calendar hireDate, Department department, double bonusBudget) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate,
				department);
		this.bonusBudget = bonusBudget;
	}
	
	public Manager(Employee employee, double bonusBudget) {
		employee = new Employee();
		this.bonusBudget = bonusBudget;
	}
	
	public void addEmployee(RegularEmployee e) {
		regularEmployees.add(e);
	}
	
	public void removeEmployee(RegularEmployee e) {
		regularEmployees.remove(e);
	}
	
	public void distributeBonusBudget() {
		//calculate sum of salaries
		double sumOfSalary = 0;
		for (int i = 0; i < regularEmployees.size(); i++)
		sumOfSalary += regularEmployees.get(i).getPerformanceScore() * regularEmployees.get(i).getSalary();
		//find unit amount
		double unit = bonusBudget / sumOfSalary;
		//distribute bonus amounts 
		double bonus = 0;
		for(int i = 0; i < regularEmployees.size(); i++) {
			bonus = unit * regularEmployees.get(i).getPerformanceScore() * regularEmployees.get(i).getSalary();
			regularEmployees.get(i).setSalary(bonus + regularEmployees.get(i).getSalary());
		}
	}

	public ArrayList<RegularEmployee> getRegularEmployees() {
		return regularEmployees;
	}

	public void setRegularEmployees(ArrayList<RegularEmployee> regularEmployees) {
		this.regularEmployees = regularEmployees;
	}

	public double getBonusBudget() {
		return bonusBudget;
	}

	public void setBonusBudget(double bonusBudget) {
		this.bonusBudget = bonusBudget;
	}
	
	@Override
	public String toString() {
		return "Manager [regularEmployees=" + regularEmployees + ", bonusBudget=" + bonusBudget + "]";
	}
}
