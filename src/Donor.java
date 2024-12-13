import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Donor extends User { // inheritance
    private int donationCount;
    private List<LocalDateTime> donationDates;

    public Donor(String username, String password, String name, String bloodType) {
        super(username, password, name, bloodType);
        this.donationCount = 0;
        this.donationDates = new ArrayList<>();
    }

    @Override //polymorphism (declared in the user class and overridden in its subclasses)
    public void displayInfo() {
        System.out.println("Donor: " + getName() + " (Blood Type: " + getBloodType() + ")");
        System.out.println("Donations made: " + donationCount);
        if (!donationDates.isEmpty()) {
            System.out.println("Donation History:");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            for (LocalDateTime date : donationDates) {
                System.out.println("Date: " + date.format(formatter));
            }
        }
    }

    public void donate() {
        donationCount++;
        donationDates.add(LocalDateTime.now());
        updateLastActionTime();
        System.out.println("Thank you for your donation, " + getName() + "!");
    }
}

