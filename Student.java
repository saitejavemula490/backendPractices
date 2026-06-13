package practiceJava;

public class Student {

	private String LastName;
	private String Address;
	private double CGPA;
	private int Age;
	private String Department;
	private String FirstName;

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getCGPA() {
		return CGPA;
	}

	public void setCGPA(double CGPA) {
		CGPA = CGPA;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setAge(int Age) {
		Age = Age;
	}
	public int getAge(int Age) {
		return  Age;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getFirstName(String firstName) {
		return firstName;
	}
	
	

	@Override
	public String toString() {
		return "Student [LastName=" + LastName + ", Address=" + Address + ", CGPA=" + CGPA + ", Age=" + Age
				+ ", Department=" + Department + ", FirstName=" + FirstName + "]";
	}

	public Student(String FirstName,
	String LastName,
	String Address,
	double CGPA,
	int Age,
	String Department) {
		this.LastName = LastName;
		this.FirstName = FirstName;
		this.Address = Address;
		this.CGPA = CGPA;
		this.Age= Age;
		this.Department = Department;
		
	}



}
