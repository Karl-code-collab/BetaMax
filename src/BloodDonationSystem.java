import java.util.ArrayList;
import java.util.List;

public class BloodDonationSystem {
    private List<User> users;
    private BloodBank bloodBank;

    public BloodDonationSystem() {
        users = new ArrayList<>();
        bloodBank = new BloodBank();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public void donateBlood(Donor donor) {
        donor.donate();
        bloodBank.addBlood(donor.getBloodType(), 1);
    }

    public void requestBlood(Requestor requestor) {
        requestor.requestBlood();
        if (bloodBank.removeBlood(requestor.getBloodType(), 1)) {
            System.out.println("Blood request fulfilled for " + requestor.getName() + ".");
        } else {
            System.out.println("Sorry, no " + requestor.getBloodType() + " blood available at the moment.");
        }
    }

    public void displayBloodBankInventory() {
        bloodBank.displayInventory();
    }
}

