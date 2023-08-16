package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.Customer_Slide_Pagination;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_008_Customer_SlidePagination extends BaseClass {

	@Test
	public void slidePagination () throws IOException{
	
	
		
		
		
		
		
	Home_page hp = new Home_page(driver);
hp.clickSignIn();
	
	
	Application_Sign_inPage sign3 = new Application_Sign_inPage(driver);
	sign3.enterEmailId(rb.getString("email1"));
	sign3.enterPassword(rb.getString("password1"));
	sign3.clickOnLoginbtn();
	
	
	Customer_Slide_Pagination sp = new  Customer_Slide_Pagination(driver);
	sp.clickCustomerButton();
	sp.clicksecondpage();
	sp.clickthirdpage();
	sp.clickfourthpage();
	
	
	
	

	}
	
	
}
