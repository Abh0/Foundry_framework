package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AddNewUser;
import pageObject.Application_Sign_inPage;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_004_AddNewUser extends BaseClass {

	@Test
	public void addNewUser_Infoundry() throws InterruptedException {
try {
		Home_page hp = new Home_page(driver);
		hp.clickSignIn();
		logger.info("Add new user Test Case start... ");

		// create object for access TC_002_SignIn_page

		Application_Sign_inPage sng = new Application_Sign_inPage(driver);
		sng.enterEmailId(rb.getString("email"));
		sng.enterPassword(rb.getString("password"));
		sng.clickOnLoginbtn();

		// create object for AddNewUser

		AddNewUser admin = new AddNewUser(driver);

		admin.settingButton();

		admin.addNewUserButton();

		admin.enterUserName(randomString());

		admin.enterFullName(randomString().toUpperCase());

		admin.enterUserEmailId(randomString() + "@gmail.com");
		Thread.sleep(5000);

		admin.enterPassword(randomAlphaNumeric());

		admin.clickSubmitbtn();
		Thread.sleep(5000);
}
 catch (Exception e) {
	 e.printStackTrace();
	 Assert.fail();
 }
	}
}
