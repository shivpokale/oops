package InterfaceEx;

public class NotificationAdmin {
	
	public static void main(String[] args) {
	
	NotificationService notificationService;
	
	System.out.println("========EMAIL=========");
	notificationService = new EmailNotificationServiceImple();
	notificationService.send("Your order is placed");
	System.out.println(notificationService.getNotificationStatus());
	
	System.out.println("========Whatsapp========");
	notificationService=new WhatsAppNotificationServiceImple();
	notificationService.send("Use OTP 1234 for your order");
	System.out.println(notificationService.getNotificationStatus());
	
	System.out.println("========SMS==============");
	notificationService=new SMSNotificationServiceImple();
	notificationService.send("Check your whatsapp notification for product");
	System.out.println(notificationService.getNotificationStatus());
	
}

}