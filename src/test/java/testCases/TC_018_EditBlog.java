package testCases;

import java.io.IOException;
<<<<<<< HEAD
import java.net.SocketException;
import java.util.NoSuchElementException;
=======
>>>>>>> 6808d8c867a5cb7a8793f541ef6989a55d7a3017

import org.testng.annotations.Test;

import pageObject.Add_Blogs_Functionality;
import pageObject.Application_Sign_inPage;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_018_EditBlog  extends BaseClass {

	@Test(priority = 18)
<<<<<<< HEAD
	public void editExistingBlog() throws InterruptedException, SocketException {
=======
	public void editExistingBlog() throws InterruptedException {
>>>>>>> 6808d8c867a5cb7a8793f541ef6989a55d7a3017
			
			try {
					Home_page hp = new Home_page(driver);
					hp.clickSignIn();

					Application_Sign_inPage sng6 = new Application_Sign_inPage(driver);
					sng6.enterEmailId(rb.getString("email"));
					sng6.enterPassword(rb.getString("password"));
					sng6.clickOnLoginbtn();
		
					
					Add_Blogs_Functionality ble = new Add_Blogs_Functionality(driver);
					ble.clickOnBlogButtonLeftSide();
<<<<<<< HEAD
					ble.clickOnSlidePagination();  // second page
					ble.clickOnAnyBlog();  //click on any blog
=======
					ble.clickOnSlidePagination();
					ble.clickOnAnyBlog();
>>>>>>> 6808d8c867a5cb7a8793f541ef6989a55d7a3017
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
					
			
					
					
<<<<<<< HEAD
			} catch (NoSuchElementException e) {
				e.printStackTrace();
				
			}
			
			catch (Exception e) {
=======
			} catch (Exception e) {
>>>>>>> 6808d8c867a5cb7a8793f541ef6989a55d7a3017
				e.printStackTrace();
				
			}
			}
	
}
