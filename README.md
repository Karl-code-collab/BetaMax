# Blood Donation Management System

## Project Overview

BetaMax, A Blood Donation Management System is a Java-based application designed to streamline and modernize the blood donation process. It addresses the critical challenge of efficiently managing blood donations, donor information, and blood requests in healthcare facilities. The system supports healthcare organizations' mission of saving lives by ensuring a reliable and organized blood supply chain.

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

## Contributing

Contributions to improve the Blood Donation Management System are welcome. Please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).

## Contact

For any queries or suggestions, please contact the project maintainers.

---

Thank you for using the Blood Donation Management System!

