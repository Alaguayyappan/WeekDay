package org.data;

public class Datatype {
	public void dataInt(int num) {
		System.out.println("number:"+num);

	}
	public void datafloat(float num1) {
		System.out.println("number:"+num1);

	}
	public void datachar(char num2) {
		System.out.println("number:"+num2);

	}
	public void dataString(String userid) {
		System.out.println("number:"+userid);

	}
public static void main(String[] args) {
	Datatype d = new Datatype();
	d.dataInt(290789);
	d.datafloat(350007);
	d.datachar('A');
	d.dataString("abc123@gmail.com");
}
}
