package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CouponWithDiscountPercent extends BasePage {

	public CouponWithDiscountPercent(WebDriver driver) {

		super(driver); // constructor
	}

	//Element Identifier
	
	@FindBy(xpath= "//span[normalize-space()='Coupons']")
	WebElement couponbuttonLeftSide;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-63ug8l']")
	 WebElement createCouponButton;
	
	@FindBy(xpath = "//li[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiMenuItem-root') and contains(@class, 'css-ckeqzn')][2]")
	WebElement discountPercentButton; // click on discount per button
	
	@FindBy(xpath = "//input[@placeholder='FBY500' and @type='text']")
			WebElement couponName;
	
	@FindBy(xpath = "//input[@placeholder='25' and @type='number']")
	WebElement discountPercent;  //enter discount percent in form 
	
	@FindBy(xpath="//div[@class='MuiStack-root css-1oic4ob']//label[1]//span[1]//input[1]")
	WebElement allowfreeshipcheckbox;       //select allow free shipping checkbox 
	
	
			//select date in calendar element locators
	//start calendar button
		@FindBy(xpath = "//input[@placeholder='FBY500' and @type='date']")
		WebElement startcalenderbutton;
		
		@FindBy (xpath = "//input[@placeholder='FBY500' and @type='time']")
		WebElement start_timebutton;
		
		@FindBy(xpath = "//div[@class='MuiStack-root css-yqzct5']//input[@type='checkbox']")
		WebElement setexpirydtcheckbox;
		
		@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
		WebElement expirycalenderdate;  //absolute xpath
		
		@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
		WebElement expirytimebutton;   //upto this calendar and time activity xpath
		
		@FindBy(xpath = "//input[@placeholder='500' and @type='number']")
		WebElement minpurchase_amt;
		
		@FindBy(xpath = "//input[@placeholder='1500' and @type='number']")
		WebElement maxpurchase_amt;
		
		//search product element locators
		
		@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
		WebElement searchProduct_Coupon;  //click on search product bar then press Down arrow button to select product
		
		@FindBy(xpath = "//div[@aria-haspopup='listbox' and @role='button']")
		WebElement selectCollection;  //click on collection dropdown
		
		
		@FindBy(xpath = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']")
		WebElement clickOncollection; // select collection in after open dropdown
		
		
		
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")
		WebElement uasgeLimitPerCoupon;
		
		@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/input[1]")
		WebElement usageLimitPerUser;
		
		@FindBy(xpath = "//button[@type='button' and @class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-woo5nx']")
		WebElement publishButton;
		
		
		/*********************************************************************************************************************/	
		
		  /*  NOTE: This below element locators is used for TC_011_AddCouponWithFreeShipping test case */
		
		
		@FindBy(xpath = "//li[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiMenuItem-root') and contains(@class, 'css-ckeqzn')][3]")
		WebElement freeShippingButton;  // click on Free Shipping Button
		
		@FindBy(xpath = "//input[@placeholder='FBY500' and @type='text']")
		WebElement couponNameFreeShipping;
		
		@FindBy(xpath = "//input[@placeholder='500' and @type='number']")
		WebElement minPurchaseAmtFreeShipping;
		
		@FindBy (xpath = "//input[@class='PrivateSwitchBase-input css-1m9pwf3' and @type='checkbox'][1]")
		WebElement autoApplyCoupon;
		
		//for warning msg if coupon name already exist
		@FindBy(xpath= "//p[@id=':r4p:-helper-text' and @class='MuiFormHelperText-root Mui-error MuiFormHelperText-sizeSmall MuiFormHelperText-contained MuiFormHelperText-filled css-hjvdj6']")
		WebElement warningmsgforcouponame;
		
		 /*  NOTE: This above element locators is used for TC_011_AddCouponWithFreeShipping test case */
		
		
	/*********************************************************************************************************************/	
		
		
	// Action method for TC_10_AddCouponWithDiscountPercent

	public void clickonCouponButton() {
		couponbuttonLeftSide.click();
	}

	public void clickoncreateCouponbtn() {
		createCouponButton.click();
	}

	public void clickDiscountPercentButton() {
		discountPercentButton.click();
	}

	public void enterCouponName(String cname) { // String with parameter for insert any text or number
		couponName.sendKeys(cname);
	}

	public void enterDiscountPercent(String discper) {
		discountPercent.sendKeys(discper);
	}

		public void selectCheckbox() {
			allowfreeshipcheckbox.click();
		}

		public void clickCalender(String dt1) {
			startcalenderbutton.sendKeys(dt1); // calendar

		}

		public void pressTabAfterClickingCalendar() {
			startcalenderbutton.sendKeys(Keys.TAB); // method for press Tab to focus time field enter date
		}

		public void clickTime(String tm) {
			start_timebutton.sendKeys(tm); // time
		}

		public void selectexpirydatecheckbox() {
			setexpirydtcheckbox.click();
		}

		public void clickexpiryCalender(String dt2) {
			expirycalenderdate.sendKeys(dt2);
		}

		public void pressTabAfterClickingExpiryCalendar() {
			expirycalenderdate.sendKeys(Keys.TAB); // method for press Tab to focus time field enter date
		}

		public void clickexpirytimebutton(String tm2) {
			expirytimebutton.sendKeys(tm2);
		}

		public void enterMinPurchaseAmt(String minpa) {
			minpurchase_amt.sendKeys(minpa);
		}

		public void enterMaxPurchaseAmt(String maxpa) {
			maxpurchase_amt.sendKeys(maxpa); // maximum purchase amount
		}

		public void clickSearchProduct() {
			Actions actions = new Actions(driver);
			actions.click(searchProduct_Coupon).build().perform(); // click on search product used Action method
		}

		public void clickDownArrowButton() {
			searchProduct_Coupon.sendKeys(Keys.ARROW_DOWN); // Press DownArrow key (keyboard) twice
			searchProduct_Coupon.sendKeys(Keys.ARROW_DOWN);
			searchProduct_Coupon.sendKeys(Keys.ARROW_DOWN);
			searchProduct_Coupon.sendKeys(Keys.ENTER); // press Enter key
			// searchProduct_Coupon.sendKeys(Keys.TAB);
		}

		public void clickOnSelectCollectionDD() {
			selectCollection.click();
		}

		public void clickOnSpecificCollection() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", clickOncollection);
		}

		public void pressTABKeyAfterSelectCollection() {
			clickOncollection.sendKeys(Keys.TAB);
		}

		public void enterUsageLimitPerCoupon(String ulpc) { // use javaScrptExecutor
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = arguments[1];", uasgeLimitPerCoupon, ulpc);
		}

		public void enterUsageLimitPerUser(String ulpu) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = arguments[1];", usageLimitPerUser, ulpu);
		}

		public void clickOnPublishButton() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", publishButton);
		}
		/*********************************************************************************************************************/
		/*
		 * NOTE: This below Action method is used for TC_011_AddCouponWithFreeShipping
		 * test case
		 */

		public void clickOnFreeShippingButton() {
			freeShippingButton.click();
		}

		public void enterCouponNameFreeshipping(String fsname) {
			couponNameFreeShipping.sendKeys(fsname);
		}

		public void enterMinPurchaseAmountfreeShipping(String minPA) {
			minPurchaseAmtFreeShipping.sendKeys(minPA);
		}

		public void selectAutoApplyCoupon() {
			autoApplyCoupon.click();
		}

		// Method to check if a coupon name already exists

		public boolean isCouponNameAlreadyExists() {
			try {

				WebElement wm = warningmsgforcouponame;
				String msg = wm.getText();

				return wm.isDisplayed();
			} catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
				return false;
			} finally {

			}
		}

		/*
		 * NOTE: This aboveAction method is used for TC_011_AddCouponWithFreeShipping
		 * test case
		 */
	}	
	
