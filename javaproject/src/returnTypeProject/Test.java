package returnTypeProject;

public class Test {
	
	public static void main(String[] args) {
		
		Office of=new Office();
		
		AllEmployee A = of.getAllEmployee();
		System.out.println("All Employee Details");
		System.out.println("E1 Id:"+ " "+A.E1.empId);
		System.out.println("E1 Name:"+ " "+A.E1.empName);
		System.out.println("E1 Address:"+ " "+A.E1.empAddress);
		
		System.out.println("E2 Id:"+ " "+A.E2.empId);
		System.out.println("E2 Name:"+ " "+A.E2.empId);
		System.out.println("E2 Address:"+ " "+A.E2.empId);
		
		System.out.println();
	}

}
