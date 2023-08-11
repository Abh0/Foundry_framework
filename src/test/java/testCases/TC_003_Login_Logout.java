package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.Application_Sign_inPage;
import pageObject.Home_page;
import testBase.BaseClass;

import utilities.DataProviders;

public class TC_003_Login_Logout extends BaseClass {

	@Test (dataProvider = "SignIn_Page", dataProviderClass = DataProviders.class)
	
	public void page_Logoutbtn(String email , String pwd, String exp)          throws InterruptedException {
		logger.info("Start of TC_003_Login_Logout.......");
		try {
//			Home_page hp = new Home_page(driver); 
//			hp.clickSignIn();
			
			driver.get("https://foundry.aarrrmor.com/signin");

			Application_Sign_inPage wcpage = new Application_Sign_inPage(driver);
			

			//wcpage.enterEmailId(rb.getString("email"));             // previously  email and password coming form config.properties file 
			//wcpage.enterPassword(rb.getString("password"));
			
			
			wcpage.enterEmailId(email);             // previously  email and password coming form config.properties file 
			wcpage.enterPassword(pwd);
			
			wcpage.clickOnLoginbtn();
			wcpage.clickOnProfilebtn();  //click on user profile
			
			
			
			
			
			
			
			
			
			
			
			
			try {
			    

			    if (exp.equals("Valid")) {
			        wcpage.clickOnLogoutbtn();
			        Assert.assertTrue(waitForSuccessfulLogout()); // Replace this with actual condition check
			    } else if (exp.equals("Invalid")) {
			        wcpage.clickOnLogoutbtn();
			        Assert.assertTrue(waitForLogoutNotClicked()); // Replace this with actual condition check
			    } else {
			        Assert.fail("Invalid 'exp' value: " + exp);
			    }

			 
			} catch (Exception e) {
			    e.printStackTrace();
			    
			}

			
			
			
			
			
			
			
//			if (exp.equals("Valid")) {
//			    wcpage.clickOnLogoutbtn();
//			    Assert.assertTrue(true);
//			} else {
//			    Assert.assertTrue(false);
//			}
//
//			if (exp.equals("Invalid")) {
//			    wcpage.clickOnLogoutbtn();
//			    Assert.assertTrue(false);
//			} else {
//			    Assert.assertTrue(true);
//			}

			
			
			
			

			//wcpage.clickOnProfilebtn();

		//	wcpage.clickOnLogoutbtn();
			logger.error("if test case failed");
			Thread.sleep(3000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			

		}
	}

	private boolean waitForLogoutNotClicked() {
		
		return false;
	}

	private boolean waitForSuccessfulLogout() {
		
		return false;
	}
}
