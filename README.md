# Blood Donation Management System

## Project Overview

The Blood Donation Management System is a Java-based application designed to streamline and modernize the blood donation process. It addresses the critical challenge of efficiently managing blood donations, donor information, and blood requests in healthcare facilities. The system supports healthcare organizations' mission of saving lives by ensuring a reliable and organized blood supply chain.

## Features

- User Registration and Login (Donors, Requestors, and Admins)
- Blood Donation Management
- Blood Request Management
- Blood Bank Inventory Tracking
- Admin Dashboard for User Management

## Classes

1. **User**: Abstract base class for all user types.
2. **Donor**: Represents blood donors in the system.
3. **Requestor**: Represents individuals requesting blood.
4. **Admin**: Represents system administrators with elevated privileges.
5. **BloodBank**: Manages the blood inventory.
6. **BloodDonationSystem**: Core class that integrates all components.
7. **BetaMax**: Main class with the user interface and program flow.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor

### Running the Application

1. Compile all Java files in the project.
2. Run the `BetaMax` class, which contains the `main` method.

## How to Use

1. Start the application by running the `BetaMax` class.
2. You'll be presented with the main menu. Choose from the following options:
    - To use the system as a donor or requestor, select "Register" to create a new account, or "Login" if you already have an account.
    - To access admin features, use the "Admin Login" option.
    - To learn more about the system, select "About BetaMax".
3. After logging in:
    - Donors can donate blood and view their donation history.
    - Requestors can request blood, view their request history, and check the blood bank inventory.
    - Admins can view all users and check the blood bank inventory.
4. Follow the on-screen prompts to navigate through the system and perform desired actions.
5. Always select the "Logout" or "Exit" option when you're done to safely close your session.

## Sustainable Development Goals (SDGs)

This project aligns with the following UN Sustainable Development Goals:

- SDG 3: Good Health and Well-being
    - By facilitating efficient blood donation and distribution, this system contributes to improving health services and saving lives.
- SDG 9: Industry, Innovation, and Infrastructure
    - The project represents a technological innovation in healthcare management, improving the infrastructure for blood donation services.
- SDG 17: Partnerships for the Goals
    - By connecting donors, requestors, and healthcare facilities, this system fosters partnerships to achieve better health outcomes.

## Libraries Used

This project is built using core Java libraries and does not require any external dependencies. The main libraries used include:

- `java.util.*`: For various utility classes like ArrayList, HashMap, etc.
- `java.time.*`: For handling dates and times.
- `java.util.Scanner`: For user input.

## Predefined Data

The system comes with some predefined data for testing and demonstration purposes:

- An admin account is created by default:
    - Username: admin
    - Password: imissyou
- The BloodBank is initialized with zero units for all blood types:
    - A+, A-, B+, B-, AB+, AB-, O+, O-
- No donor or requestor accounts are pre-created; users need to register these accounts.

## Usage

Upon running the application, users are presented with a main menu:

1. Login
2. Register
3. About BetaMax
4. Admin Login
5. Exit

Users can register as donors or requestors, login to their accounts, and perform various actions based on their role.

### Donor Actions
- Donate Blood
- View Donation History

### Requestor Actions
- Request Blood
- View Request History
- View Blood Bank Inventory

### Admin Actions
- View All Users
- View Blood Bank Inventory


Thank you for using the Blood Donation Management System!

