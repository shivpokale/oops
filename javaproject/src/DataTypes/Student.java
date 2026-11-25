package DataTypes;

public class Student {
	byte std = 15;
	byte b;
	short rollNo = 167;
	short s;
	int prnNo = 5657678;
	int i;
	long phoneNo = 7757949394l;
	long l;
	float percentage = 76.89f;
	float f;
	double accBalance = 465687.46587;
	double d;
	boolean isPassed =true;
	boolean fail;
	char division = 'A';
	char c;
	String fullName = "ABD";
	String st;
	
	public static void main(String[] args) {
		
		System.out.println("===Student Information==");
		Student s = new Student();
		System.out.println("Name of student: " + s.std);
		System.out.println("Roll no: " + s.rollNo);
		System.out.println("PrnNo: " + s.prnNo);
		System.out.println("PhoneNo: " + s.phoneNo);
		System.out.println("Percentage: " + s.percentage);
		System.out.println("AccBalance: " + s.accBalance);
		System.out.println("Is Student Passed: " + s.isPassed);
		System.out.println("Division: " + s.division);
		System.out.println("FullName: " + s.fullName);
		
		System.out.println("     ");
		
		System.out.println("===Default values===");
		
		System.out.println("byte: " + s.b);
		System.out.println("short: " +s.s);
		System.out.println("int: " +s.i);
		System.out.println("long: " +s.l);
		System.out.println("float: " +s.f);
		System.out.println("double: " +s.d);
		System.out.println("boolean: " + s.fail);
		System.out.println("String: " + s.st);
		
	}
	

}
