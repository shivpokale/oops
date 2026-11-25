package InterfaceExp;

public class ClassY implements InterfaceI1{
	
	public static int x =200;

	@Override
	public void m1() {
		System.out.println("implemented m1");
	}
	public static void main(String[] args) {
		
		System.out.println(x);
		System.out.println(InterfaceI1.x);
		System.out.println(ClassY.x);
		
		InterfaceI1 i = new ClassY();
		i.m1();
		System.out.println(i.x);
		
		ClassY y= new ClassY();
		System.out.println(y.x);
		
		
	}
	

}
