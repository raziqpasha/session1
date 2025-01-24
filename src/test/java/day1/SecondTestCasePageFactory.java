package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondTestCasePageFactory {

	
	 WebDriver driver;
	    
	    // Constructor: No changes
	    public SecondTestCasePageFactory(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver,this);
	    }
	    
	    //locators with page factory
	    @FindBy(xpath="//input[@placeholder='Username']") WebElement txt_username;
	    @FindBy(xpath="//input[@placeholder='Password']") WebElement txt_password;
	    @FindBy(xpath="//button[@type='submit']") WebElement btn_click;
	    
	    
	    // Action methods
	    public void setusername(String user) {
	        txt_username.sendKeys(user);  // FIXED: Removed "txt_username" as string, used the variable directly.
	    }

	    public void setpassword(String pass) {
	       txt_password.sendKeys(pass);  // FIXED: Removed "txt_password" as string, used the variable directly.
	    }

	    public void clickbtn() {
	       btn_click.click();  // FIXED: Added .click() to perform the click action.
	    }
}
