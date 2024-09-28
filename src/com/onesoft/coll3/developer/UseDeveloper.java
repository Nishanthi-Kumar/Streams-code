package com.onesoft.coll3.developer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseDeveloper {
	// (name, id, techSkill, age, gender, experience)
	public static void main(String[] args) {
		Developer dev1 = new Developer("varun", 121, "java", 25, "male", 2.5f);
		Developer dev2 = new Developer("rahul", 122, "java", 25, "male", 2.5f);
		Developer dev3 = new Developer("prabhu", 123, "front end", 25, "male", 1.0f);
		Developer dev4 = new Developer("vishal", 124, "java", 25, "male", 2.5f);
		Developer dev5 = new Developer("vanith", 125, "auto cad", 25, "male", 1.0f);
		Developer dev6 = new Developer("surya", 126, "java", 25, "male", 2.5f);
		Developer dev7 = new Developer("priya", 127, "java", 25, "female", 2.5f);
		Developer dev8 = new Developer("karthik", 128, "java", 25, "male", 2.5f);
		Developer dev9 = new Developer("naveen", 129, "java", 25, "male", 2.5f);
		Developer dev10 = new Developer("raki", 130, "java", 25, "male", 2.5f);
		ArrayList<Developer> developers  = new ArrayList<>();
		developers.add(dev1);
		developers.add(dev2);
		developers.add(dev3);
		developers.add(dev4);
		developers.add(dev5);
		developers.add(dev6);
		developers.add(dev7);
		developers.add(dev8);
		developers.add(dev9);
		developers.add(dev10);
		List<Developer> javaDevelopers = developers.stream().filter(dev->dev.getTechSkill().equals("java")).collect(Collectors.toList());
		javaDevelopers.forEach(dev->System.out.println(dev));
		List<Float> experianceListOfJavaDeveloper = javaDevelopers.stream().map(dev->dev.getExperience()).collect(Collectors.toList());
		experianceListOfJavaDeveloper.forEach(emp->System.out.println(emp));
	}
}
