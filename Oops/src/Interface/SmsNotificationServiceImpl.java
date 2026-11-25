package Interface;

public class SmsNotificationServiceImpl implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("SMS sent: "+ message);
		
	}

	@Override
	public String getNotificationStatus() {
		
		return" SMS received successfully";
	}

}
