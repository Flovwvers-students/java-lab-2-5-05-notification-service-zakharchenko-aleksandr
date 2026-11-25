public class EmailChannel implements NotificationChannel {
    @Override
    public String id() {
        return "Email";
    }

    @Override
    public void send(User user, String message) throws NotificationDeliveryException {
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            throw new NotificationDeliveryException(user.getName()
                    + ", Email - ошибка доставки из-за отсутствующего адреса.");
        }

        System.out.println(user.getName() + ", Email - доставлено на "
                + user.getEmail() + ":\n" + message);
    }
}