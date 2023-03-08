package map;

import java.util.*;

class EmployeeDetails {

	private int id;
	private String name;
	private int age;
	private String department;
	
	
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


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}



		
}

public class Employee {
	public static void main(String[] args) {
		HashMap<String,EmployeeDetails> map= new HashMap<String,EmployeeDetails>();
		EmployeeDetails e = new EmployeeDetails();
		e.setId(245);
		e.setName("Akhil");
		e.setAge(22);
		e.setDepartment("Developer");
		
		map.put("TVM", e);
		EmployeeDetails y = map.get("TVM");
		System.out.println(y.getId());
		System.out.println(y.getName());
		System.out.println(y.getAge());
		System.out.println(y.getDepartment());
		
		
	}
	
}
