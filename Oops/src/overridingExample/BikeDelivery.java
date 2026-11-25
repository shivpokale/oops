package overridingExample;

public class BikeDelivery extends DeliveryPartner {
	
	@Override
	void calculateDeliveryCharge() {
		
		System.out.println("Bike Delivery charge: "+ "30");
		
		
	}
	
	

}
