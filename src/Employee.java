//Mustafa Said Çanak	150120020
import java.util.*;

public class Employee extends Person {
	private double salary;
	private Calendar hireDate;
	private Department department;
	public static int numberOfEmployees;

	public Employee() {
		super();
		numberOfEmployees++;
	}

	public Employee(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, double salary, Calendar hireDate, Department department) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence);
		this.salary = salary;
		this.hireDate = hireDate;
		this.department = department;
		numberOfEmployees++;
	}

	public Employee(Person person, double salary, Calendar hireDate, Department department) {
		person = new Person();
		this.salary = salary;
		this.hireDate = hireDate;
		this.department = department;
		numberOfEmployees++;
	}

	public double raiseSalary(double percent) {
		salary = salary * (1+percent);
		return salary;
	}

	public double raiseSalary(int amount) {
		salary += amount;
		return salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public static int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public static void setNumberOfEmployees(int numberOfEmployees) {
		Employee.numberOfEmployees = numberOfEmployees;
	}

	public Calendar getHireDate() {
		return hireDate;
	}

	public void setHireDate(Calendar hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", hireDate=" + hireDate + ", department=" + department
				+ ", numberOfEmployees=" + numberOfEmployees + "]";
	}
}
