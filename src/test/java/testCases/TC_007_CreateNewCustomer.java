package testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.CustomerFunctionality;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_007_CreateNewCustomer extends BaseClass{

	@Test(priority=7,groups={"Regression", "Foundry_Main"})
	public void createCustomerIn_foundry()   throws IOException{
		
		
		try {
		
		Home_page hp = new Home_page(driver);
		hp.clickSignIn();

		Application_Sign_inPage sng1 = new Application_Sign_inPage(driver);
		sng1.enterEmailId(rb.getString("email"));
		sng1.enterPassword(rb.getString("password"));
		sng1.clickOnLoginbtn();

		
		CustomerFunctionality cu = new CustomerFunctionality(driver);
		
		cu.clickCustomerButton();
		cu.clickCreatecustomerButton();
		cu.enterCustomerName(rb.getString("customerName"));
		cu.enterCustomerEmail(randomAlphaNumeric()+"@gmail.com");
		cu.enterContactNumber(randomNumber());
		cu.enterHouseNumber(randomNumber());
		cu.enterAddress(randomAlphaNumeric());
		cu.enterPincode(rb.getString("pincode"));
		Thread.sleep(5000);
		cu.enterDeliveryNumber(randomNumber());
		cu.clickSaveButton();
		Thread.sleep(5000);
		
//		 Alert alert = driver.switchTo().alert();                 //this alert for if same email id
//         String alertText = alert.getText();
//         System.out.println("Alert Message: " + alertText);
//
//         // You can perform actions with the alert here, such as accepting it
//        alert.accept();
//      
//
//		
//		Thread.sleep(5000);
		
		}
	 
    catch (Exception e) {
   	 e.printStackTrace();
   	 Assert.fail();
    }
		
	}
	
	
	
	
}
