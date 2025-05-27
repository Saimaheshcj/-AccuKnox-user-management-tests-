package tests;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AdminPage;
import pages.LoginPage;

public class UserManagementTest extends BaseTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        UserManagementTest test = new UserManagementTest();

        // Setup and open browser
        test.setUp();

        // Login
        LoginPage login = new LoginPage(test.driver);
        login.login("Admin", "admin123");

        // Admin page navigation
        AdminPage admin = new AdminPage(test.driver);
        admin.adminTab().click();

        // Add new user
        admin.addUserButton().click();
        admin.userRoleDropdown().click();
        admin.userRoleAdminOption().click();
        admin.employeeNameInput().sendKeys("Ranga Akunuri");
        admin.usernameInput().sendKeys("mahesh1");
        Thread.sleep(1000);
        admin.statusDropdown().click();
        admin.statusEnabledOption().click();
        admin.passwordInput().sendKeys("Saimaheshcj1@123");
        admin.confirmPasswordInput().sendKeys("Saimaheshcj1@123");
        Thread.sleep(1000);
        admin.saveButton().click();
        Thread.sleep(2000);

        // Search for the created user
        admin.filterDropdown().click();
        admin.searchUsernameInput().clear();
        admin.searchUsernameInput().sendKeys("mahesh1");
        Thread.sleep(1000);

        admin.Empnamehint().click();  // Click the suggestion option
        Thread.sleep(1000);

        admin.searchButton().click();
        Thread.sleep(1000);

        // Edit user employee name (example: disable status)
        admin.editIcon().click();
        Thread.sleep(1000);
        admin.statusDisableOption().click();
        Thread.sleep(500);
        admin.saveButton().click();
        Thread.sleep(3000);

        // Delete the user
        admin.searchUsernameInput().clear();
        admin.searchUsernameInput().sendKeys("mahesh1");
        Thread.sleep(1000);
        admin.searchButton().click();
        Thread.sleep(1000);

        admin.deleteIcon().click();  // Click delete icon
        Thread.sleep(1000);
        admin.confirmDeleteButton().click();  // Confirm deletion
        Thread.sleep(3000);

        // Tear down driver and close browser
        test.tearDown();
    }
}
