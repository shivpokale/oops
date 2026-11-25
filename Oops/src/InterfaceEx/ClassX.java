package InterfaceEx;

public class ClassX implements Interface1{

	@Override
	public void m1() {
	System.out.println("implemented m1 method ");	
	}

	@Override
	public void m2() {
		System.out.println("implemented m2 method");
	}
	public void m3() {
		System.out.println("ClassX m3 method");
	}
	public static void main(String[] args) {
		
		Interface1 i= new  ClassX();
		i.m1();
		i.m2();
		
		System.out.println( );
		System.out.println(Interface1.x);
		System.out.println(Interface1.y);
		System.out.println( );
		
		ClassX x = new ClassX();
		x.m1();
		x.m2();
		x.m3();
		
	}

}
