package coll3_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("Nisha", "Trainer", 20000, 570);
		Employee e2=new Employee("Karthi", "hr", 30000, 568);
		Employee e3=new Employee("Kamesh", "Md", 10000, 579);
		Employee e4=new Employee("Prathap", "Director", 30000, 580);
		Employee e5=new Employee("Kumar", "Tr", 20000, 571);
		
		ArrayList<Employee>emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		int z=emp.stream().map(x->x.getSalary()).max((x,y)->x.compareTo(y)).get();
		System.out.println(z);
		//To filter and collect the names & ForEach
		
	    List<Employee>l=emp.stream().filter(x -> x.getSalary()>=30000&&x.getId()>=570).collect(Collectors.toList());
		for(Employee e:l) {
		System.out.println(e.getName());	
		}
		//l.forEach(x -> System.out.println(x.getName()));
		
		
		//To filter and collect the names & ForEach
		
		/*List<Employee>l=emp.stream().filter(x -> x.getName().startsWith("K")).collect(Collectors.toList());
		for(Employee e:l) {
			System.out.println(e.getName());
		}*/
		//l.forEach(x ->  System.out.println(x.getName()));
		
		
		//Equals&equalsIgnoreCase() Filter and Prints their details by forEach (Without collect)
		
		//emp.stream().filter(x -> x.getName().equals("Nisha")).forEach(x ->System.out.println(x));
		//emp.stream().filter(a ->a.getName().equalsIgnoreCase("KARTHI")).forEach(b ->System.out.println(b));
		
		
		//To Map the names and print & ForEach
		
		/*List<String>l=emp.stream().map(c ->c.getName()).collect(Collectors.toList());
		for(String e:l) {
			System.out.println(e);
		}*/
		//l3.forEach(a ->System.out.println(a));
		
		
		//To Map the Id in Integer wrapper class &Print
		
		/*List<Integer>l1=emp.stream().map(a ->a.getId()).collect(Collectors.toList());
		l1.forEach(x ->System.out.println(x));*/
		
		
		//Without Collect print the name
		
		//emp.stream().map(b ->b.getName()).forEach(b ->System.out.println(b));
		//emp.stream().forEach(x->System.out.println(x.getName()));
		
		
		//Used filter map and collect and print 
		/*List<String>l3=emp.stream().filter(x -> x.getSalary()>20000).map(c ->c.getName()).collect(Collectors.toList());
		for(String e:l3) {
			System.out.println(e);
		}*/
		
		//Without collect print the name (Used filter map)
		
		//emp.stream().filter(x -> x.getSalary()>20000).map(c ->c.getName()).forEach(a->System.out.println(a));
		
		
		//Count method
		/*long l=emp.stream().count();
		System.out.println(l);*/
		
		
		//Using filter count and print
		/*Long l1=emp.stream().filter(x -> x.getSalary()>20000).map(c->c.getDesignation()).count();
		System.out.println(l1);*/
		
		
	}

}
 