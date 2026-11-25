package PolymorphismOverloading;

public class DemoClass {
	
	public void m1(int i) {
		System.out.println("m1 method with single parameter");
	}
	public void m1(int i, String j) {
		System.out.println("m1 method with double parameter");
	}
	
	public static void main(String[] args) {
		DemoClass dm= new DemoClass();
		dm.m1(23, "Abc");
		
	}

}
