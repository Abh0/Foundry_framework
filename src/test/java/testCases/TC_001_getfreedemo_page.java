package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Home_page;
import pageObject.WelcomePage;
import testBase.BaseClass;

public class TC_001_getfreedemo_page extends BaseClass {

	//when we want execute one test case number of times so used @Test (invocationCount = 100) that means this test csae can be execute 100 times.
			//Example - @Test (invocationCount = 100)
			//public void testLoginScenario_TC001(){ } 
	
	
	
	
	
	@Test(priority = 1, groups={"Regression","Foundry_Main"})
	public void getfreedemo_user_page() {
		
		
		

		//Home_page hp = new Home_page(driver);
		// hp.clickSignIn();
		
		logger.info("*** test case first *****");
		logger.debug("Generating debug log");

		try {
		
		WelcomePage wcpage = new WelcomePage(driver); 

		//String fn = randomString();
		logger.info("providing customer details .............");
		
		wcpage.enterFullName(randomString().toLowerCase());
		
		wcpage.enterEmailId(randomAlphaNumeric()+"@gmail.com");

		wcpage.enterPhoneNumber(randomNumber());

		wcpage.enterStoreName(randomAlphaNumeric());

		wcpage.clickGetDemobtn();

		

		logger.info("successfully user register");
		} 
		catch (Exception e){
			e.printStackTrace();
			
			logger.error("test failed...");
			
			Assert.fail();
		}
	}

}
