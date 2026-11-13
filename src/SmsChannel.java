public class SmsChannel implements NotificationChannel {
    @Override
    public String id() {
        return "SMS";
    }

    @Override
    public void send(User user, String message) throws NotificationDeliveryException {
        if (user.getPhoneNumber() == null || user.getPhoneNumber().isEmpty()) {
            throw new NotificationDeliveryException(user.getName() + ", SMS - ошибка доставки из-за отсутствующего номера.");
        }

        System.out.println(user.getName() + ", SMS - доставлено.");
    }
}