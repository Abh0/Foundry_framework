package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import pageObject.AddNewUser;
import pageObject.Application_Sign_inPage;
import pageObject.Home_page;

import testBase.BaseClass;

public class TC_002_SignIn_page extends  BaseClass {

	
	
	
	
	
	
	
	
	
	@Test(priority = 2, groups={"Regression","Foundry_Main"})
	
	//Customization Allure report using this below annotation (allure testng <dependencies)
	@Description("Verify sign in is successfully")
	@Epic("FE001")
	@Feature("feaure 1 : sign In")
	@Story("story: sign In done")
	@Step("username and password valid ")
	@Severity(SeverityLevel.CRITICAL)
 	public void page_SignIn() {
		
try {
		Home_page hp = new Home_page(driver);
		logger.info("start of TC_002_SignIn_page...... ");
		hp.clickSignIn();

		Application_Sign_inPage wcpage1 = new Application_Sign_inPage(driver) ;

		wcpage1.enterEmailId(rb.getString("email"))   ;       // email and password coming from config.properties file
		wcpage1.enterPassword(rb.getString("password"));

		wcpage1.clickOnLoginbtn();
}
catch (Exception e) {
	e.printStackTrace();
	Assert.fail();
}

		

		
		

	}

}
