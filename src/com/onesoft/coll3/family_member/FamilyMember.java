package com.onesoft.coll3.family_member;

public class FamilyMember {
	
	private String name;
	private String gender;
	private String relationShipType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRelationShipType() {
		return relationShipType;
	}
	@Override
	public String toString() {
		return "FamilyMember [name=" + name + ", gender=" + gender + ", relationShipType=" + relationShipType + "]";
	}
	public void setRelationShipType(String relationShipType) {
		this.relationShipType = relationShipType;
	}
	public FamilyMember(String name, String gender, String relationShipType) {
		super();
		this.name = name;
		this.gender = gender;
		this.relationShipType = relationShipType;
	}

}
