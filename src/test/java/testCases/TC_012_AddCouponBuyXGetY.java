package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.CouponWithBuyXGetY;
import pageObject.CouponWithDiscountPercent;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_012_AddCouponBuyXGetY  extends BaseClass {

	@Test(priority = 12)
	public void addCouponWithBuyXGetY() throws IOException, InterruptedException {

		try {

			Home_page hp = new Home_page(driver);
			hp.clickSignIn();

			Application_Sign_inPage sign3 = new Application_Sign_inPage(driver);
			sign3.enterEmailId(rb.getString("email"));
			sign3.enterPassword(rb.getString("password"));
			sign3.clickOnLoginbtn();

			logger.info("Add coupon with Free Shipping ");

			// Same (CouponWithDiscountPercent.java) page object class use for (TC_012_AddCouponBuyXGetY) coupon with BuyX GetY test case
		
			CouponWithBuyXGetY couponxy = new CouponWithBuyXGetY(driver);
			couponxy.clickOnCouponButtonLeftSide();
			couponxy.clickOnCreateCouponButton();
			
			couponxy.clickOnBuyXgetYButton();
			couponxy.enterCouponNameXY(rb.getString("couponnamexy"));
			couponxy.selectallowfreeshippingcheckboxxy();
			
			
			
			//customer buy
			Thread.sleep(3000);
			couponxy.clickSearchProductxy();

			Thread.sleep(3000);
			couponxy.clickDownArrowButtonxy();
			
			
			Thread.sleep(3000);
			
			//couponxy.pressTABKeyAfterSelectCollectionxy1();
			
			
			couponxy.enterNoOfProductBuyXY(rb.getString("noofproductBuy"));
			
			
			couponxy.clickOnSelectCollectionDDxy();
			couponxy.clickOnSpecificCollectionxy();
			couponxy.pressTABKeyAfterSelectCollectionxy();
			
			Thread.sleep(5000);
			

			
			
			//customer gets
			couponxy.clickSearchProductCustomergets();
			couponxy.clickDownArrowButtonCustomergets();
			Thread.sleep(5000);
			couponxy.enternoofProductGetscustomerGets(rb.getString("noofProductGet"));
			Thread.sleep(5000);
			
			 
			
			
			
			
						
			
			couponxy.pressTab1();
			couponxy.clickOnCollectionDDCustomerGet();
			Thread.sleep(5000);
			couponxy.clickOnSpecificCollection();
			Thread.sleep(5000);
			couponxy.pressTABKeyAfterSelectCollectionCustomerGets();
			Thread.sleep(5000);
			
			//coupon validity 
			couponxy.clickOnStartDate(rb.getString("startdatexy"));
			couponxy.pressTabAfterClickStartCalendar();
			couponxy.clickStartTimeButtonxy(rb.getString("starttimexy"));
			
			couponxy.clickOnDatecheckbox();
			couponxy.clickExpiryDateCalendarButton(rb.getString("expirydatexy"));
			couponxy.pressTabAfterClickExpiryCalendar();
			couponxy.clickExpiryTimeButtonxy(rb.getString("expirytimexy"));
			Thread.sleep(5000);
			couponxy.enterUsageLimitPerCouponxy(rb.getString("usagelimitpercoupon"));
			couponxy.enterUsageLimitPerUser(rb.getString("usagelimitperuser"));
			couponxy.clickOnPublishButton();
			
		}
		catch (Exception e) {
		e.printStackTrace();
		
		} 
		}
	
	
	
		
	
}
