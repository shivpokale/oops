package Interface;

public class WhatsappNotificationServiceImple implements NotificationService{

	@Override
	public void send(String message) {
		
		System.out.println("Whatsapp msg sent: " +message);
		
	}

	@Override
	public String getNotificationStatus() {

		return "Whatsapp msg received";
	}

}
