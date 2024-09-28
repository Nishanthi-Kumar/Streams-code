package coll3_streams;

public class Employee {
	String name;
	String designation;
	int salary;
	int id;                                         
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + ", id=" + id + "]";
	}
	public Employee(String name, String designation, int salary, int id) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.id = id;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
