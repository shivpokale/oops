package EmployeeBenefitSystem;

public class FullTimeEmployeeImpl implements Employee {

	@Override
	public double calculateSalary() {
		return 70000;
	}

	@Override
	public String getBenefits() {
		
		return "Paid leave, Healthcare Insurance, WFH, Bonus";
	}

}
