package com.onesoft.coll3.laptop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop laptop1 = new Laptop("lenovo", "thinkpad", 45000, 8, true);
		Laptop laptop2 = new Laptop("hassy", "g310", 25000, 4, false);
		Laptop laptop3 = new Laptop("dell", "aspire", 55000, 16, true);
		Laptop laptop4 = new Laptop("lenovo", "thinkbook", 65000, 16, true);
		Laptop laptop5 = new Laptop("hp", "node", 50000, 8, false);
		Laptop laptop6 = new Laptop("lenovo", "chrombook", 15000, 4, false);
		Laptop laptop7 = new Laptop("asus", "360", 40000, 8, true);
		Laptop laptop8 = new Laptop("apple", "macbook3", 150000, 16, true);
		Laptop laptop9 = new Laptop("microsoft", "surface", 75000, 16, true);
		Laptop laptop10 = new Laptop("infinix", "inbook", 35000, 8, false);
		ArrayList<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(laptop1);
		laptops.add(laptop2);
		laptops.add(laptop3);
		laptops.add(laptop4);
		laptops.add(laptop5);
		laptops.add(laptop6);
		laptops.add(laptop7);
		laptops.add(laptop8);
		laptops.add(laptop9);
		laptops.add(laptop10);
		List<Laptop> ssdLaptops = laptops.stream().filter(lap->lap.isSsd()).collect(Collectors.toList());
		List<Laptop> lowFeatureLapTops  = laptops.stream().filter(lap->lap.getRamSize()>=4).collect(Collectors.toList());
		long lenovoLapsCount = laptops.stream().filter(lap->lap.getBrand().equalsIgnoreCase("lenovo")).count();
		List<String> expensiveLaptopsModelList = laptops.stream().filter(lap->lap.getPrice()>=50000).map(lap1->lap1.getModel()).collect(Collectors.toList());
	}

}
