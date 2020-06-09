package org.company;

public class poly {
	public void empname() {
		System.out.println("name");

	}
	public void empname(String name) {
		System.out.println("username"+name);

	}
public static void main(String[] args) {
	poly p = new poly();
	p.empname();
	p.empname("abc123@gmail.com");
}
}
