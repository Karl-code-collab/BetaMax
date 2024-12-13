import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class User { // serves as a base class for the user + implement the abstraction principle
    private String username;
    private String password;
    private String name;
    private String bloodType;
    private LocalDateTime registrationDate;
    private LocalDateTime lastActionTime;

    public User(String username, String password, String name, String bloodType) { //constructor to initialize a new User object
        this.username = username;
        this.password = password;
        this.name = name;
        this.bloodType = bloodType;
        this.registrationDate = LocalDateTime.now();
        this.lastActionTime = null;
    }

    public abstract void displayInfo(); // displays the user's information

    // Encapsulation getters and setters
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


    public LocalDateTime getLastActionTime() {
        return lastActionTime;
    }

    protected void updateLastActionTime() {
        this.lastActionTime = LocalDateTime.now();
    }

    // Utility method to format dates
    public String getFormattedRegistrationDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return registrationDate.format(formatter);
    }
}

