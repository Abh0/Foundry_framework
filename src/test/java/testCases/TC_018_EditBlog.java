package testCases;

import java.io.IOException;

import java.net.SocketException;
import java.util.NoSuchElementException;



import org.testng.annotations.Test;

import pageObject.Add_Blogs_Functionality;
import pageObject.Application_Sign_inPage;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_018_EditBlog  extends BaseClass {

	
	@Test(priority = 18)
	public void editExistingBlog() throws InterruptedException, SocketException {

	

			
			try {
					Home_page hp = new Home_page(driver);
					hp.clickSignIn();

					Application_Sign_inPage sng6 = new Application_Sign_inPage(driver);
					sng6.enterEmailId(rb.getString("email"));
					sng6.enterPassword(rb.getString("password"));
					sng6.clickOnLoginbtn();
		
					
					Add_Blogs_Functionality ble = new Add_Blogs_Functionality(driver);
					ble.clickOnBlogButtonLeftSide();

					ble.clickOnSlidePagination();  // second page
					ble.clickOnAnyBlog();  //click on any blog

					ble.clickOnSlidePagination();
					ble.clickOnAnyBlog();

					Thread.sleep(3000);
					
					
					ble.clearBlogDescription();
					
					Thread.sleep(3000);
					//ble.enterDescriptionOfBlog(rb.getString("blogDescription"));
					
					Thread.sleep(3000);
					
					ble.clickOnAddImageButton();
					
					
					
					String autoItScriptPath = "C:\\Users\\101Reporters\\Documents\\AutoIt Scripts\\Autoit collection.exe";  // path of .exe file 
					String imagePath = "C:\\Users\\101Reporters\\Documents\\Nayaami dummy\\roman reigns.jpg";  
					String command = "\"" + autoItScriptPath + "\" " + "  " + "\"" + imagePath + "\"";

					try {
					    Process process = Runtime.getRuntime().exec(command);
					   
					} catch (IOException e) {
					    e.printStackTrace();
					}

					Thread.sleep(5000);
					
					
					
					ble.clickOnSaveButton();
					
			
					
					

			} catch (NoSuchElementException e) {
				e.printStackTrace();
				
			}
			
			catch (Exception e) {

				e.printStackTrace();
				
			}
			}
	
}
