package testCases;

import org.testng.annotations.Test;
import pageObject.Application_Sign_inPage;
import pageObject.Home_page;
import testBase.BaseClass;
import testCases.TC_002_SignIn_page;

public class TC_003_Login_Logout extends BaseClass {

	@Test
	public void page_Logoutbtn() throws InterruptedException {

		logger.info("Start of TC_003_Login_Logout.......");
		
		Home_page hp = new Home_page(driver);  //  9966044425
		hp.clickSignIn();

	TC_002_SignIn_page login = new TC_002_SignIn_page();
	login.page_SignIn();

		Application_Sign_inPage wcpage = new Application_Sign_inPage(driver);

	wcpage.enterEmailId("abhishek@101reporters.com");
		wcpage.enterPassword("0987654321");
		wcpage.clickOnLoginbtn();
		
		wcpage.clickOnProfilebtn();

		wcpage.clickOnLogoutbtn();
		logger.error("if test case failed");
		Thread.sleep(3000);
	}
}
