package week1.day1;

// Assignment 3

public class BitwiseVersusLogical {
	public static void main(String[] args) {
		char zero = 0;
		char one = 1;
		
		boolean f = false;
		boolean t = true;
		
		System.out.println("Bitwise: " + (zero & one));
		System.out.println("Logical: " + (t && f));
	}
}
