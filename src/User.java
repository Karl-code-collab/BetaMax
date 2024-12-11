import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class User {
    private String username;
    private String password;
    private String name;
    private String bloodType;
    private LocalDateTime registrationDate;
    private LocalDateTime lastActionTime;

    public User(String username, String password, String name, String bloodType) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.bloodType = bloodType;
        this.registrationDate = LocalDateTime.now();
        this.lastActionTime = null;
    }

    public abstract void displayInfo();

    // Existing getters and setters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getBloodType() {
        return bloodType;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public LocalDateTime getLastActionTime() {
        return lastActionTime;
    }

    protected void updateLastActionTime() {
        this.lastActionTime = LocalDateTime.now();
    }

    // New getter for registration date
    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    // Utility method to format dates
    public String getFormattedRegistrationDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return registrationDate.format(formatter);
    }
}

