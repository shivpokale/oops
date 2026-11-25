package PolymorphismOverloading;

public class FindArea {
	
	public void area(double r) {
		System.out.println("Area of circle: "+ 3.14*r*r);
	}
	
	public void area(int s) {
		System.out.println("Area of square: "+ s*s);	
	}
	public void area(int l, int b) {
		System.out.println("Area of Rectangle: "+ l*b);
	}
	
	public static void main(String[] args) {
		
		FindArea fa=new FindArea();
		fa.area(5.5);
		fa.area(9);
		fa.area(22, 15);
	}

}
