package com.onesoft.coll1.student;

public  class Student {
	    int id;
	    String name;
	    int age;
	    boolean isMale;
	    int fees;
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", age=" + age + ", isMale=" + isMale + ", fees=" + fees
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
		public Student(int id, String name, int age, boolean isMale, int fees) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.isMale = isMale;
			this.fees = fees;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public boolean isMale() {
			return isMale;
		}
		public void setMale(boolean isMale) {
			this.isMale = isMale;
		}
		public int getFees() {
			return fees;
		}
		public void setFees(int fees) {
			this.fees = fees;
		}
}
