package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//methods //variables:Attributes, Fields
	//Java is associated with classes and objects
	//Login Data
	String USER_NAME = "demo@techfios.com";
	String PASSWORD = "abc123";
		
		
		By userNameField = By.xpath("//input[@id='username']");
		By passwordField = By.xpath("//*[@id=\"password\"]");
		By signinButtonField = By.xpath("/html/body/div/div/div/form/div[3]/button");
		
		@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USERNAME_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_BUTTON_ELEMENT;
		
		//individual methods
		public void insertUserName(String userName) {
			USERNAME_ELEMENT.sendKeys(userName);
		}
		public void insertPassword(String password) {
			PASSWORD_ELEMENT.sendKeys(password);
		}
		public void clickSigninButton() {
			SIGNIN_BUTTON_ELEMENT.click();
		}
		
		//together
		public void loginTest(String userName, String password) {
			USERNAME_ELEMENT.sendKeys(userName);
			PASSWORD_ELEMENT.sendKeys(password);
			SIGNIN_BUTTON_ELEMENT.click();
		}
}
