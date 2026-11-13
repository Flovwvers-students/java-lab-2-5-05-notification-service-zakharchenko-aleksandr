import java.util.List;

public class NotificationService {
    public void broadcast(List<User> users, Notification notification, List<NotificationChannel> channels) {
        String message = notification.format();

        for (User user : users) {
            for (NotificationChannel channel : channels) {
                if (!user.isNotificationEnabled(channel.id())) {
                    System.out.println(user.getName() + ", " + channel.id() + " - пропущено.");
                } else {
                    try {
                        channel.send(user, message);
                    } catch (NotificationDeliveryException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
            }
        }
    }
}