package PolymorphismOverriding;

public class Tester extends Employee{
	
	@Override
	public double calculateSalary() {
		
		return salary+5000;
		
	}

}
