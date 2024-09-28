package coll3_streams;

public class Employee1 {
	String name;
	int empId;
	int salary;
	boolean isMale;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public Employee1(String name, int empId, int salary, boolean isMale) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		this.isMale = isMale;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", empId=" + empId + ", salary=" + salary + ", isMale=" + isMale + "]";
	}
	

}
