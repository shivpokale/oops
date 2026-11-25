package Abstraction;

public class ClassY extends ClassX{
	
	@Override
	public void m2() {
		System.out.println("implemented m2 method in child class");
	}
	public void m3() {
		System.out.println("child class m3 method");
	}
	
	public static void main(String[] args) {
		
		ClassX x=new ClassY();
		x.m1();
		x.m2();
		
		ClassY y=new ClassY();
		y.m1();
		y.m2();
		y.m3();
		
		
	}
	

}
