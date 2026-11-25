package returnTypeProject;

public class Office {
	
	AllEmployee getAllEmployee() {
		AllEmployee Ae=new AllEmployee();
		
		Ae.E1.empId=111;
		Ae.E1.empName="Shivkanya";
		Ae.E1.empAddress="Nagpur";
		
		Ae.E2.empId=112;
		Ae.E2.empName="Gayatri";
		Ae.E2.empAddress="Ahilyanagar";
		
		return Ae;
		
	}
}
