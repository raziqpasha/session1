package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondTestCase {
    WebDriver driver;
    
    // Constructor: No changes
    public SecondTestCase(WebDriver driver) {
        this.driver = driver;
    }

    // Locators: without page factory
    By txt_username = By.xpath("//input[@placeholder='Username']");
    By txt_password = By.xpath("//input[@placeholder='Password']");
    By btn_click = By.xpath("//button[@type='submit']");
    
    // Action methods
    public void setusername(String user) {
        // Corrected: Changed to use the actual locator variable instead of the string
        driver.findElement(txt_username).sendKeys(user);  // FIXED: Removed "txt_username" as string, used the variable directly.
    }

    public void setpassword(String pass) {
        // Corrected: Changed to use the actual locator variable instead of the string
        driver.findElement(txt_password).sendKeys(pass);  // FIXED: Removed "txt_password" as string, used the variable directly.
    }

    public void clickbtn() {
        // Corrected: Added .click() to perform the action of clicking the button
        driver.findElement(btn_click).click();  // FIXED: Added .click() to perform the click action.
    }
}
