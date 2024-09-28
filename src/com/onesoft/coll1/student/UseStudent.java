package com.onesoft.coll1.student;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student(101, "thanam", 27, false, 2740);
		Student s2 = new Student(102, "viji", 23, false, 3840);
		Student s3 = new Student(103, "malik", 26, true, 4740);
		Student s4 = new Student(104, "madhan", 23, true, 4000);
		Student s5 = new Student(105, "nithya", 24, false, 5500);
		Student s6 = new Student(106, "thilak", 25, false, 5750);
		Student s7 = new Student(107, "sangeetha", 28, false, 7000);
		ArrayList<Student> studentDetails = new ArrayList<>();
		studentDetails.add(s1);
		studentDetails.add(s2);
		studentDetails.add(s3);
		studentDetails.add(s4);
		studentDetails.add(s5);
		studentDetails.add(s6);
		studentDetails.add(s7);
		for (int i = 0; i < studentDetails.size(); i++) {
			System.out.println(studentDetails.get(i));

		}
		int max = 0;
		for (Student s : studentDetails) {
			if (s.isMale() == true && max < s.getAge()) {
				max = s.getAge();
			}
		}
		System.out.println(max);
		ArrayList<Student> feMaleStudents = new ArrayList<>();
		for (Student stu : studentDetails) {
			if (stu.isMale == false) {
				feMaleStudents.add(stu);
			}
		}
		feMaleStudents.forEach(stu -> System.out.println(stu));

	}

}
