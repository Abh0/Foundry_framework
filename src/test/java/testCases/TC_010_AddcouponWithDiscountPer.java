package testCases;

import java.io.IOException;
import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.CouponWithDiscountPercent;
import pageObject.Home_page;
import testBase.BaseClass;

public class TC_010_AddcouponWithDiscountPer extends BaseClass {

	
	@Test(priority = 10)
	public void addCouponWithDiscountPercent() throws IOException, InterruptedException {

		try {

			Home_page hp = new Home_page(driver);
			hp.clickSignIn();

			Application_Sign_inPage sign3 = new Application_Sign_inPage(driver);
			sign3.enterEmailId(rb.getString("email"));
			sign3.enterPassword(rb.getString("password"));
			sign3.clickOnLoginbtn();

			logger.info("Add coupon with Discount percent ");
			CouponWithDiscountPercent coupondp = new CouponWithDiscountPercent(driver);

			coupondp.clickonCouponButton();
			coupondp.clickoncreateCouponbtn();
			coupondp.clickDiscountPercentButton();
			coupondp.enterCouponName(rb.getString("couponcodeName"));
			coupondp.enterDiscountPercent(rb.getString("discper"));
			coupondp.selectCheckbox();
			coupondp.clickCalender(rb.getString("startcoupondate"));
			coupondp.pressTabAfterClickingCalendar();
			coupondp.clickTime(rb.getString("startcoupontime"));
			coupondp.selectexpirydatecheckbox();
			coupondp.clickexpiryCalender(rb.getString("expirycoupondate"));
			Thread.sleep(3000);
			coupondp.pressTabAfterClickingExpiryCalendar();
			coupondp.clickexpirytimebutton(rb.getString("expirycoupontime"));

			coupondp.enterMinPurchaseAmt(rb.getString("minpurchaseamount"));
			coupondp.enterMaxPurchaseAmt(rb.getString("maxpurchaseamount"));

			
			
			//click on search product bar
			coupondp.clickSearchProduct();

			coupondp.clickDownArrowButton();
			Thread.sleep(3000);
			coupondp.clickOnSelectCollectionDD();
			Thread.sleep(3000);
			coupondp.clickOnSpecificCollection();
			Thread.sleep(3000);

			coupondp.pressTABKeyAfterSelectCollection();

			Thread.sleep(3000);
			try {

				coupondp.enterUsageLimitPerCoupon(rb.getString("usageLimitPerCoupon"));
				Thread.sleep(3000);
				coupondp.enterUsageLimitPerUser(rb.getString("usageLimitPerUser"));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("verify number inserted " + e.getMessage());
			}

			coupondp.clickOnPublishButton();
			Thread.sleep(10000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
