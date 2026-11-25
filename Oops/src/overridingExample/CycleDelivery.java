package overridingExample;

public class CycleDelivery extends DeliveryPartner{
	
	@Override
	void calculateDeliveryCharge() {
		System.out.println("Cycle Delivery Charge: "+ "20");
	}

}
