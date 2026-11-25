package CustomClasses;

public class Test {
	public static void main(String[] args) {
	
	
	Student s = new Student();
	Pen p = new Pen();
	Employee e = new Employee();
	
	System.out.println("====Student Information===");
	System.out.println("Student rollno:" + s.rollno);
	System.out.println("Student name:" + s.name);
	System.out.println("Student address:" + s.address);
	
	System.out.println("===Pen Information===");
	System.out.println("Name of pen: " + p.name);
	System.out.println("Color of pen: " + p.color);
	System.out.println("Price of pen:  " + p.price);
	
	System.out.println("===Employee Details===");
	System.out.println("Employee Id: " + e.employeeId);
	System.out.println("Employee Name: + e.employeeName");
	


}
}