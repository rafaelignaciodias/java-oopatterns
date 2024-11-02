package personal.solid.DIP;

class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
