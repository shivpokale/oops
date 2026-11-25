package InterfaceExp;

public class ClassX implements I3 {

	@Override
	public void m2() {
		System.out.println("M2 method");
	}

	@Override
	public void m1() {
	System.out.println("M1 method");
	}

	@Override
	public void m3() {
		System.out.println("M3 method");
	}
	public void m4() {
		System.out.println("M4 method");
	}
	
	public static void main(String[] args) {
		I1 i1 = new ClassX();
		System.out.println("==I1==");
		i1.m1();
		System.out.println(i1.i);
		System.out.println("==I2==");
		I2 i2=new ClassX();
		i2.m1();
		i2.m2();
		System.out.println(i2.i);
		System.out.println(i2.j);
		System.out.println("==I3==");
		I3 i3 = new ClassX();
		i3.m1();
		i3.m2();
		i3.m3();
		System.out.println("==ClassX==");
		ClassX x=new ClassX();
		x.m1();
		x.m2();
		x.m3();
		x.m4();
		System.out.println(x.i);
		System.out.println(x.j);
		System.out.println(x.k);
		
	}
	
	

}
