package com.onesoft.coll3.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student student1 = new Student(201, "partha", "A", "male", 50);
		Student student2 = new Student(201, "parama", "B", "male", 60);
		Student student3 = new Student(201, "ambu", "C", "male", 80);
		Student student4 = new Student(201, "praveen", "A", "male", 90);
		Student student5 = new Student(201, "vishal", "B", "male", 89);
		Student student6 = new Student(201, "ramraj", "C", "male", 99);
		Student student7 = new Student(201, "poovu", "A", "male", 32);
		Student student8 = new Student(201, "ragul", "B", "male", 87);
		Student student9 = new Student(201, "durai", "C", "male", 85);
		Student student10 = new Student(201, "prabhu", "A", "male", 98);
		ArrayList<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student9);
		students.add(student10);
		List<Student> extordinaryStudents = students.stream().filter(stu -> stu.getMark() >= 80)
				.collect(Collectors.toList());
		List<Student> sectionA = students.stream().filter(stu -> stu.getSection().equals("A"))
				.collect(Collectors.toList());
		List<Student> sectionB = students.stream().filter(stu -> stu.getSection().equals("B"))
				.collect(Collectors.toList());
		List<Student> sectionC = students.stream().filter(stu -> stu.getSection().equals("C"))
				.collect(Collectors.toList());
		extordinaryStudents.forEach(stu -> System.out.println(stu));
		System.out.println("             -------");
		sectionA.forEach(stu -> System.out.println(stu));
		System.out.println("             -------");
		sectionB.forEach(stu -> System.out.println(stu));
		System.out.println("             -------");
		sectionC.forEach(stu -> System.out.println(stu));
		System.out.println("             -------");
		long wellStudentCount = extordinaryStudents.stream().count();
		System.out.println(wellStudentCount);
		List<Integer> wellStudentsIds = extordinaryStudents.stream().map(stu->stu.getId()).collect(Collectors.toList());
		wellStudentsIds.forEach(stu->System.out.println(stu));
	}

}
