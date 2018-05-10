package com;

import java.util.HashMap;

public class Application {

	public static void main(String[] args) {
		
		
		
		HashMap<Integer,Employee > hm = new HashMap<Integer, Employee>();
		HashMap<String,Department> hm1 = new HashMap<String,Department>();
		HashMap<String, Company> hm2 = new HashMap<>();
		HashMap<Integer,String> global = new HashMap<>();
		
		Employee employee1 = new Employee(1,"Tirth");
		Employee employee2 = new Employee(2, "Shah");
		hm.put(1,employee1);
		hm.put(2,employee2);
		
		for(int i = 1; i <= hm.size(); i++) {
			System.out.println("Employee name "+hm.get(i).name);
		}
		

		
	}

}
