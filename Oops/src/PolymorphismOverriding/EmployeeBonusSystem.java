package PolymorphismOverriding;

public class EmployeeBonusSystem {
	
	public static void main(String[] args) {
		
		Employee employee;
		
		employee = new Developer();
		employee.setSalary(40000);
		System.out.println("Developer final salary: "+ employee.calculateSalary() );
		
		employee = new Tester();
		employee.setSalary(35000);
		System.out.println("Tester final salary: "+ employee.calculateSalary() );
		
		employee = new Manager();
		employee.setSalary(55000);
		System.out.println("Manager final salary: "+ employee.calculateSalary() );
	}
	
	

}
