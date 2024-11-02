package personal.solid.DIP;

public class Main {
    public static void main(String[] args) {
        // Use Email Notification
        NotificationService emailService = new EmailNotification();
        User userWithEmail = new User(emailService);
        userWithEmail.notifyUser("Hello via Email!");

        // Use SMS Notification
        NotificationService smsService = new SMSNotification();
        User userWithSMS = new User(smsService);
        userWithSMS.notifyUser("Hello via SMS!");
    }
}