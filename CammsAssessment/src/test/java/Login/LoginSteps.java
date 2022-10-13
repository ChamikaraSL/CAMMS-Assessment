package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
	public static WebDriver driver;
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\chromedriver.exe");
        driver = new ChromeDriver();
	}
	public static void openURL() {
		 // Open URL
        driver.get("https://www.saucedemo.com/");
	}
	public static void maximizeBrowser() {
		// Maximise the Browser
        driver.manage().window().maximize();
	}
	public static void enterValidUserName() {
			
        try {
        	driver.findElement(By.id("user-name")).clear();
            driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
	}
	public static void enterValidPassword() {
		 try {
	        	driver.findElement(By.id("password")).clear();
	            driver.findElement(By.id("password")).sendKeys("secret_sauce");
	            Thread.sleep(2000);
	        }catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	public static void clickOnLogin() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
}
