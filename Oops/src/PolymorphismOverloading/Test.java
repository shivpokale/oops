package PolymorphismOverloading;

public class Test {
	
	public void m1(byte b) {
		System.out.println("m1 method with two parameter:"+b);
	}
	public void m1(byte b ,short s) {
		System.out.println("m1 method with two parameter:"+b+" "+s);
	}
	public void m1(byte b, short s, int i) {
		System.out.println("m1 method with three parameter:"+b+" "+s+" "+i);
	}
	public void m1(byte b, short s, int i,long l) {
		System.out.println("m1 method with four parameter:"+b+" "+s+" "+i+" "+l);
	}
	public void m1(byte b, short s, int i,long l, float f) {
		System.out.println("m1 method with five parameter:"+b+" "+s+" "+i+" "+l+" "+f);
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		byte b=10;
		short s=23;
		int i=7657;
		long l =482394082l;
		float f= 3442.34f;
		t.m1(b);
		t.m1(b, s);
		t.m1(b, s, i);
		t.m1(b, s, i, l);
		t.m1(b, s, i, l, f);
		
		
	}

}
