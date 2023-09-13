package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.Add_Blogs_Functionality;
import pageObject.Application_Sign_inPage;
import pageObject.Home_page;
import testBase.BaseClass;




public class TC_016_AddNewBlogs  extends BaseClass{

	
	@Test(priority = 16)
public void addNewBlogs() throws InterruptedException {
		
		try {
				Home_page hp = new Home_page(driver);
				hp.clickSignIn();

				Application_Sign_inPage sng4 = new Application_Sign_inPage(driver);
				sng4.enterEmailId(rb.getString("email"));
				sng4.enterPassword(rb.getString("password"));
				sng4.clickOnLoginbtn();
				
		Add_Blogs_Functionality blog = new Add_Blogs_Functionality(driver)	;
		blog.clickOnBlogButtonLeftSide();
		blog.clickOnAddBlogButton();
		blog.enterTitleOfBlog(rb.getString("blog_title"));
		blog.enterDescriptionOfBlog(randomDescription(200));
		Thread.sleep(3000);
		blog.enterWriteHere(randomDescription(100));
		Thread.sleep(3000);
		
		blog.clickOnAddImageButton();
		
				
		String autoItScriptPath = "C:\\Users\\101Reporters\\Documents\\AutoIt Scripts\\Autoit collection.exe";  // path of .exe file 
		String imagePath = "C:\\Users\\101Reporters\\Documents\\Dummy image\\pd91.jpg";  
		String command = "\"" + autoItScriptPath + "\" " + "  " + "\"" + imagePath + "\"";

		try {
		    Process process = Runtime.getRuntime().exec(command);
		   
		} catch (IOException e) {
		    e.printStackTrace();
		}

		Thread.sleep(5000);
				
		blog.enterAuthorName(rb.getString("authorName"));
		blog.enterTags(rb.getString("tags"));
		blog.enterExcerpts(randomString());
		Thread.sleep(5000);
		blog.clickOnSaveButton();
		Thread.sleep(5000);
		
		
		
				
				
				
				
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	
}
}