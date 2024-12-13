import java.util.HashMap;
import java.util.Map;

public class BloodBank { // abstraction
    private Map<String, Integer> bloodInventory;

    public BloodBank() {
        bloodInventory = new HashMap<>();
        bloodInventory.put("A+", 0);
        bloodInventory.put("A-", 0);
        bloodInventory.put("B+", 0);
        bloodInventory.put("B-", 0);
        bloodInventory.put("AB+", 0);
        bloodInventory.put("AB-", 0);
        bloodInventory.put("O+", 0);
        bloodInventory.put("O-", 0);
    }

    //adding blood
    public void addBlood(String bloodType, int units) {
        int currentUnits = bloodInventory.get(bloodType);
        bloodInventory.put(bloodType, currentUnits + units);
    }

    //removing blood
    public boolean removeBlood(String bloodType, int units) {
        int currentUnits = bloodInventory.get(bloodType);
        if (currentUnits >= units) {
            bloodInventory.put(bloodType, currentUnits - units);
            return true;
        }
        return false;
    }

    public void displayInventory() {
        System.out.println("Blood Bank Inventory:");
        for (Map.Entry<String, Integer> entry : bloodInventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " units");
        }
    }
}

