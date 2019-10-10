package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.Utils;

public class RegistrationPage extends BasePage {

	static By accountCreationForm = By.id("account-creation_form");
	static By mrTitle = By.id("id_gender1");
	static By mrsTitle = By.id("id_gender2");
	static By customerFirstname = By.id("customer_firstname");
	static By customerLastname = By.id("customer_lastname");
	static By Email = By.id("email");
	static By password = By.id("passwd");

	static By birthDay = By.id("days");
	static By birthMonth = By.id("months");
	static By birthYear = By.id("years");

	static By newsletter = By.xpath("//input[@id =\"newsletter\"]");
	static By specialOffer = By.xpath("//input[@id =\"optin\"]");

	static By firstname = By.id("firstname");
	static By lastname = By.id("lastname");

	static By company = By.id("company");
	static By address1 = By.id("address1");
	static By address2 = By.id("address2");
	static By city = By.id("city");

	static By state = By.xpath("//select[@id =\"id_state\"]");
	static By postcode = By.id("postcode");
	static By country = By.xpath("//select[@id= \"id_country\"]/option[@value =\"21\"]");
	static By otherinfo = By.id("other");

	static By homePhone = By.id("phone");
	static By mobilePhone = By.id("phone_mobile");
	
	static By alias = By.id("alias");
	static By submitAccount = By.id("submitAccount");

	public RegistrationPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	// getters

	
	public WebElement getWebElement(By by) {
		return Utils.waitForPresenceOfAutoElement(by);
	}
	
	public static WebElement getMrRadioButton() {
		return Utils.waitForPresenceOfAutoElement(mrTitle);
	}

	public static WebElement getMrsRadioButton() {
		return Utils.waitForPresenceOfAutoElement(mrsTitle);
	}

	private static WebElement getcustomerFirstnameField() {
		return Utils.waitForPresenceOfAutoElement(customerFirstname);
	}

	private static WebElement getcustomerLastnameField() {
		return Utils.waitForPresenceOfAutoElement(customerLastname);
	}

	private static WebElement getPasswordField() {
		return Utils.waitForPresenceOfAutoElement(password);
	}

	public static WebElement getBirthDayField() {
		return Utils.waitForPresenceOfAutoElement(birthDay);
	}

	public static WebElement getBirthMonthField() {
		return Utils.waitForPresenceOfAutoElement(birthMonth);
	}

	public static WebElement getBirthYearField() {
		return Utils.waitForPresenceOfAutoElement(birthYear);
	}
	
	public static WebElement  getSignupForNewsletterCheckbox() {
		return Utils.waitForPresenceOfAutoElement(newsletter);
	}
	public static WebElement getReceiveOfferCheckbox() {
		return Utils.waitForPresenceOfAutoElement(specialOffer);
	}
	
	public static WebElement getFirstName() {
		return Utils.waitForPresenceOfAutoElement(firstname);
	}
	
	public static WebElement getLastName() {
		return Utils.waitForPresenceOfAutoElement(lastname);
	}
	
	public static WebElement getCompanyField() {
		return Utils.waitForPresenceOfAutoElement(company);
	}
	public static WebElement getAddress1() {
		return Utils.waitForPresenceOfAutoElement(address1);
	}
	
	public static WebElement getAddres2() {
		return Utils.waitForPresenceOfAutoElement(address2);
	}
	
	private static WebElement getCity() {
		return Utils.waitForPresenceOfAutoElement(city);
	}
	
	private static WebElement getZicode() {
		return Utils.waitForPresenceOfAutoElement(postcode);
	}
	public static WebElement getState() {
		return Utils.waitForPresenceOfAutoElement(state);
	}
	
	public static WebElement getAdditionalInfo() {
		return Utils.waitForPresenceOfAutoElement(otherinfo);
	}
	
	public static WebElement getHomePhone() {
		return Utils.waitForPresenceOfAutoElement(homePhone);
	}
	
	public static WebElement getMobilephone() {
		return Utils.waitForPresenceOfAutoElement(mobilePhone);
	}
	
	public static WebElement getAlias() {
		return Utils.waitForPresenceOfAutoElement(alias);
	}
	
	public static WebElement getRegisterButton() {
		return Utils.waitForLinkToBeClickable(submitAccount);
	}
	

	// setters
	public static void clickMr() {
		if (!getMrRadioButton().isSelected()) {
			getMrRadioButton().click();
		}
	}

	public static void clickMrs() {
		if (!getMrsRadioButton().isSelected()) {
			getMrsRadioButton().click();
		}
	}

	public static void setcustomerFirstnameField(String firstName) {
		getcustomerFirstnameField().sendKeys(firstName);
	}

	public static void setcustomerLastnameField(String secondName) {
		getcustomerLastnameField().sendKeys(secondName);
	}

	public static void setRegistrationEmailAddress(String string) {
		// TODO Auto-generated method stub

	}

	public static void setcustomerPasswordField(String password) {
		getPasswordField().sendKeys(password);

	}

	public static void setcustomerBirthDate(String string, String string2, String string3) {
		// TODO Auto-generated method stub

	}

	public static void signupForNewsletter() {
		if(!getSignupForNewsletterCheckbox().isSelected()) {
			getSignupForNewsletterCheckbox().click();
		}
		

	}

	public static void AcceptToReceiveSpecialOffersFromPartners() {
		if(!getReceiveOfferCheckbox().isSelected()) {
			getReceiveOfferCheckbox().click();
		}

	}

	public static void setFirstname(String fname) {
		getFirstName().sendKeys(fname);

	}

	public static void setLastName(String lname) {
		getLastName().sendKeys(lname);

	}

	public static void setCompanyName(String string) {
		// TODO Auto-generated method stub

	}
	public static void setAddressLine1(String address1) {
		getAddress1().sendKeys(address1);

	}
	public static void setAddressLine2(String address2) {
		getAddres2().sendKeys(address2);

	}

	public static void setCity(String city) {
		getCity().sendKeys(city);

	}

	public static void selectState() {
		// TODO Auto-generated method stub

	}

	public static void setZip_PostalCode(String zip) {
		getZicode().sendKeys(zip);

	}


	public static void selectCountry() {
		// TODO Auto-generated method stub

	}
	
	public static void setAdditionalInformation(String info) {
		getAdditionalInfo().sendKeys(info);

	}
	

	public static void setHomePhone(String homePhone) {
		getHomePhone().sendKeys(homePhone);

	}

	public static void setMMobilePhone(String mobile) {
		getMobilephone().sendKeys(mobile);

	}

	public static void setAliasToaddress(String alias) {
		getAlias().sendKeys(alias);

	}

	public static void submitRegistration() {
		getRegisterButton().click();

	}

}
