package PolymorphismOverriding;

public class Developer extends Employee {
	
	@Override
	public double calculateSalary() {
		
		return salary+10000;
	}

}
