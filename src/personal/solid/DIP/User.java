package personal.solid.DIP;

class User {
    private NotificationService notificationService;

    // Dependency Injection through constructor
    public User(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message) {
        notificationService.sendNotification(message);
    }
}
