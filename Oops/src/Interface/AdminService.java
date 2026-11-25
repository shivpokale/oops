package Interface;

public class AdminService {
	
	public static void main(String[] args) {
		
		NotificationService notificationService;
		
		System.out.println("============Email=========");
		System.out.println( );
		notificationService = new EmailNotificationServiceImple();
		notificationService.send("Order has been placed");
		System.out.println(notificationService.getNotificationStatus());
		
		System.out.println( );
		System.out.println("==========Whatsapp============");
		System.out.println();
		notificationService = new WhatsappNotificationServiceImple();
		notificationService.send("The order will be deliver by tomorrow");
		System.out.println(notificationService.getNotificationStatus());
		
		System.out.println();
		System.out.println("========Sms==========");
		System.out.println();
		notificationService = new SmsNotificationServiceImpl();
		notificationService.send("1237 is your OTP");
		System.out.println(notificationService.getNotificationStatus());
	}

}
