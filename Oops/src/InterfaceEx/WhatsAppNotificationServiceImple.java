package InterfaceEx;

public class WhatsAppNotificationServiceImple implements NotificationService{

	@Override
	public void send(String message) {
		
		System.out.println("Whatsapp message received: "+ message);
	}

	@Override
	public String getNotificationStatus() {
		
		return "Whatsapp message received successfully";
	}

}
