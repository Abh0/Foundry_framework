package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.Collection_Functionality;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_013_AddNewCustomCollection extends BaseClass {

	
	@Test
	public void addNewCollection_InFoundry() throws InterruptedException {
		
		try {
				Home_page hp = new Home_page(driver);
				hp.clickSignIn();

				Application_Sign_inPage sng4 = new Application_Sign_inPage(driver);
				sng4.enterEmailId(rb.getString("email"));
				sng4.enterPassword(rb.getString("password"));
				sng4.clickOnLoginbtn();
	
				Collection_Functionality coll = new Collection_Functionality(driver);
				coll.clickCollectionButtonLeftSide();
				coll.clickOnAddCustomCollectionButton();
				coll.enterCollectionName(rb.getString("collectionName"));
				coll.enterCollectionSlug(rb.getString("collectionSlug"));
				coll.enterCollectionDescription(rb.getString("collectionDescription"));
				
				
				
				
				
				
				
				
				coll.clickOnChooseImageButton();
				Thread.sleep(5000);
				
				String autoItScriptPath = "C:\\Users\\101Reporters\\Documents\\AutoIt Scripts\\Autoit collection.exe";  // path of .exe file 
				String imagePath = "C:\\Users\\101Reporters\\Documents\\Nayaami dummy\\basket 2.webp";  

				// path of image , which we want to upload
				// C:\\Users\\101Reporters\\Documents\\Dummy image\\pd91.jpg
				// C:\\Users\\101Reporters\\Documents\\Nayaami dummy\\watch 1.webp
				// C:\\Users\\101Reporters\\Documents\\Dummy image\\pd96.jpg
				
				String command = "\"" + autoItScriptPath + "\" " + "  " + "\"" + imagePath + "\"";

				try {
				    Process process = Runtime.getRuntime().exec(command);
				   
				} catch (IOException e) {
				    e.printStackTrace();
				}

				Thread.sleep(5000);

				coll.clickOnAddProductButton();
				coll.clickSearchProductForCollection();
				Thread.sleep(5000);
				
				//coll.pressDownArrayAfterClick();
				System.out.println("product added");
				
				coll.clickOnAddProductBtnAfterSelectingProduct();
				coll.clickFinalAddCollectionButton();
				
				Thread.sleep(5000);

				
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
				
	
	
}}
