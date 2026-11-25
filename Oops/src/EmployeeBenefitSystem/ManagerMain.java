package EmployeeBenefitSystem;

public class ManagerMain {
	
	public static void main(String[] args) {
		
		Employee employee;
		System.out.println("=======FullTime Employee=====");
		employee = new FullTimeEmployeeImpl();
		System.out.println("Salary:" +employee.calculateSalary());
		System.out.println("Benefits Employee get:"+ employee.getBenefits());
		System.out.println();
		
		System.out.println("=======Part time employee=====");
		employee = new PartTimeEmployeeImpl();
		System.out.println("salary:"+ employee.calculateSalary());
		System.out.println("Benefits Employee get:"+ employee.getBenefits());
		System.out.println();
		
		System.out.println("=======Contrat time employee====");
		employee = new ContractTimeEmployeeImpl();
		System.out.println("salary: "+ employee.calculateSalary());
		System.out.println("Benefits Employee get:"+ employee.getBenefits());
		
		
	}

}
