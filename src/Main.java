import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String annaId = "1";
        String annaName = "Анна";
        String annaEmail = "anna@example.com";
        String annaPhone = null;
        Set<String> annaChannels = Set.of("Email", "SMS");
        User anna = new User(annaId, annaName, annaEmail, annaPhone, annaChannels);

        String borisId = "2";
        String borisName = "Борис";
        String borisEmail = "boris@example.com";
        String borisPhone = "+79990001122";
        Set<String> borisChannels = Set.of("SMS", "Push");
        User boris = new User(borisId, borisName, borisEmail, borisPhone, borisChannels);

        List<User> users = Arrays.asList(anna, boris);
        NotificationService service = new NotificationService();

        System.out.println("=== Первый запуск ===");

        String changeTitle = "Уведомление";
        String newRoom = "304";
        Notification changeNotification = new ClassroomChangeNotification(changeTitle, newRoom);
        List<NotificationChannel> firstRunChannels = Arrays.asList(new EmailChannel(), new SmsChannel());

        service.broadcast(users, changeNotification, firstRunChannels);

        System.out.println("\n=== Второй запуск ===");

        String reminderTitle = "Напоминание";
        String assignmentName = "Лабораторная № 5";
        String deadlineDate = "13 ноября";
        Notification deadlineNotification = new DeadlineReminderNotification(
                reminderTitle, assignmentName, deadlineDate
        );
        List<NotificationChannel> secondRunChannels = Arrays.asList(
                new EmailChannel(), new SmsChannel(), new PushChannel()
        );

        service.broadcast(users, deadlineNotification, secondRunChannels);
    }
}