package org.company;

public class Stringfunc {
	
	public static void main(String[] args) {
		String s = "Task420";
		
		int i = s.length();
		System.out.println("length: "+i);
		
		char c = s.charAt(3);
		System.out.println("char: "+c);
		
		int a = s.indexOf("4");
		System.out.println("index: "+a);
		
		String u = s.toUpperCase();
		System.out.println("Upper: "+u);
		
		String r = s.replace("a", "u");
		System.out.println("Replaced:"+r);
	}
}
