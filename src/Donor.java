public class Donor extends User {
    private int donationCount;

    public Donor(String username, String password, String name, String bloodType) {
        super(username, password, name, bloodType);
        this.donationCount = 0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Donor: " + getName() + " (Blood Type: " + getBloodType() + ")");
        System.out.println("Donations made: " + donationCount);
    }

    public void donate() {
        donationCount++;
        updateLastActionTime();
        System.out.println("Thank you for your donation, " + getName() + "!");
    }

    public int getDonationCount() {
        return donationCount;
    }
}

