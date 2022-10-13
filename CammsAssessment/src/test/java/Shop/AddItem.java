package Shop;
public class AddItem extends CartSteps{

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		login();
		
		openItem();
		clickBackToProducts();
		selectItem1();
		selectItem2();
		checkCartItem();

	}

}
