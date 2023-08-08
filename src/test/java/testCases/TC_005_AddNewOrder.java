package testCases;

import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.Home_page;
import pageObject.OrderFunctionality;
import testBase.BaseClass;

public class TC_005_AddNewOrder extends BaseClass {

	@Test
	public void addNewOrder_InFoundry() throws InterruptedException {

		Home_page hp = new Home_page(driver);
		hp.clickSignIn();

		Application_Sign_inPage sng1 = new Application_Sign_inPage(driver);
		sng1.enterEmailId(rb.getString("email"));
		sng1.enterPassword(rb.getString("password"));
		sng1.clickOnLoginbtn();

		OrderFunctionality order = new OrderFunctionality(driver);
		order.clickOrderbutton();
		order.clickAddOrderButton();
		order.enterCustomerName(randomString());
		order.enterCustomerEmail(randomAlphaNumeric() + "@gmail.com");
		order.enterCustomerPhoneNo(randomNumber());
		order.enterCustomerHouseNo(randomNumber());
		order.clickOnTypeDropdown();
		order.selectdropdownvalue();
		order.enterCustomerAddress(randomAlphaNumeric());
		order.enterCustomerPINcode(rb.getString("pincode"));
		Thread.sleep(3000);
		order.enterCustomerDeliveryNo(randomNumber());
		
		
		order.clickOnAddProductButton();
		order.searchProductText(rb.getString("searchproduct"));
		order.clickOnAddProductBtnSecond();
		
		
		
		
		
		
		order.clickOnAddButton();
		Thread.sleep(3000);
		
		

	}

}
