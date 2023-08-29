package testCases;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;

import pageObject.Home_page;
import pageObject.ProductFunctionality;
import testBase.BaseClass;

public class TC_006_AddNewProduct extends BaseClass {

	
	@Test(priority=6, groups={"Regression", "Foundry_Main"})
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
		pdf.clickAddImageButton();          // click on Add image button
		
		
		// this block of code is for to upload image on browser 
		//1.open Autoit editor
		//2.write below code As per value of element
		//3.click TOOL> compile > popup will open keep as it all value > click  compile scripts 
		//4. it will generate .exe file in same file location
		
		//1. below code line is use in autoit editor
		
		
		
//		Sleep(500)
//		ControlFocus("Open", "", "Edit1")        > focus on search text
//		Sleep(500)
//		ControlSetText("Open", "", "Edit1", $CmdLine[1])     > enter path of file
//		Sleep(500)
//		ControlClick("Open", "", "Button1")      >      click on open button
//		Sleep(500) 
		
		
		
		String autoItScriptPath = "C:\\Users\\101Reporters\\Documents\\AutoIt Scripts\\Autoit 2.exe";  // path of .exe file 
		String imagePath = "C:\\Users\\101Reporters\\Documents\\Dummy image\\pd91.jpg";                                 // path of image , which we want to upload
	//	C:\\Users\\101Reporters\\Documents\\Dummy image\\pd91.jpg

		
	//	C:\\Users\\101Reporters\\Documents\\Nayaami dummy\\watch 1.webp
		//C:\\Users\\101Reporters\\Documents\\Dummy image\\pd96.jpg
		
		String command = "\"" + autoItScriptPath + "\"" + " " + "\"" + imagePath + "\"";

		try {
		    Process process = Runtime.getRuntime().exec(command);
		   
		} catch (IOException e) {
		    e.printStackTrace();
		}

		//Runtime.getRuntime().exec("C://Users/101Reporters/Documents/AutoIt Scripts/Autoit scrpts file upload.exe"+" "+"C://Users/101Reporters/Documents/Dummy image/pd98.jpg");
		
	Thread.sleep(5000);
		
		
		pdf.enterRegularPrice(randomNumber());
		pdf.enterSalesPrice(randomNumber());
		pdf.clickInventaryButton();
		pdf.enterproductsku(randomAlphaNumeric());
		pdf.enterProductStock(randomNumber());
		pdf.enterMetaTitle(randomString());
		pdf.enterMetaDescription(randomString());
		pdf.clickCategoryDD();
		pdf.selectCategory();
		Thread.sleep(5000);
		pdf.clicksubCategory();
		pdf.selectSubcategory();
		pdf.entertags(randomString());
		pdf.clickPublishButton();
		Thread.sleep(5000);
	
	
		
		} 
			catch (Exception e) {
						e.printStackTrace();
						//Assert.fail();
}
		
	}}

