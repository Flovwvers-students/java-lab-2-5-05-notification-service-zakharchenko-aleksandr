public interface NotificationChannel {
    String id();

    void send(User user, String message) throws NotificationDeliveryException;
}