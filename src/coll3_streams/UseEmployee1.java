package coll3_streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee1 {
	public static void main(String[] args) {
		Employee1 e1=new Employee1("Nisha",123,20000,false);
		Employee1 e2=new Employee1("Arun",124, 30000, true);
		Employee1 e3=new Employee1("Sindhu",125,40000,true);
		Employee1 e4=new Employee1("Karthi",126,50000,true);
		Employee1 e5=new Employee1("Viji", 120, 24000, false);
		
		ArrayList<Employee1>emp=new ArrayList<>();
		emp.add(e1);emp.add(e2);emp.add(e3);emp.add(e4);emp.add(e5);
		
		Employee1 x=emp.stream().filter(z->z.getSalary()>25000).sorted(Comparator.comparing(Employee1::getEmpId).reversed().thenComparing(Employee1::getName).reversed()).findFirst().get();
		System.out.println(x);
		//FemaleEmployee seperate list
//		List<Employee1>femaleList=emp.stream().filter(x ->x.getIsMale()==false).collect(Collectors.toList());
//		for(Employee1 e:femaleList) {
//			System.out.println(e);
//		}
//		
//		//collect the emp getting morethan 30k
//		List<Employee1>sal=emp.stream().filter(x->x.getSalary()>30000).collect(Collectors.toList());
//		for(Employee1 e:sal) {
//			System.out.println(e);
//		}
	}

}
