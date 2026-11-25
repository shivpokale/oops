package Abstraction;

public abstract class Payment {
	
	public void startPayment() {
		System.out.println("Payment Started");
	}
	
	public abstract void makePayment();
	
	public void paymentCompleted() {
		System.out.println("Payment Completed");
	}
	

}
