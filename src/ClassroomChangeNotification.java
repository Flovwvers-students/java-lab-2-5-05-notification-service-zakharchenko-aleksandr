public class ClassroomChangeNotification extends Notification {
    private String newRoom;

    public ClassroomChangeNotification(String title, String newRoom) {
        super(title);
        this.newRoom = newRoom;
    }

    @Override
    protected String formatBody() {
        return "Пара перенесена в аудиторию " + newRoom;
    }
}