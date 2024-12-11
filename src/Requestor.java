public class Requestor extends User {
    private int requestCount;

    public Requestor(String username, String password, String name, String bloodType) {
        super(username, password, name, bloodType);
        this.requestCount = 0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Requestor: " + getName() + " (Blood Type: " + getBloodType() + ")");
        System.out.println("Requests made: " + requestCount);
    }

    public void requestBlood() {
        requestCount++;
        updateLastActionTime();
        System.out.println("Blood request submitted for " + getName() + ".");
    }
}

