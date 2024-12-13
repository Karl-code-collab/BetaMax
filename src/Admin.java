import java.util.List;
import java.time.format.DateTimeFormatter;

public class Admin extends User { // inheritance
    public Admin(String username, String password, String name) {
        super(username, password, name, "N/A");
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin: " + getName());
    }

    public void displayAllUsers(BloodDonationSystem system) {
        List<User> users = system.getAllUsers();
        System.out.println("\n--- Registered Users ---");
        System.out.println("Username | Name | Role | Blood Type | Registration Date | Last Action");
        System.out.println("---------------------------------------------------------------------------------------");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        for (User user : users) {
            String role = getUserRole(user);
            String lastAction = user.getLastActionTime() != null ?
                    user.getLastActionTime().format(formatter) : "N/A";
            String regDate = user.getFormattedRegistrationDate();

            System.out.printf("%-8s | %-15s | %-9s | %-10s | %-17s | %s%n",
                    user.getUsername(),
                    user.getName(),
                    role,
                    user.getBloodType(),
                    regDate,
                    lastAction);

            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }

    private String getUserRole(User user) {
        if (user instanceof Donor) return "Donor";
        if (user instanceof Requestor) return "Requestor";
        if (user instanceof Admin) return "Admin";
        return "Unknown";
    }
}

