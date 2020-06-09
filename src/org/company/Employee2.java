package org.company;

public class Employee2 extends Employee1  {

	public void empEmail() {
		System.out.println("Email");

	}
	public void empid(int num, String name) {
		System.out.println("empid"+num);
		System.out.println("empid"+name);

	}
	
	public static void main(String[] args) {
		Employee2 e2 = new Employee2();
		e2.empEmail();
		e2.empid();
		e2.empid(6456, "alvin123");
		e2.empname();
	}
}

