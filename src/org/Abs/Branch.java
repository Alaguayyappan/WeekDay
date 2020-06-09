package org.Abs;

public class Branch extends Bankhq {

	public void currentAcc() {
	
		System.out.println("current");
		
	}
	public void savingsAcc() {
		
		System.out.println("savings");
		
	}
	public void fdAcc() {
		
		System.out.println("fd");
	}
public static void main(String[] args) {
	
	Branch b = new Branch();
	b.currentAcc();
	b.savingsAcc();
	b.fdAcc();
	b.sample();
}

}
