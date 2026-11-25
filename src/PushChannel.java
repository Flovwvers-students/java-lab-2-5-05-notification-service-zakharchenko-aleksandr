public class PushChannel implements NotificationChannel {
    @Override
    public String id() {
        return "Push";
    }

    @Override
    public void send(User user, String message) throws NotificationDeliveryException {
        if (user.getId() == null || user.getId().isEmpty()) {
            throw new NotificationDeliveryException(user.getName()
                    + ", Push - ошибка доставки из-за отсутствующего ID.");
        }

        System.out.println(user.getName() + ", Push - доставлено на ID "
                + user.getId() + ":\n" + message);
    }
}