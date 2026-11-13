public class DeadlineReminderNotification extends Notification {
    private String assignmentName;
    private String deadlineDate;

    public DeadlineReminderNotification(String title, String assignmentName, String deadlineDate) {
        super(title);
        this.assignmentName = assignmentName;
        this.deadlineDate = deadlineDate;
    }

    @Override
    protected String formatBody() {
        return "Срок сдачи работы „" + assignmentName + "“ - " + deadlineDate;
    }
}