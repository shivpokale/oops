package InterfaceEx;

public class SMSNotificationServiceImple implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("SMS sent: "+ message);
		
	}

	@Override
	public String getNotificationStatus() {
		
		return "SMS received successfullly";
	}

}
