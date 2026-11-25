package EmployeeBenefitSystem;

public class ContractTimeEmployeeImpl implements Employee{

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	public String getBenefits() {
		
		return "limited leave, Fixed work period";
	}

}
