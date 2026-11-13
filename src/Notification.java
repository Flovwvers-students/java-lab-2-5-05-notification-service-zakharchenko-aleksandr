public abstract class Notification {
    private String title;

    public Notification(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String format() {
        return title + "\n" + formatBody();
    }

    protected abstract String formatBody();
}