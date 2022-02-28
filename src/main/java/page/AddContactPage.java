package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AddContactPage extends BasePage {

	WebDriver driver;

	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement ZIP_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SUBMIT_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[@id='summary']")
	WebElement SUMMARY_ON_PROFILE_ELEMENT;

	public void insertFullName(String username) {

		FULL_NAME_ELEMENT.sendKeys(username + generateRandomNo(999));
	}

	public void selectCompany(String company) {
		selectFromDropdown(COMPANY_NAME_ELEMENT, company);
	}

	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNo(9999) + email);

	}

	public void insertPhone(String phone) {
		PHONE_ELEMENT.sendKeys(phone + generateRandomNo(99));
	}

	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
	}

	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys(city);
	}
	
	public void selectCountry(String country) {

		selectFromDropdown(COUNTRY_ELEMENT, country);
		
	}

	public void insertState(String state) {
		STATE_ELEMENT.sendKeys(state);
	}

	public void insertZip(String zip) {
		ZIP_ELEMENT.sendKeys(zip);
	}

	

	public void clickSaveButton() {
		SUBMIT_BUTTON_ELEMENT.click();
	}

	public void verifyProfilePage() {

		waitForElement(driver, 5, SUMMARY_ON_PROFILE_ELEMENT);
		
	}
 
	
	String beforeXpath = "//tbody/tr[";
	String afterXpath = "]/td[3]";
	public void verifyEnterName() {
		
	for(int i=1; i<=10; i++) {
		String enteredName = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
		System.out.println(enteredName);
		break;
	}
	}

}
