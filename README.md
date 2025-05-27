# -AccuKnox-user-management-tests-

# OrangeHRM User Management Automation

This project automates the **User Management module** in the [OrangeHRM](https://opensource-demo.orangehrmlive.com/) application using **Selenium WebDriver**, **Java**, and the **Page Object Model (POM)** design pattern.

##  Features

- Automates login functionality.
- Adds a new user under Admin → User Management.
- Searches for existing users.
- Deletes a user (if present).
- Implements Page Object Model (POM) for maintainability and scalability.
- Includes `BaseTest` for reusable WebDriver setup and teardown logic.
- Clean folder structure, ideal for interviews or presentations.

##  Tools & Technologies

- Java
- Selenium WebDriver
- Maven
- Page Object Model (POM)
- OrangeHRM Open Source

##  Project Structure



OrangeHRM-Automation/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/
│   │           ├── LoginPage.java
│   │           └── AdminPage.java
│   └── test/
│       └── java/
│           └── tests/
│               ├── BaseTest.java
│               └── UserManagementTest.java
├── drivers/
│   └── chromedriver.exe
├── pom.xml
└── README.md



##  Pre-requisites

- Java JDK 11 or above
- Maven
- Chrome browser
- ChromeDriver (compatible version placed in `drivers/` folder)

## 🚀 Setup Instructions

> You can also run from any IDE like IntelliJ or Eclipse by right-clicking `UserManagementTest.java` and selecting **Run**.

##  Login Credentials (Demo Site)

* **URL:** [https://opensource-demo.orangehrmlive.com/](https://opensource-demo.orangehrmlive.com/)
* **Username:** `Admin`
* **Password:** `admin123`

## 📄 Description of BaseTest

The `BaseTest.java` class is responsible for:

* Setting up the WebDriver before each test
* Opening the OrangeHRM login page
* Quitting the browser after test execution
* Centralizing browser configuration for reuse

All test classes like `UserManagementTest` extend `BaseTest` to avoid redundant setup code.







