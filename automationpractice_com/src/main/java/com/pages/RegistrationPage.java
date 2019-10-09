package com.pages;

import javax.print.attribute.standard.Chromaticity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.reporters.EmailableReporter;

import com.utils.Utils;

public class RegistrationPage extends BasePage {

	By accountCreationForm = By.id("account-creation_form");
	By mrTitle = By.id("id_gender1");
	By mrsTitle = By.id("id_gender2");
	By customerFirstname = By.id("customer_firstname");
	By customerLastname = By.id("customer_lastname");
	By Email = By.id("email");
	By password = By.id("passwd");

	By birthDay = By.id("days");
	By birthMonth = By.id("months");
	By birthYear = By.id("years");

	By newsletter = By.xpath("//input[@id =\"newsletter\"]");
	By specialOffer = By.xpath("//input[@id =\"optin\"]");

	By firstname = By.id("firstname");
	By lastname = By.id("lastname");

	By company = By.id("company");
	By address1 = By.id("address1");
	By address2 = By.id("address2");
	By city = By.id("city");

	By state = By.xpath("//select[@id =\"id_state\"]");
	By postcode = By.id("postcode");
	By country = By.xpath("//select[@id= \"id_country\"]/option[@value =\"21\"]");
	By other = By.id("other");

	By homePhone = By.id("phone");
	By mobilePhone = By.id("phone_mobile");
	By submitAccount = By.id("submitAccount");
	By alias = By.id("alias");

	public RegistrationPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	// getters
	private WebElement getcustomerFirstnameField() {
		return Utils.waitForPresenceOfAutoElement(customerFirstname);
	}

	private WebElement getcustomerLastnameField() {
		return Utils.waitForPresenceOfAutoElement(customerLastname);
	}

	// setters
	public void setcustomerFirstnameField(String firstName) {
		getcustomerFirstnameField().sendKeys(firstName);
	}

	public void setcustomerLastnameField(String secondName) {
		getcustomerLastnameField().sendKeys(secondName);
	}

	public void setRegistrationEmailAddress(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setcustomerPasswordField(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setcustomerBirthDate(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}

	public void signupForNewsletter() {
		// TODO Auto-generated method stub
		
	}

	public void AcceptToReceiveSpecialOffersFromPartners() {
		// TODO Auto-generated method stub
		
	}

	public void setFirstname(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setLastName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setCompanyName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setAddressLine2(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setCity() {
		// TODO Auto-generated method stub
		
	}

	public void selectState() {
		// TODO Auto-generated method stub
		
	}

	public void setZip_PostalCode(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setAdditionalInformation(String string) {
		// TODO Auto-generated method stub
		
	}

	public void selectCountry() {
		// TODO Auto-generated method stub
		
	}

	public void setHomePhone(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setMMobilePhone(String string) {
		// TODO Auto-generated method stub
		
	}

	public void assignAliasToaddress() {
		// TODO Auto-generated method stub
		
	}

	public void submitRegistration() {
		// TODO Auto-generated method stub
		
	}

}
