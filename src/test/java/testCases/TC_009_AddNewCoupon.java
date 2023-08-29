package testCases;

import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.CouponFunctionality;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_009_AddNewCoupon extends BaseClass {

	@Test(priority=9)
	public void addCoupon_Foundry() throws IOException, InterruptedException {

		try {

			Home_page hp = new Home_page(driver);
			hp.clickSignIn();

		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			Application_Sign_inPage sign3 = new Application_Sign_inPage(driver);
			sign3.enterEmailId(rb.getString("email1"));
			sign3.enterPassword(rb.getString("password1"));
			sign3.clickOnLoginbtn();

			CouponFunctionality coupon = new CouponFunctionality(driver);
			coupon.clickonCouponButton();
			coupon.clickoncreateCouponbtn();
			coupon.clickonDiscountAmount();
			coupon.enterCouponCodeName(rb.getString("couponcodename"));
			coupon.enterDiscountAmount(rb.getString("discAmt"));
			coupon.selectCheckbox(); // select allow free shipping checkbox
			Thread.sleep(3000);

			coupon.clickCalender(rb.getString("startcoupondate"));

			coupon.pressTabAfterClickingCalendar();
			Thread.sleep(3000);
			coupon.clickTime(rb.getString("startcoupontime"));
			Thread.sleep(3000);
			
			
			coupon.selectexpirydatecheckbox();
			coupon.clickexpiryCalender(rb.getString("expirycoupondate"));
			
			coupon.pressTabAfterClickingExpiryCalendar();
			Thread.sleep(3000);
			coupon.clickexpirytimebutton(rb.getString("expirycoupontime"));
			Thread.sleep(3000);
			
			coupon.enterMinPurchaseAmt(rb.getString("minpurchaseamount"));
			coupon.enterMaxPurchaseAmt(rb.getString("maxpurchaseamount"));
			
		
			
			coupon.clickSearchProduct();
			coupon.clickDownArrowButton();
			Thread.sleep(3000);
			
			
			coupon.clickOnSelectCollectionDD();
			coupon.clickOnSpecificCollection();
			
			Thread.sleep(5000);
			
			
			
			
			
			coupon.enterUsageLimitPerCoupon(rb.getString("usageLimitPerCoupon"));
			coupon.enterUsageLimitPerUser(rb.getString("usageLimitPerUser"));
			Thread.sleep(3000);
			coupon.clickOnPublishButton();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
