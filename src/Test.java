import java.io.*;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		ArrayList<Department> departments = new ArrayList<>();
		ArrayList<Product> products = new ArrayList<>();
		ArrayList<Project> projects = new ArrayList<>();
		ArrayList<Person> list = new ArrayList<>();
		
		File input= new File("CSE1242_spring2022_homework_1_input.txt");
		FileWriter output = new FileWriter("CSE1242_spring2022_homework_1_output2.txt");
		Scanner scanner = new Scanner(input);
		while(scanner.hasNextLine()) {
			String[] line = scanner.nextLine().split(" ");
			if (line[0] == "Department") {
				departments.add(new Department(Integer.parseInt(line[1]), line[2]));
				continue;
			}
			else if (line[0] == "Project") {
				projects.add(new Project(line[1], line[2], line[3]));
				continue;
			}
			else if (line[0] == "Product") {
				products.add(new Product(line[1], line[2], Double.parseDouble(line[3])));
				continue;
			}
			else if (line[0] == "Person") {
				list.add(new Person(Integer.parseInt(line[3]), line[1]), line[2], line[4], line[5], line[6], line[7]);
				continue;
			}
			else if (line[0] =="Employee") {
				boolean personFinder = personFinder(Integer.parseInt(line[1]), list);
				if (personFinder) {
					list.remove(personIndexFinder(Integer.parseInt(line[1]), list, personFinder));
				}
			}
		}
	}
	
	public static boolean personFinder(int id, ArrayList<Person> list) {
		Person[] persons = new Person[list.size()];
		list.toArray(persons);
		boolean returnType = false;
		for(int i = 0; i < persons.length; i++) {
			if (persons[i].getId() == id) {
				returnType = true; 
			}
		}
		return returnType;
	}
	
	public static int personIndexFinder(int id, ArrayList<Person> list, boolean check) {
		Person[] persons = new Person[list.size()];
		list.toArray(persons);
		if (check == true) {
		for(int i = 0; i < persons.length; i++) {
			if (persons[i].getId() == id)
				return i;
			}
		}
	}

}
