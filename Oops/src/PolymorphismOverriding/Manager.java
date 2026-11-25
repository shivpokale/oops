package PolymorphismOverriding;

public class Manager extends Employee{
	
	@Override
	public double calculateSalary() {
		
		return salary+20000;
	}

}
