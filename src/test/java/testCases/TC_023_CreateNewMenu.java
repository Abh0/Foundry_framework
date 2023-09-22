package testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.Home_page;
import pageObject.Menu_Functionality;
import testBase.BaseClass;

public class TC_023_CreateNewMenu extends BaseClass {

	@Test(priority = 23, groups = { "Regression", "Foundry_Main" })
	public void addNewMenu() throws IOException, InterruptedException {

		Home_page hp = new Home_page(driver);
		hp.clickSignIn();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();

		Application_Sign_inPage sign3 = new Application_Sign_inPage(driver);
		sign3.enterEmailId(rb.getString("email1"));
		sign3.enterPassword(rb.getString("password1"));
		sign3.clickOnLoginbtn();

		
		Menu_Functionality menu = new Menu_Functionality(driver);
		menu.clickOnLeftSideMenuButton();
		menu.clickOnCreateMenuButton();
		menu.enterMenuName(rb.getString("menuname"));
		menu.clickOnAddCategotyDropdown();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		menu.selctDropdownValue();
		menu.clickOnSaveButton();
		
		

	}
}
