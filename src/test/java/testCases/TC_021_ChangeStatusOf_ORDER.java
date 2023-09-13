package testCases;

import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.Home_page;
import pageObject.OrderFunctionality;
import testBase.BaseClass;

public class TC_021_ChangeStatusOf_ORDER  extends BaseClass{

	
	@Test (priority = 21)
	public void changeStatusOfOrder() throws InterruptedException {
	
		Home_page hp = new Home_page(driver);
		hp.clickSignIn();

		Application_Sign_inPage sng6 = new Application_Sign_inPage(driver);
		sng6.enterEmailId(rb.getString("email"));
		sng6.enterPassword(rb.getString("password"));
		sng6.clickOnLoginbtn();

		OrderFunctionality ostatus = new OrderFunctionality(driver);
		
		ostatus.clickOrderbutton();
		ostatus.clickOnSecondDropdown();
		ostatus.selectProcessingStatus();
		
	logger.warn("error occured");
		
		
		
}
}