package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.BrandCollection_Functionality;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_015_AddBrandCollection extends BaseClass{

	
	
	@Test(priority = 15)
public void addNewBrandCollection() throws InterruptedException {
		
		try {
				Home_page hp = new Home_page(driver);
				hp.clickSignIn();

				Application_Sign_inPage sng4 = new Application_Sign_inPage(driver);
				sng4.enterEmailId(rb.getString("email"));
				sng4.enterPassword(rb.getString("password"));
				sng4.clickOnLoginbtn();
				
				BrandCollection_Functionality bcoll = new BrandCollection_Functionality(driver);
				bcoll.clickOnCollectionLeftSideButton();
				bcoll.clickOnBrandCollectionLeftSideButton();
				bcoll.clickOnAddBrandCollection();
				//bcoll.enterCollectionName(rb.getString("collectionName"));
				bcoll.enterCollectionName(randomString());
				bcoll.enterCollectionSlug(rb.getString("collectionSlug"));
				bcoll.enterCollectionDescription(rb.getString("collectionDescription"));
				
				bcoll.clickOnChooseImageButton();
				Thread.sleep(5000);
				
				String autoItScriptPath = "C:\\Users\\101Reporters\\Documents\\AutoIt Scripts\\Autoit collection.exe";  // path of .exe file 
				String imagePath = "C:\\Users\\101Reporters\\Documents\\Nayaami dummy\\basket 2.webp";  
				String command = "\"" + autoItScriptPath + "\" " + "  " + "\"" + imagePath + "\"";

				try {
				    Process process = Runtime.getRuntime().exec(command);
				   
				} catch (IOException e) {
				    e.printStackTrace();
				}

				Thread.sleep(5000);

				bcoll.clickOnAddProductButton();
				bcoll.clickSearchProductForCollection();
				Thread.sleep(5000);
				bcoll.pressDownArrayAfterClick();
				Thread.sleep(5000);
				bcoll.clickOnAddProductBtnAfterSelectingProduct();
				Thread.sleep(5000);
				bcoll.clickFinalAddCollectionButton();
				Thread.sleep(5000);
				
				
		}catch (Exception e){
			e.printStackTrace();
			
		}
}
}