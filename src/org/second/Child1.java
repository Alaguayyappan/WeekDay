package org.second;

public class Child1 extends Child {
	
	public void sampleB() {
		System.out.println("sampleb");
	}

	
public static void main(String[] args) {
	
	Child1 c1 = new Child1();
	c1.sample();
	c1.sampleA();
	c1.sampleB();
	
}	
}
