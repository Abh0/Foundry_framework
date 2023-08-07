package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.AddNewUser;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_004_AddNewUser extends BaseClass {

	@Test
	public void addNewUser_Infoundry() {

		Home_page hp = new Home_page(driver);
		hp.clickSignIn();
		logger.info("Add new user Test Case start... ");

		// create object for access TC_002_SignIn_page

		TC_002_SignIn_page tc2 = new TC_002_SignIn_page();
		tc2.page_SignIn();
		// create object for AddNewUser
		AddNewUser admin = new AddNewUser(driver);

		admin.settingButton();
		admin.addNewUserButton();

	}
}
