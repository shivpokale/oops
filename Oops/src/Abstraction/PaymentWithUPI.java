package Abstraction;

public class PaymentWithUPI extends Payment {

	@Override
	public void makePayment() {
		System.out.println("Payment done with UPI");
	}
	
	public static void main(String[] args) {
		
		Payment payment;
		
		payment = new PaymentWithNetBanking();
		System.out.println("Net Banking");
		payment.startPayment();
		payment.makePayment();
		payment.paymentCompleted();
		
		PaymentWithUPI upi=new PaymentWithUPI();
		
		payment = new PaymentWithUPI();
		System.out.println();
		System.out.println("UPI Banking");
		payment.startPayment();
		payment.makePayment();
		payment.paymentCompleted();
		
		
	}
	
	

}
