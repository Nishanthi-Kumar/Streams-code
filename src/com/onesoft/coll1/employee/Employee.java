package com.onesoft.coll1.employee;

import java.util.ArrayList;

public class Employee {
	public static void main(String[] args) {
		ArrayList<Integer> employeeIdList = new ArrayList<>();
		employeeIdList.add(101);
		employeeIdList.add(102);
		employeeIdList.add(103);
		employeeIdList.add(104);
		employeeIdList.add(105);
		System.out.println(employeeIdList.get(3));
		employeeIdList.set(3,107);
		System.out.println(employeeIdList.get(3));
		employeeIdList.add(4,108);
		System.out.println(employeeIdList.get(4));
		for(int i= 0;i<employeeIdList.size();i++) {
			if(employeeIdList.get(i)%2==0) {
				System.out.println(employeeIdList.get(i)+"is even");
			}
			else {
				System.out.println(employeeIdList.get(i)+"is odd");
			}
			
		}
		int max = 0;
		for (Integer num:employeeIdList) {
			if(num>max) {
				max=num;
			}
		}
		System.out.println(max);
		
		
		
	}

}
