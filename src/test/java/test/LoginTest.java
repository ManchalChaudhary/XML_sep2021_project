package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;


public class LoginTest {
	
	WebDriver driver;
	
	
	String userName = null;
	String password = null;

	@Test
	@Parameters({"username", "password"})
	public void validUserShouldBeAbleToLogIn(String userName, String password) {

		driver = BrowserFactory.init();
				
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.insertUserName(userName);
		login.insertPassword(password);
		login.clickSigninButton();
		
	//	DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
	//	dashboard.verifyDashboard();
		
		BrowserFactory.tearDown();
			
	}

}
