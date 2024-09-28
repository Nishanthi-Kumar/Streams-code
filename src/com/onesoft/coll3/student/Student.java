package com.onesoft.coll3.student;

public class Student {
	// name, id, section, gender, mark
	private int id;
	private String name;
	private String section;
	private String gender;
	private int mark;

	public Student(int id, String name, String section, String gender, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.section = section;
		this.gender = gender;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", section=" + section + ", gender=" + gender + ", mark=" + mark
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

}
