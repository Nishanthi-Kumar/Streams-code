package com.onesoft.coll3.family_member;

import java.util.ArrayList;

public class UseFamilyMember {
	public static void main(String[] args) {
		FamilyMember fm1 = new FamilyMember("mathi", "male", "uncle");
		FamilyMember fm2 = new FamilyMember("pazhani", "male", "uncle");
		FamilyMember fm3 = new FamilyMember("ratha", "female", "aunty");
		FamilyMember fm4 = new FamilyMember("maliga", "female", "grandma");
		FamilyMember fm5 = new FamilyMember("vasuki", "female", "aunty");
		FamilyMember fm6 = new FamilyMember("varsha", "female", "sister");
		FamilyMember fm7 = new FamilyMember("nisha", "female", "sister");
		FamilyMember fm8 = new FamilyMember("selva", "male", "brother");
		ArrayList<FamilyMember> familyMembers = new ArrayList<>();
		familyMembers.add(fm1);
		familyMembers.add(fm2);
		familyMembers.add(fm3);
		familyMembers.add(fm4);
		familyMembers.add(fm5);
		familyMembers.add(fm6);
		familyMembers.add(fm7);
		familyMembers.add(fm8);
		familyMembers.stream().filter(fms->fms.getRelationShipType().equalsIgnoreCase("uncle")).forEach(fm->System.out.println(fm));
	}
}
