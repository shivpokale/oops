package EmployeeBenefitSystem;

public class PartTimeEmployeeImpl implements Employee{

	@Override
	public double calculateSalary() {
		
		return 35000;
	}

	@Override
	public String getBenefits() {
		
		return "Flexible working hours, less work pressure";
	}

}
