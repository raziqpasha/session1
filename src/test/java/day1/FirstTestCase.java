package day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class FirstTestCase {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeSuite
void openApp() {
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
	}

    @Test
void login() throws InterruptedException {
    	SecondTestCasePageFactory stc=new SecondTestCasePageFactory(driver);
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));


//WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));//.sendKeys(phonenumber); //driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
stc.setusername("Admin");
//WebElement pass= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")));  //driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']"));
stc.setpassword("admin123");

//WebElement login= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));     //  driver.findElement(By.linkText("Login"));
stc.clickbtn();
Thread.sleep(3000);
	}

	@AfterSuite
void closeApp() {
driver.quit();
	
	}
//	@DataProvider(name="dp")
//	 Object data() {
//		Object arr[][]= {
//				{"901937234997654678"},
//				{"9876567899"},
//		};
//		return arr;
//
//		}
	}

