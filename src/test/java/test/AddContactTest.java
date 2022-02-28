package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;


public class AddContactTest {

	WebDriver driver;
	
		String fullName = null;
		String companyName = null;
		String email = null;
		String phone = null;
		String address = null;
		String city = null;	
		String state = null;
		String zip = null;
		String country = null;
@Test
@Parameters({"username", "password", "fullName", "companyName", "email", "phone", "address", "city", "country", "state", "zip"})
	public void validUserShouldBeAbleToAddCoustomer(String userName, String password, String fullname, String companyname, String email, String phone, String address, String city, String country, String state, String zip) {
		driver = BrowserFactory.init();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.insertUserName(userName);
		login.insertPassword(password);
		login.clickSigninButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboard();
		dashboard.clickCustomerButton();
		dashboard.clickAddCustomerButton();
				
		AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
		addContactPage.insertFullName(fullname);
		addContactPage.selectCompany(companyname);
		addContactPage.insertEmail(email);
		addContactPage.insertPhone(phone);
		addContactPage.insertAddress(address);
		addContactPage.insertCity(city);
		
		addContactPage.insertState(state);
		addContactPage.insertZip(zip);
		addContactPage.selectCountry(country);
		addContactPage.clickSaveButton();
		addContactPage.verifyProfilePage();
		
		dashboard.clickListCustomerButton();
		addContactPage.verifyEnterName();
	}

}
