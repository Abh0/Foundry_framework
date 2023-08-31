package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.Collection_Functionality;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_014_AddCollectionWithSubCollection extends BaseClass{

	
	
	@Test (priority = 14)
public void addNewCollectionWith_SubCollection() throws InterruptedException {
		
		try {
				Home_page hp = new Home_page(driver);
				hp.clickSignIn();

				Application_Sign_inPage sng4 = new Application_Sign_inPage(driver);
				sng4.enterEmailId(rb.getString("email"));
				sng4.enterPassword(rb.getString("password"));
				sng4.clickOnLoginbtn();
	// use Collection_Functionality page object class for this test case
				Collection_Functionality collSub = new Collection_Functionality(driver);
				collSub.clickCollectionButtonLeftSide();
				collSub.clickOnAddCustomCollectionButton();
				//collSub.enterCollectionName(rb.getString("collectionName"));
				       // ****collection name is commenting cause throwing 404 error ,after click on sub collection*********
				collSub.enterCollectionSlug(rb.getString("collectionSlug"));
				collSub.enterCollectionDescription(rb.getString("collectionDescription"));
				
				Thread.sleep(5000);
				
				collSub.selectSubCollectionCheckbox();
				collSub.clickOnParentCollectionDropDown();
				Thread.sleep(5000);
				collSub.clickOnSpecificParentCollection();
				
				
				
				
				
				collSub.clickOnChooseImageButton();
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

				collSub.clickOnAddProductButton();
				collSub.clickSearchProductForCollection();
				Thread.sleep(5000);
				
				//collSub.pressDownArrayAfterClick();
				System.out.println("product added");
				
				collSub.clickOnAddProductBtnAfterSelectingProduct();
				collSub.clickFinalAddCollectionButton();
				
				Thread.sleep(5000);

				
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
				
	
	
}}
