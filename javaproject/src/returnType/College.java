package returnType;

public class College {
	
	Student getSingleStudent() {
		
		Student std=new Student();
		std.id=456;
		std.name="ABC";
		std.address="Mumbai";
		return std;
	}
	
	AllStudent getAllStudent() {
		
		AllStudent As=new AllStudent();
		
		As.s1.id=100;
		As.s1.name="Shiv";
		As.s1.address="Pune";
	
		As.s2.id=200;
		As.s2.name="Shivam";
		As.s2.address="Delhi";
		
		As.s3.id=300;
		As.s3.name="Shivani";
		As.s3.address="Nashik";
		
		AllStudent A=new AllStudent();
		As.s1.id=1;
		As.s2.id=2;
		As.s3.id=3;
		
		
		
		return As;
	}

}
