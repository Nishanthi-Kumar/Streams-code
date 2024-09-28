package com.onesoft.coll1.pen;

import java.util.ArrayList;

public class Pen {
	public static void main(String[] args) {
		ArrayList<String> brandNames = new ArrayList<>();
		brandNames.add("renolds");
		brandNames.add("cello");
		brandNames.add("parker");
		brandNames.add("hero");
		brandNames.add("natraj");
		for (int i = 0; i < brandNames.size(); i++) {
			System.out.println(brandNames.get(i).charAt(brandNames.get(i).length() - 1));
		}
		String temp = "";
		for (String str : brandNames) {
			temp += str;
		}
		System.out.println(temp);
		int max = 0;
		String str = "";
		for (int i = 0; i < brandNames.size(); i++) {
			if (max < brandNames.get(i).length()) {
				max = brandNames.get(i).length();
				str = brandNames.get(i);
			}

		}
		System.out.println(str);
		brandNames.forEach(val -> System.out.println(val));

	}

}
