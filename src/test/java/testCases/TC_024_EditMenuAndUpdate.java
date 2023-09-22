package testCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.Home_page;
import pageObject.Menu_Functionality;
import testBase.BaseClass;

public class TC_024_EditMenuAndUpdate extends BaseClass {

	@Test(priority = 24, groups = { "Regression", "Foundry_Main" })
	public void editMenuAndUpdatefun() throws IOException, InterruptedException {

		Home_page hp = new Home_page(driver);
		hp.clickSignIn();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();

		Application_Sign_inPage sign3 = new Application_Sign_inPage(driver);
		sign3.enterEmailId(rb.getString("email1"));
		sign3.enterPassword(rb.getString("password1"));
		sign3.clickOnLoginbtn();

		Menu_Functionality edit = new Menu_Functionality(driver);
		edit.clickOnLeftSideMenuButton();
		edit.clickOnAnyMenu();
		edit.enterMenuName(rb.getString("newmenuname"));
		
		edit.clickOnEditButton();
		edit.selectCheckBox();
		edit.clickOnInnerUpdate();
		edit.clickOnOuterUpdate();
		 
		
	}
}
