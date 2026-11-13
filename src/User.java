import java.util.Set;

public class User {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private Set<String> enabledChannels;

    public User(String id, String name, String email, String phoneNumber, Set<String> enabledChannels) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.enabledChannels = enabledChannels;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isNotificationEnabled(String channelId) {
        return enabledChannels.contains(channelId);
    }
}