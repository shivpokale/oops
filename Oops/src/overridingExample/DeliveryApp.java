package overridingExample;

public class DeliveryApp {
	
	public static void main(String[] args) {
		
	
		
		DeliveryPartner d1 = new DeliveryPartner();
		DeliveryPartner d2= new BikeDelivery();
		DeliveryPartner d3 = new CycleDelivery();
		
		d1.calculateDeliveryCharge();
		d2.calculateDeliveryCharge();
		d3.calculateDeliveryCharge();
		
	}

}
