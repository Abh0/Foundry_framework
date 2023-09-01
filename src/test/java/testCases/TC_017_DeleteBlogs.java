package testCases;       // delete blogs and its goes into trashed as deleted then again published it.

import org.testng.annotations.Test;

import pageObject.Add_Blogs_Functionality;
import pageObject.Application_Sign_inPage;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_017_DeleteBlogs extends BaseClass{

	
	@Test(priority = 17)
public void addNewBlogs() throws InterruptedException {
		
		try {
				Home_page hp = new Home_page(driver);
				hp.clickSignIn();

				Application_Sign_inPage sng5 = new Application_Sign_inPage(driver);
				sng5.enterEmailId(rb.getString("email"));
				sng5.enterPassword(rb.getString("password"));
				sng5.clickOnLoginbtn();
	
				
				Add_Blogs_Functionality bl = new Add_Blogs_Functionality(driver);
				bl.clickOnBlogButtonLeftSide();
				
				bl.clickOnSlidePagination();
				bl.selectCheckbox();
				bl.clickOnBulkAction();
				bl.clickOnDeleteselectedblogButton();
				bl.clickOnApplyButton();
				bl.clickYesDeleteButton();
				
				//this is for published blog from deleted blogs
				Thread.sleep(8000);
				
				bl.clickOnTrashedButton();
				
				Thread.sleep(4000);
				
				bl.selectCheckbox();
				Thread.sleep(4000);
				bl.clickOnBulkAction();
				bl.clickOnPublishedSelectedBlogs();
				Thread.sleep(4000);
				bl.clickOnApplyButton();
				Thread.sleep(4000);
				bl.clickOnYesPublishedButton();
				Thread.sleep(4000);
				
				
		} catch (Exception e) {
			e.printStackTrace();
			
			}
		}
	
}

