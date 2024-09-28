package com.onesoft.coll3.cricketer;

import java.util.ArrayList;
import java.util.List;

public class UseCricketer {
	public static void main(String[] args) {
		Cricketer cricketer1 = new Cricketer("sachin", 10, "tendulkar", "batsman", 50);
		Cricketer cricketer2 = new Cricketer("dhoni", 7, "singh", "batsman", 40);
		Cricketer cricketer3 = new Cricketer("yuvaraj", 12, "singh", "Allrounder", 39);
		Cricketer cricketer4 = new Cricketer("Saheer", 34, "khan", "bowler", 40);
		Cricketer cricketer5 = new Cricketer("ramesh", 45, "power", "bowler", 56);
		Cricketer cricketer6 = new Cricketer("souvrov", 99, "ganguly", "batsman", 49);
		Cricketer cricketer7 = new Cricketer("anil", 95, "kumble", "bowler", 57);
		Cricketer cricketer8 = new Cricketer("harthik", 228, "pandya", "Allrounder", 27);
		ArrayList<Cricketer> cricketers = new ArrayList<>();
		cricketers.add(cricketer1);
		cricketers.add(cricketer2);
		cricketers.add(cricketer3);
		cricketers.add(cricketer4);
		cricketers.add(cricketer5);
		cricketers.add(cricketer6);
		cricketers.add(cricketer7);
		cricketers.add(cricketer8);
		List<Cricketer> batsmen = cricketers.stream().filter(cri->cri.getSkill().equalsIgnoreCase("batsman")).toList();
		List<Cricketer> bowlers = cricketers.stream().filter(cri->cri.getSkill().equalsIgnoreCase("bowler")).toList();
		long allRounderCount = cricketers.stream().filter(cri->cri.getSkill().equalsIgnoreCase("Allrounder")).count();
		List<String> seniorPlayersLastName = cricketers.stream().filter(cri->cri.getAge()>=28).map(crl->crl.getLastName()).toList();
		
	}

}
