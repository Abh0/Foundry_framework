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

public class CouponWithBuyXGetY extends BasePage{

	
	public CouponWithBuyXGetY(WebDriver driver) {

		super(driver); // constructor
	}
	
	
	
	@FindBy(xpath= "//span[normalize-space()='Coupons']")
	WebElement couponbuttonLeftSide;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-63ug8l']")
	 WebElement createCouponButton;
	
	@FindBy(xpath = "//li[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiMenuItem-root') and contains(@class, 'css-ckeqzn')][4]")
	WebElement buyXGetYButton;
	
	
	@FindBy(xpath = "//input[@placeholder='FBY500' and @type='text']")
	WebElement couponNameXY;
	
	@FindBy(xpath="//div[@class='MuiStack-root css-1oic4ob']//label[1]//span[1]//input[1]")
	WebElement allowfreeshippingxy;  
	
	
	//search product element locators   
	//Customer Buy
	//click on search product bar , then open product dropdown
	
			@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]/parent::div")
			WebElement searchProduct_Couponxy;  //click on search product bar then press Down arrow button to select product
		
					//No. of product Buy
			@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
			WebElement noOfProductBuy;      
			
			@FindBy(xpath = "//div[@aria-haspopup='listbox' and @role='button']/parent::div")
			WebElement selectCollectionxy;  //click on collection dropdown
			
		// absolute xpath^	/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]
			
			@FindBy(xpath = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']")
			WebElement clickOncollectionxy; // select collection or categories in after open dropdown
	
	
	//customer Gets
			//click on search product
	@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]/parent::div")
	WebElement searchProductCustomergets;
			
			
	//No. of product Get
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement noofProductGetscustomerGets;
	
	// click on collection button
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]")
	WebElement selectCollectiondropdown;  //error
	
	//click on to select collection categories
	@FindBy(xpath = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz' and @data-value='64743ad8ee8dca24d528125e']")
	WebElement specificCollectionCustomerGets;
	
	
	
	
	//coupon validity calendar and time
	//click on calendar
	@FindBy(xpath = "//input[@type='date' and @placeholder='FBY500']/parent::div")
	WebElement startDateCalendarButton;

	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement startTimebuttonxy;
	
	@FindBy(xpath = "//div[@class='MuiStack-root css-yqzct5']//input[@type='checkbox']")
	WebElement datecheckbox;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement expiryDateCalendarButton;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	WebElement expiryTimeButtonxy;
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement usageLimitPerCoupon;
	 
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement usageLimitPerUser;
	
	 @FindBy (xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-woo5nx']")
	 WebElement publishButton;
	 
	 
	//Action methods 
	
	public void clickOnCouponButtonLeftSide() { 
		couponbuttonLeftSide.click();
	}

	public void clickOnCreateCouponButton() { 
		createCouponButton.click();
	}

	public void clickOnBuyXgetYButton() { 
		buyXGetYButton.click();
	}

	public void enterCouponNameXY(String cnamexy) {
		couponNameXY.sendKeys(cnamexy);
	}

	public void selectallowfreeshippingcheckboxxy() { 
		allowfreeshippingxy.click();
	}

	// Customer Buy : element locators section 
	public void clickSearchProductxy() {
		Actions actions = new Actions(driver);
		actions.click(searchProduct_Couponxy).build().perform(); // click on search product used Action method
	}

	public void clickDownArrowButtonxy() {
		Actions actions = new Actions(driver); 
		actions.sendKeys(searchProduct_Couponxy, Keys.ARROW_DOWN); 
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ENTER).build().perform();
	}


	public void enterNoOfProductBuyXY(String pdbuy) { 
		noOfProductBuy.sendKeys(pdbuy);
	}

	public void clickOnSelectCollectionDDxy() { //         click on select categories
		selectCollectionxy.click();
	}

	public void clickOnSpecificCollectionxy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", clickOncollectionxy);
	}

	public void pressTABKeyAfterSelectCollectionxy() {
		clickOncollectionxy.sendKeys(Keys.TAB); 
	}

	
	
	
	// Customer gets: element locators section
	public void clickSearchProductCustomergets() { 
		Actions actions = new Actions(driver);
		actions.click(searchProductCustomergets).build().perform(); // click on search product used Action method
	}

	public void clickDownArrowButtonCustomergets() {
		Actions actions = new Actions(driver);                                             
		actions.sendKeys(searchProductCustomergets, Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
			actions	.sendKeys(Keys.ENTER).build().perform();
	}


	public void enternoofProductGetscustomerGets(String pdget) {
		Actions actions = new Actions(driver);
		actions.sendKeys(noofProductGetscustomerGets, pdget).build().perform();
	}

	
	
	//press twice tab and enter
	public void pressTab1 () {
		noofProductGetscustomerGets.sendKeys(Keys.TAB);
		noofProductGetscustomerGets.sendKeys(Keys.TAB);
		noofProductGetscustomerGets.sendKeys(Keys.ENTER);
	}
	
	
	
	 		public void clickOnCollectionDDCustomerGet () {
 			selectCollectiondropdown.click();
	 			} 
	
	public void clickOnSpecificCollection() {
		Actions actions = new Actions(driver);
		actions.click(specificCollectionCustomerGets).build().perform();
	} 
	

	public void pressTABKeyAfterSelectCollectionCustomerGets() {
		Actions actions = new Actions(driver);
		actions.sendKeys(searchProductCustomergets, Keys.TAB).build().perform();
	}

	//coupon validity 
	
	public void clickOnStartDate(String stdt) {
		Actions actions = new Actions(driver);
		actions.moveToElement(startDateCalendarButton).click().sendKeys(stdt).build().perform();
	}

	public void pressTabAfterClickStartCalendar() {
		Actions actions = new Actions(driver);
		actions.moveToElement(startDateCalendarButton).click().sendKeys(Keys.TAB).build().perform();
	}

	public void clickStartTimeButtonxy(String sttime) {
		startTimebuttonxy.sendKeys(sttime);
	}

	public void clickOnDatecheckbox() {
		datecheckbox.click();
	}

	public void clickExpiryDateCalendarButton(String exdt) {
		expiryDateCalendarButton.sendKeys(exdt);
	}

	public void pressTabAfterClickExpiryCalendar() {
		expiryDateCalendarButton.sendKeys(Keys.TAB);
	}

	public void clickExpiryTimeButtonxy(String extime) {
		expiryTimeButtonxy.sendKeys(extime);
	}

	public void enterUsageLimitPerCouponxy(String ulpc) {
		usageLimitPerCoupon.sendKeys(ulpc);
	}
	
	public void enterUsageLimitPerUser(String ulpu) {
		usageLimitPerUser.sendKeys(ulpu);
	}
	
	
	public void clickOnPublishButton () {
		publishButton.click();
	}
}
