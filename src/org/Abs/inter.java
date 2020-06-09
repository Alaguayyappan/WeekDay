package org.Abs;

public class inter implements local,local1 {

	public void sample1() {
		System.out.println("sample1");
		
	}
	
	public void dummy() {
		System.out.println("sample2");
		
	}
	
	public void dummy1() {
		System.out.println("sample3");

			}
	public void dummy2() {
		System.out.println("sample4");
	
	}

public static void main(String[] args) {
	inter i = new inter();
	i.sample1();
	i.dummy();
	i.dummy1();
	i.dummy2();
}
	
}
