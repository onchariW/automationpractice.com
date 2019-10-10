package com.automa.tests;

import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.RegistrationPage;
import com.utils.Utils;

public class RegistrationTest extends BaseTest {

	@Test(priority = 1)
	public void registerWithUiqueValidEmailAddess() throws InterruptedException {
		HomePage.clickSignInLink();
		authentication.createAnAccount(Utils.generateTestEmail());
      
	}

	@Test(priority = 2)
	public void createAccountSuccessfullyWithAllRequiredValidData() throws InterruptedException {

		HomePage.clickSignInLink();
		
		authentication.createAnAccount(Utils.generateTestEmail());
		authentication.checkMrRadioButton();
		
		//Your personal information
		RegistrationPage.clickMrs();
		RegistrationPage.setcustomerFirstnameField("Onchari");
		RegistrationPage.setcustomerLastnameField("Wycliffe");
		//RegistrationPage.setRegistrationEmailAddress("onchari@wycliffe.coma");
		RegistrationPage.setcustomerPasswordField("fstghfkghgkdhfgkg");
		RegistrationPage.setcustomerBirthDate("12", "January", "1989");
		RegistrationPage.signupForNewsletter();
		RegistrationPage.AcceptToReceiveSpecialOffersFromPartners();
		
		//Your address
		RegistrationPage.setFirstname("Onchari");
		RegistrationPage.setLastName("Wycliffe");
		RegistrationPage.setCompanyName("Automation Practice Ltd");
		RegistrationPage.setAddressLine2("The Mirage ");
		RegistrationPage.setAddressLine2("Nagi Plaza");
		RegistrationPage.setCity("Nairobi");
		RegistrationPage.selectState();
		RegistrationPage.setZip_PostalCode("44356");
		RegistrationPage.selectCountry();
		RegistrationPage.setAdditionalInformation("I am real interesed");
		RegistrationPage.setHomePhone("07054355756");
		RegistrationPage.setMMobilePhone("43546577");
		RegistrationPage.setAliasToaddress("Okonu");;
		
		Thread.sleep(20000);
		RegistrationPage.submitRegistration();
	}

}
