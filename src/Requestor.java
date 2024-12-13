import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Requestor extends User { // inheritance
    private int requestCount;
    private List<LocalDateTime> requestDates;

    public Requestor(String username, String password, String name, String bloodType) {
        super(username, password, name, bloodType);
        this.requestCount = 0;
        this.requestDates = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Requestor: " + getName() + " (Blood Type: " + getBloodType() + ")");
        System.out.println("Requests made: " + requestCount);
        if (!requestDates.isEmpty()) {
            System.out.println("Request History:");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            for (LocalDateTime date : requestDates) {
                System.out.println("Date: " + date.format(formatter));
            }
        }
    }

    public void requestBlood() {
        requestCount++;
        requestDates.add(LocalDateTime.now());
        updateLastActionTime();
        System.out.println("Blood request submitted for " + getName() + ".");
    }
}

