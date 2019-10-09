package com.automationpractice.tests;

import org.testng.annotations.Test;

import com.pages.HomePage;

public class RegistrationTest extends BaseTest {

	@Test(priority = 1)
	public void registerWithUiqueValidEmailAddess() throws InterruptedException {
		HomePage.clickSignInLink();
		authentication.createAnAccount("onchari@wycliffe.coma");

	}

	@Test(priority = 2)
	public void createAccountSuccessfullyWithAllRequiredValidData() {

		HomePage.clickSignInLink();
		
		authentication.createAnAccount("onchari@wycliffe.coma");
		authentication.checkMrRadioButton();
		
		//Your personal information
		registration.setcustomerFirstnameField("Onchari");
		registration.setcustomerLastnameField("Wycliffe");
		registration.setRegistrationEmailAddress("onchari@wycliffe.coma");
		registration.setcustomerPasswordField("fstghfkghgkdhfgkg");
		registration.setcustomerBirthDate("12", "January", "1989");
		registration.signupForNewsletter();
		registration.AcceptToReceiveSpecialOffersFromPartners();
		
		//Your address
		registration.setFirstname("Onchari");
		registration.setLastName("Wycliffe");
		registration.setCompanyName("Automation Practice Ltd");
		registration.setAddressLine2("The Mirage ");
		registration.setAddressLine2("Nagi Plaza");
		registration.setCity();
		registration.selectState();
		registration.setZip_PostalCode("44356");
		registration.selectCountry();
		registration.setAdditionalInformation("I am real interesed");
		registration.setHomePhone("07054355756");
		registration.setMMobilePhone("43546577");
		registration.assignAliasToaddress();
		
		registration.submitRegistration();
	}

}
