package testCases;

import java.io.IOException;
import java.time.Duration;



import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.Home_page;
import pageObject.Order_BULK_ACTION_fun;
import testBase.BaseClass;

public class TC_022_BulkAction_Apply extends BaseClass {

	@Test(priority = 22, groups = { "Regression", "Foundry_Main" })
	public void verifyBulkAction_OrderPage() throws IOException, InterruptedException {

		Home_page hp = new Home_page(driver);
		hp.clickSignIn();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Application_Sign_inPage sign3 = new Application_Sign_inPage(driver);
		sign3.enterEmailId(rb.getString("email1"));
		sign3.enterPassword(rb.getString("password1"));
		sign3.clickOnLoginbtn();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Order_BULK_ACTION_fun ba = new Order_BULK_ACTION_fun(driver);

		ba.clickOnOrderButton();
// default first page
		Thread.sleep(3000);
		ba.selectOrderIDCheckbox();
		Thread.sleep(3000);
		ba.clickOnBulkActionButton();
		ba.firstValueChangedStatusToCancelled();

		ba.clickOnApplyButton();

		Thread.sleep(3000);
		// second page
		ba.clickOn2ndPage();

		ba.selectOrderIDCheckbox();
		ba.clickOnBulkActionButton();
try {
		ba.clickOnChangedStatusToPending();
		
		ba.clickOnApplyButton();

		Thread.sleep(50000);

		// third page
		ba.clickOn3rdPage();
		ba.selectOrderIDCheckbox();
}catch (Exception e) {
	e.printStackTrace();
	System.out.println(e);
}
		ba.clickOnBulkActionButton();
try {
		ba.clickOnChangedStatusToProcessing();
		ba.clickOnApplyButton();
		Thread.sleep(50000);
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println(e);
	}


	}

}
