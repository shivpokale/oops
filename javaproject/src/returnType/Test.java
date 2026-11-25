package returnType;

public class Test {
	
	public void m1() {
		
	}
	
	public byte m3() {
		return 19;
	}
	public int getRollNo() {
		return 19;
	}
	
	public String getName() {
		String name="ABC";
		return name;
	}
	
	public short age() {
		return 14;
	}
	
	public long enrollNo() {
		return 5678544;
	}
	
	public float percent() {
		return 68.80f;
	}
	public double accountbalance() {
		return 4545.65;
	}
	public char division() {
		return 'A';
	}
	public boolean result() {
		return true;
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
	}
}

