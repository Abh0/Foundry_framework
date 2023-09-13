package testCases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.Home_page;

import pageObject.Misc_Functionality;
import testBase.BaseClass;

public class TC_019_FindBrokenLink extends BaseClass {

	@Test(priority = 19)
	public void findBrokenLinks() throws InterruptedException {
			
		try {
					Home_page hp = new Home_page(driver);
					hp.clickSignIn();

					Application_Sign_inPage sng6 = new Application_Sign_inPage(driver);
					sng6.enterEmailId(rb.getString("email"));
					sng6.enterPassword(rb.getString("password"));
					sng6.clickOnLoginbtn();
	
				
				
				
					


					String homepage = rb.getString("appURL") ;
					String url = rb.getString("signinURL");
					HttpsURLConnection huc = null; 
					int respcode = 200; 

					

					
					Misc_Functionality mfun = new Misc_Functionality (driver) ;
					
					mfun.verifyLogo();
					
					
		} catch (Exception e) {
			e.printStackTrace();
			
			}
		}
		}
						
					