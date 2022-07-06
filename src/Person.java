//Mustafa Said Çanak	150120020
import java.util.Calendar;

public class Person {
	private int id;
	private String firstName, lastName;
	private byte gender;
	private Calendar birthDate;
	private byte maritalStatus;
	private boolean hasDriverLicence;
	
	public Person () {
		
	}

	public Person(int id, String firstName, String lastName, String gender, Calendar birthdate, String maritalStatus,
			String hasDriverLicence) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthdate;
		setGender(gender);
		setMaritalStatus(maritalStatus);
		setHasDriverLicence(hasDriverLicence);
	}

	public void setGender(String gender) {
		if (gender == "Man")
			this.gender = 1;
		else if (gender == "Woman")
			this.gender = 2;
	}

	public String getGender() {
		if (this.gender == 1)
			return "Man";
		else if  (this.gender == 2)
			return "Woman";
		else 
			return null;
	}

	public void setMaritalStatus(String status) {
		if (status == "Signle")
			this.maritalStatus = 1;
		else if (status == "Married")
			this.maritalStatus = 2;
	}

	public String getMaritalStatus() {
		if (this.maritalStatus == 1)
			return "Single";
		else if  (this.maritalStatus == 2)
			return "Married";
		else 
			return null;
	}
	
	public void setHasDriverLicence (String info) {
		if (info == "Yes")
			this.hasDriverLicence = true;
		else if (info == "No")
			this.hasDriverLicence = false;
	}
	
	public String getHasDriverLicence () {
		if (this.hasDriverLicence = true)
			return "Yes";
		else if (this.hasDriverLicence = false)
			return "No";
		else
			return null;		
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", birthDate=" + birthDate + ", maritalStatus=" + maritalStatus + ", hasDriverLicence="
				+ hasDriverLicence + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}

}
