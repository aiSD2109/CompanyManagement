//Mustafa Said Çanak	150120020
import java.util.*;

public class SalesEmployee extends RegularEmployee {
	private ArrayList<Product> sales = new ArrayList<>();
	public static int numberOfSalesEmployees;

	public SalesEmployee() {
		super();
		numberOfEmployees++;
	}

	public SalesEmployee(int id, String firstName, String lastName, String gender, Calendar birthDate,
			String maritalStatus, String hasDriverLicence, double salary, Calendar hireDate, Department department,
			double pScore, ArrayList<Product> s) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate, department,
				pScore);
		this.sales = s;
		numberOfEmployees++;
	}

	public SalesEmployee(RegularEmployee re, ArrayList<Product> s) {
		re = new RegularEmployee();
		this.sales = s;
		numberOfEmployees++;
	}
	
	public boolean addSale(Product s) {
		if (sales.contains(s)) {
			System.out.println("Product " + s + " is already exist.");
			return false;
		}
		else if (!sales.contains(s)) {
		sales.add(s);
		return true;
		}
		else 
			return false;
	}
	
	public boolean removeSale(Product s) {
		if (!sales.contains(s)) {
			System.out.println("Product " + s + " is not exist.");
			return false;
		}
		else if (sales.contains(s)) {
			sales.remove(s);
			return true;
		}
		else 
			return false;
	}

	public ArrayList<Product> getSales() {
		return sales;
	}

	public void setSales(ArrayList<Product> sales) {
		this.sales = sales;
	}

	public static int getNumberOfSalesEmployees() {
		return numberOfSalesEmployees;
	}

	public static void setNumberOfSalesEmployees(int numberOfSalesEmployees) {
		SalesEmployee.numberOfSalesEmployees = numberOfSalesEmployees;
	}
	
	@Override
	public String toString() {
		return "SalesEmployee [sales=" + sales + "]";
	}
}
