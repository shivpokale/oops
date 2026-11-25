package returnType;

public class University {
	
	public static void main(String[] args) {
		
		College clg=new College();
		
		Student s= clg.getSingleStudent();
		System.out.println("Single Student details");
		System.out.println(s.id+" "+s.name+" "+s.address);
		
		AllStudent all=clg.getAllStudent();
		System.out.println("All Student Details");
		System.out.println("S1 :"+" " +all.s1.id+ " " +all.s1.name+" "+all.s1.address);
		System.out.println("S2 :"+" " +all.s2.id+ " " +all.s2.name+" "+all.s2.address);
		System.out.println("S3 :"+" " +all.s3.id+ " " +all.s3.name+" "+all.s3.address);
	}

}
