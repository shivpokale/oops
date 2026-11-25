package JavaEx;

public class Calculator {
	
	int x= 78;
	int y=77;
	
	public void m1()
	{
		System.out.println("==m1 method==");
	}
	
	public static void main(String[] args) {
		 Calculator c = new Calculator();
		 
		 System.out.println(c.x);
		 System.out.println(c.y);
		 c.m1();
	}

}
