package testCases;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;

import pageObject.Home_page;
import pageObject.ProductFunctionality;
import testBase.BaseClass;

public class TC_006_AddNewProduct extends BaseClass {

	
	@Test
	public void addNewProduct_InFoundry() throws InterruptedException {
try {
		Home_page hp = new Home_page(driver);
		hp.clickSignIn();

		Application_Sign_inPage sng2 = new Application_Sign_inPage(driver);
		sng2.enterEmailId(rb.getString("email1"));
		sng2.enterPassword(rb.getString("password1"));
		sng2.clickOnLoginbtn();

		
		ProductFunctionality pdf = new ProductFunctionality(driver);
		pdf.clickOnProductButton();
		pdf.clickAddProductButton();
		pdf.enterProductName(rb.getString("productName"));
		pdf.enterProductDescription(rb.getString("productdescription"));
		
		Thread.sleep(4000);
		pdf.clickAddImageButton();
		System.out.println("image uploaded successfully");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(4000);
		
		
		
} 
catch (Exception e) {
	e.printStackTrace();
	Assert.fail();
}
		
	}}

