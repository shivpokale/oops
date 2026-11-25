package Interface;

public class EmailNotificationServiceImple implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("Email sent:"+ message);
		
	}

	@Override
	public String getNotificationStatus() {
		return "Email received succesfully";
	}

}
