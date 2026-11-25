package Variables;

public class Order {
	
	int orderId = 45;
	String orderName = "Laptop";
	String orderAddress = "Pune";
	
	public void displayOrder()
	{
		Order o = new Order();
		System.out.println(o.orderId);
		System.out.println(o.orderName);
		System.out.println(o.orderAddress);
	}
	public void displayCustomer()
	{
		int customerId = 799;
		String customerName = "Maya";
		int pincode = 657856;
		
		System.out.println("==Customer Details==");
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(pincode);
	}
	
	public static void main(String[] args) {
		
		System.out.println("==Order Details==");
		
		Order od = new Order();
		od.displayOrder();
		od.displayCustomer();
	}
	
	

}
