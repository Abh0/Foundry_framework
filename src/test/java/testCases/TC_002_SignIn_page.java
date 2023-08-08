package testCases;


import org.testng.annotations.Test;

import pageObject.AddNewUser;
import pageObject.Application_Sign_inPage;
import pageObject.Home_page;

import testBase.BaseClass;

public class TC_002_SignIn_page extends  BaseClass {

	
	
	@Test
	public void page_SignIn() {

		Home_page hp = new Home_page(driver);
		logger.info("start of TC_002_SignIn_page...... ");
		hp.clickSignIn();

		Application_Sign_inPage wcpage1 = new Application_Sign_inPage(driver) ;

		wcpage1.enterEmailId(rb.getString("email"))   ;       // email and password coming from config.properties file
		wcpage1.enterPassword(rb.getString("password"));

		wcpage1.clickOnLoginbtn();
		
		

		
		

	}

}
