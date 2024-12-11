import java.util.*;

public class BetaMax {
    static Scanner scanner;
    private BloodDonationSystem system;

    public BetaMax() {
        scanner = new Scanner(System.in);
        system = new BloodDonationSystem();
        Admin admin = new Admin("admin", "imissyou", "System Admin");
        system.addUser(admin);
    }

    public static void main(String[] args) {
        BetaMax betaMax = new BetaMax();
        betaMax.run();
    }

    public void run() {
        while (true) {
            displayMainMenu();
            int choice = getMenuChoice();
            handleMenuChoice(choice);
        }
    }

    private void displayMainMenu() {
        System.out.println("\n------------------ Main Menu ------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. About BetaMax");
        System.out.println("4. Admin Login");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    private int getMenuChoice() {
        return scanner.nextInt();
    }

    private void handleMenuChoice(int choice) {
        scanner.nextLine(); // Consume newline
        switch (choice) {
            case 1:
                loginUser();
                break;
            case 2:
                createAccount();
                break;
            case 3:
                about();
                break;
            case 4:
                adminLogin();
                break;
            case 5:
                System.out.println("Thank you for using BetaMax. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private void loginUser() {
        System.out.println("---------------------------------- LOGIN ACCOUNT ----------------------------------");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = system.login(username, password);
        if (user != null) {
            System.out.println("Login successful!");
            if (user instanceof Donor) {
                donorMenu((Donor) user);
            } else if (user instanceof Requestor) {
                requestorMenu((Requestor) user);
            }
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private void createAccount() {
        System.out.println("---------------------------------- REGISTER ACCOUNT ----------------------------------");
        System.out.print("Create username: ");
        String username = scanner.nextLine();

        String password;
        while (true) {
            System.out.print("Create Password: ");
            password = scanner.nextLine();

            System.out.print("Confirm Password: ");
            String confirmPassword = scanner.nextLine();

            if (password.equals(confirmPassword)) {
                break;
            } else {
                System.out.println("Passwords do not match. Please try again.");
            }
        }

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your blood type: ");
        String bloodType = scanner.nextLine();
        System.out.print("Register as a donor or requestor: ");
        String role = scanner.nextLine();

        User newUser;
        if (role.equalsIgnoreCase("donor")) {
            newUser = new Donor(username, password, name, bloodType.toUpperCase());
        } else if (role.equalsIgnoreCase("requestor")) {
            newUser = new Requestor(username, password, name, bloodType.toUpperCase());
        } else {
            System.out.println("Invalid role. Account creation failed.");
            return;
        }

        system.addUser(newUser);
        System.out.println("Account created successfully!");
    }
    private void donorMenu(Donor donor) {
        while (true) {
            System.out.println("\n--- Donor Menu ---");
            System.out.println("1. Donate Blood");
            System.out.println("2. View Donation History");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    system.donateBlood(donor);
                    break;
                case 2:
                    donor.displayInfo();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void requestorMenu(Requestor requestor) {
        while (true) {
            System.out.println("\n--- Requestor Menu ---");
            System.out.println("1. Request Blood");
            System.out.println("2. View Request History");
            System.out.println("3. View Blood Bank Inventory");
            System.out.println("4. Logout");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    system.requestBlood(requestor);
                    break;
                case 2:
                    requestor.displayInfo();
                    break;
                case 3:
                    system.displayBloodBankInventory();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void adminLogin() {
        System.out.println("---------------------------------- ADMIN LOGIN ----------------------------------");
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();

        User user = system.login(username, password);
        if (user instanceof Admin) {
            System.out.println("Admin login successful!");
            adminMenu((Admin) user);
        } else {
            System.out.println("Invalid admin credentials. Please try again.");
        }
    }

    private void adminMenu(Admin admin) {
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. View All Users");
            System.out.println("2. View Blood Bank Inventory");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    admin.displayAllUsers(system);
                    break;
                case 2:
                    system.displayBloodBankInventory();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public void about() {
        System.out.println("---------------------------------- ABOUT BETAMAX ----------------------------------");
        System.out.println("The BetaMax Blood Donation Management System exists to streamline and modernize the \n" +
                "blood donation process. It addresses the critical challenge of efficiently managing \n" +
                "blood donations, donor information, and blood requests in healthcare facilities.\n" +
                "The System supports healthcare organizations' mission of saving lives by ensuring a\n" +
                "reliable and organized blood supply chain.");

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("(1) Back to Menu \t|\t (2) Exit");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.print("Choose an option: ");
        int aboutChoice = scanner.nextInt();
        scanner.nextLine();

        switch (aboutChoice){
            case 1:
                break;
            case 2:
                System.out.println("Thank you for using BetaMax. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
}

