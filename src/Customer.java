//Mustafa Said Çanak	150120020
import java.util.*;

public class Customer extends Person {
	private ArrayList<Product> products = new ArrayList<>();
	
	public Customer () {
		super();	
	}

	public Customer(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, ArrayList<Product> products) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence);
		this.products = products;
	}
	
	public Customer (Person person, ArrayList<Product> products) {
		person = new Person();
		this.products = products;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [products=" + products + "]";
	}
	
}
