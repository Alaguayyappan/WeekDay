package org.second;

import org.first.parent;

public class Child extends parent {

	public void sampleA() {
		System.out.println("sampleA");
	}
	
	
public static void main(String[] args) {
	
	Child c = new Child();
	c.sample();
	c.sampleA();
	
}
}


