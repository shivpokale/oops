
package Variables;

public class Student {
	int rollno = 50;
	
	public void m1()
	{
		int rollno = 60;
		System.out.println(rollno);
	}
	
	public static void main(String[] args) {
		int rollno = 70;
		
		System.out.println(rollno);
		
		Student s = new Student();
		System.out.println(s.rollno);
		
		s.m1();
	}

}
