package CheckoutCart;

import java.util.Random;

import org.openqa.selenium.By;

import Shop.CartSteps;

public class CheckoutSteps extends CartSteps {
	public static String generatedString;
	
	public static void clickCheckout() throws InterruptedException {
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
	}
	public static void enterRandomFirstName() {
		generateRandomString();
		driver.findElement(By.id("first-name")).clear();
        driver.findElement(By.id("first-name")).sendKeys(generatedString); 
	}
	public static void enterRandomLastName() {
		generateRandomString();
		driver.findElement(By.id("last-name")).clear();
        driver.findElement(By.id("last-name")).sendKeys(generatedString);
	}
	public static void enterZipCode() {
//		generateRandomZipCode();
		driver.findElement(By.id("postal-code")).clear();
        driver.findElement(By.id("postal-code")).sendKeys("10280");
	}
	
	public static  void generateRandomString() {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        generatedString = buffer.toString();

        System.out.println(generatedString);
    }
//public static void generateRandomZipCode(){
//	  
//	Random randomGenerator = new Random();  
////	randomInt = randomGenerator.nextfloat(1000);  
//	
//}

public static void clickContinuet() throws InterruptedException {
	driver.findElement(By.id("continue")).click();
	Thread.sleep(2000);
}

public static void clickFinish() throws InterruptedException {
	driver.findElement(By.id("finish")).click();
	Thread.sleep(2000);
}
}