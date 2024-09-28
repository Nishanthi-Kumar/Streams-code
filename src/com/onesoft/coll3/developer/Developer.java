package com.onesoft.coll3.developer;

public class Developer {
	//(name, id, techSkill, age, gender, experience)
		private String name;
		private int id;
		private String techSkill;
		private int age;
		private String gender;
		private float experience;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		@Override
		public String toString() {
			return "Developer [name=" + name + ", id=" + id + ", techSkill=" + techSkill + ", age=" + age + ", gender="
					+ gender + ", experience=" + experience + "]";
		}
		public Developer(String name, int id, String techSkill, int age, String gender, float experience) {
			super();
			this.name = name;
			this.id = id;
			this.techSkill = techSkill;
			this.age = age;
			this.gender = gender;
			this.experience = experience;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTechSkill() {
			return techSkill;
		}
		public void setTechSkill(String techSkill) {
			this.techSkill = techSkill;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public float getExperience() {
			return experience;
		}
		public void setExperience(float experience) {
			this.experience = experience;
		}
		
}
