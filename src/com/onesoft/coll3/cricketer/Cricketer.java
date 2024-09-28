package com.onesoft.coll3.cricketer;

public class Cricketer {
	private String name;
	private int id;
	private String lastName;
	private String skill;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", id=" + id + ", lastName=" + lastName + ", skill=" + skill + ", age=" + age
				+ "]";
	}
	public Cricketer(String name, int id, String lastName, String skill, int age) {
		super();
		this.name = name;
		this.id = id;
		this.lastName = lastName;
		this.skill = skill;
		this.age = age;
	}
	

}
