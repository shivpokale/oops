package OverridingEx;

public class Test {
	
	public static void main(String[] args) {
		
		Electronics e = new Electronics(101, 3000, "Earbuds");
		Clothing c = new Clothing(102, 500,"Tshirt");
		
		System.out.println("Electronics Details");
		e.displayDetails();
		
		System.out.println();
		
		System.out.println("Clothing Details");
		c.displayDetails();
	}
	
	

}
