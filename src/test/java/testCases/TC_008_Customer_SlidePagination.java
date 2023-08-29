package testCases; //for test the slide pagination in customer module

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.Customer_Slide_Pagination;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_008_Customer_SlidePagination extends BaseClass {

	@Test(priority=8,groups = { "Regression", "Foundry_Main" })
	public void slidePagination() throws IOException, InterruptedException {

		Home_page hp = new Home_page(driver);
		hp.clickSignIn();

		Application_Sign_inPage sign3 = new Application_Sign_inPage(driver);
		sign3.enterEmailId(rb.getString("email1"));
		sign3.enterPassword(rb.getString("password1"));
		sign3.clickOnLoginbtn();

		Customer_Slide_Pagination sp = new Customer_Slide_Pagination(driver);
		sp.clickCustomerButton();
		sp.clicksecondpage();
		Thread.sleep(2000);
		sp.clickthirdpage();
		Thread.sleep(2000);
		sp.clickfourthpage();
		Thread.sleep(2000);
		sp.clickfifthpage();
		Thread.sleep(2000);
		sp.clicksixthpage();
		Thread.sleep(2000);

	}

}
