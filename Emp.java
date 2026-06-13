package practiceJava;

import java.util.Objects;

public class Emp {
    
	private String name;
    private int id;
    private String department;
    private double salary;
    
    public  Emp(String name,int id,String department,double salary){
    	this.department =department;
    	this.name = name;
    	this.id = id;
    	this.salary = salary; 	
    }
    public String getname() {
    	return name;
    }
    public int getid() {
    	return id;
    }
    @Override
	public int hashCode() {
		return Objects.hash(department, id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Emp)) {
			return false;
		}
		Emp other = (Emp) obj;
		return Objects.equals(department, other.department) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	public String getdepartment() {
    	return department;
    }
    public double getsalary() {
    	return salary;
    }
    
    @Override
    public String toString() {
        return "Emp [name=" + name +", id=" + id +", department=" + department +", salary=" + salary + "]";
    }


	}


