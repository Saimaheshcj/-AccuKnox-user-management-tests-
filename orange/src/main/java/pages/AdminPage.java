package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {
    WebDriver driver;
    WebDriverWait wait;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement adminTab() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']")));
    }

    public WebElement addUserButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(normalize-space(), 'Add')]")));
    }

    public WebElement userRoleDropdown() {
        return driver.findElement(By.xpath("//label[text()='User Role']/following::div[contains(@class,'oxd-select-text-input')][1]"));
    }

    public WebElement userRoleAdminOption() {
        return driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Admin']"));
    }

    public WebElement employeeNameInput() {
        return driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
    }

    public WebElement usernameInput() {
        return driver.findElement(By.xpath("//label[text()='Username']/following::input[1]"));
    }

    public WebElement statusDropdown() {
        return driver.findElement(By.xpath("//label[text()='Status']/following::div[contains(@class,'oxd-select-text-input')][1]"));
    }

    public WebElement statusEnabledOption() {
        return driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Enabled']"));
    }

    public WebElement statusDisableOption() {
        return driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Disabled']"));
    }

    public WebElement passwordInput() {
        return driver.findElement(By.xpath("//label[text()='Password']/following::input[1]"));
    }

    public WebElement confirmPasswordInput() {
        return driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[1]"));
    }

    public WebElement saveButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(normalize-space(),'Save')]")));
    }

    public WebElement filterDropdown() {
        return driver.findElement(By.xpath("(//button[@type='button'])[4]"));
    }

    public WebElement searchUsernameInput() {
        return driver.findElement(By.xpath("//input[contains(@class,'oxd-input--active')]"));
    }

    public WebElement Empnamehint() {
        return driver.findElement(By.xpath("//div[@role='listbox']//div[@role='option'][1]"));
    }

    public WebElement searchButton() {
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }

    public WebElement editIcon() {
        return driver.findElement(By.xpath("//i[contains(@class,'bi-pencil-fill')]"));
    }

    public WebElement deleteIcon() {
        return driver.findElement(By.xpath("//div[@role='row']//div[text()='mahesh1']/following-sibling::div//button[contains(@class,'oxd-icon-button--danger')]"));
    }

    public WebElement confirmDeleteButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Yes, Delete') or contains(text(),'Confirm')]")));
    }
}
