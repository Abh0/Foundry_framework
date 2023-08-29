package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.CouponWithDiscountPercent;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_011_AddCouponFreeShipping extends BaseClass {

	@Test(priority = 11)
	public void addCouponWithFreeShipping() throws IOException, InterruptedException {

		try {

			Home_page hp = new Home_page(driver);
			hp.clickSignIn();

			Application_Sign_inPage sign3 = new Application_Sign_inPage(driver);
			sign3.enterEmailId(rb.getString("email"));
			sign3.enterPassword(rb.getString("password"));
			sign3.clickOnLoginbtn();

			logger.info("Add coupon with Free Shipping ");

			// Same (CouponWithDiscountPercent.java) page object class use for (TC_011_AddCouponFreeShipping) coupon with
			// Free shipping test case
			CouponWithDiscountPercent couponfs = new CouponWithDiscountPercent(driver);

			couponfs.clickonCouponButton();
			couponfs.clickoncreateCouponbtn();
			couponfs.clickOnFreeShippingButton();
			couponfs.enterCouponNameFreeshipping(rb.getString("freeshippingcouponname"));
			couponfs.enterMinPurchaseAmountfreeShipping(rb.getString("minpurchaseamountfs"));
			couponfs.selectAutoApplyCoupon();
			couponfs.clickCalender(rb.getString("startcoupondatefs"));
			couponfs.pressTabAfterClickingCalendar();
			couponfs.clickTime(rb.getString("startcoupontimefs"));
			couponfs.selectexpirydatecheckbox();
			couponfs.clickexpiryCalender(rb.getString("expirycoupondatefs"));
			couponfs.pressTabAfterClickingExpiryCalendar();
			couponfs.clickexpirytimebutton(rb.getString("expirycoupontimefs"));
		
		
			
			
			// Check if the coupon name already exists
			if (couponfs.isCouponNameAlreadyExists()) {

			} else {

				couponfs.clickOnPublishButton();

			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
