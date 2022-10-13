package Shop;



import org.openqa.selenium.By;


import Login.LoginWithValidCredential;

public class CartSteps extends LoginWithValidCredential{
	
public static void checkPrice() {
//	(//div[@class='inventory_item_price'])[4]
	
}
public static void openItem() throws InterruptedException {
	
	driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[4]")).click();
	Thread.sleep(2000);
}
public static void clickBackToProducts() throws InterruptedException {
	driver.findElement(By.id("back-to-products")).click();
	Thread.sleep(2000);
}
public static void selectItem1() throws InterruptedException {
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	Thread.sleep(1000);
}
public static void selectItem2() throws InterruptedException {
	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	Thread.sleep(1000);
}

//public static void clickCartItem() throws InterruptedException {
//	driver.findElement(By.id("shopping_cart_container")).click();
//	Thread.sleep(2000);
//}

public static void checkCartItem() throws InterruptedException {
	Thread.sleep(30000);
	driver.findElement(By.xpath("(//div[@class='shopping_cart_link'])[0]")).click();
	//driver.findElement(By.xpath("//div[contains(@class, 'cart_item')]")).click();
	//div[contains(@class, 'cart_item')]
	Thread.sleep(2000);
}
}
