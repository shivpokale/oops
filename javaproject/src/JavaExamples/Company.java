package JavaExamples;

public class Company {
	
	public void addCompany()
	{
		System.out.println("===Company details===");
		System.out.println("Company name : tcs");
		System.out.println("Company address : pune");
	}
	
	public void addEmployee()
	{
		System.out.println("==Employee Details===");
		System.out.println("Employee name : Shiv");
		System.out.println("Employee salary : 8lpa");
	}
	
	public void addProjectDetails()
	{
		System.out.println("===Project Details==");
		System.out.println("Project : Banking");
		System.out.println("No of employees in project : 30");
	}
	
	public static void main(String[] args) {
		Company c = new Company();
		c.addCompany();
		c.addEmployee();
		c.addProjectDetails();
	}

}
