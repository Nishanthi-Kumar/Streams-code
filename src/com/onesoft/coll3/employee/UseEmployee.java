package com.onesoft.coll3.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "JOHN", "MALE", 25000, "APPERENTIES");
		Employee emp2 = new Employee(102, "MARK", "MALE", 35000, "SENIOR ADMIN");
		Employee emp3 = new Employee(103, "MADDY", "MALE", 25500, "ADMIN");
		Employee emp4 = new Employee(104, "DANY", "FEMALE", 50000, "GENERAL MANAGER");
		Employee emp5 = new Employee(105, "CERSI", "FEMALE", 32000, "MANAGER");
		Employee emp6 = new Employee(106, "TYRION", "MALE", 38000, "BUSSINESS ASSOSIATE");
		Employee emp7 = new Employee(107, "MISSENDAI", "FEMALE", 42000, "PA(GENERAL MANGER)");
		Employee emp8 = new Employee(108, "ROSE", "FEMALE", 45500, "SENIOR BUSSINESS ASSOSIATE");
		Employee emp9 = new Employee(109, "EMILIA", "FEMALE", 28000, "TRAINER");
		Employee emp10 = new Employee(110, "JAIMIE", "MALE", 34000, "SENIOR TRAINER");
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		employees.add(emp7);
		employees.add(emp8);
		employees.add(emp9);
		employees.add(emp10);
		List<Employee> femaleEmployees = employees.stream().filter(emp->emp.getGender().equalsIgnoreCase("female")).collect(Collectors.toList());
		femaleEmployees.forEach(emp->System.out.println(emp));
		System.out.println("---------------");
		List<Employee> highSalariedEmployees = employees.stream().filter(emp->emp.getSalary()>=30000).collect(Collectors.toList());
		highSalariedEmployees.forEach(emp->System.out.println(emp));
		List<String> maleEmployeeNames = employees.stream().filter(emp->emp.getGender().equalsIgnoreCase("male")).map(stud->stud.getName()).collect(Collectors.toList());
			maleEmployeeNames.forEach(stu->System.out.println(stu));
	}

}
