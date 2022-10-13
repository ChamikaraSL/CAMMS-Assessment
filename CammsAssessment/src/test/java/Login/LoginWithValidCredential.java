package Login;

public class LoginWithValidCredential extends LoginSteps {
	public static void main(String[] args) throws InterruptedException {
      login();
    }
	public static void login() throws InterruptedException {
		openBrowser();
	      openURL();
	      maximizeBrowser();
	      enterValidUserName();
	      enterValidPassword();
	      clickOnLogin();
	}
}
