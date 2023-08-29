package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CouponFunctionality extends BasePage {
	
public  CouponFunctionality (WebDriver driver) {
		
		super(driver);  //constructor
	}
	
	
//element identifier


	@FindBy(xpath= "//span[normalize-space()='Coupons']")  //left side coupon button
	WebElement couponbutton;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-63ug8l']")
	 WebElement createcouponButton;   // create coupon button
	
	@FindBy(xpath = "//li[contains(@class, 'MuiMenuItem-root') and contains(@class, 'css-ckeqzn')]")
	WebElement discountamount;   //1st discount amount button
	
	//this xpath also works for above button, here i mention prioeitize four button with number 1, 2, 3, 4 
	//li[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiMenuItem-root') and contains(@class, 'css-ckeqzn')][1]
	
	
	@FindBy (xpath = "//input[@name='couponcode' and @placeholder='FBY500']")
	WebElement couponcodename;
	
	@FindBy (xpath = "//input[@type='number' and @placeholder='FBY500' and @inputmode='numeric']")
	WebElement discamt;
	
	@FindBy(xpath="//div[@class='MuiStack-root css-1oic4ob']//label[1]//span[1]//input[1]")
	WebElement allowfreeshipcheckbox;       //select allow free shipping checkbox 
	
	
	
	//select date in calendar element locators
	@FindBy(xpath = "//input[@placeholder='FBY500' and @type='date']")
	WebElement startcalenderbutton;
	
	@FindBy (xpath = "//input[@placeholder='FBY500' and @type='time']")
	WebElement start_timebutton;              //click on time button
	
	
	@FindBy(xpath = "//div[@class='MuiStack-root css-yqzct5']//input[@type='checkbox']")
	WebElement setexpirydtcheckbox;
	
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement expirycalenderdate;  //absolute xpath
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	WebElement expirytimebutton;
	
	
	@FindBy(xpath = "//input[@placeholder='500' and @type='number']")
	WebElement minpurchase_amt;        //minimum purchase amount 
	
	@FindBy(xpath = "//input[@placeholder='1500' and @type='number']")
	WebElement maxpurchase_amt;           //maximum purchase amount
	
	
	
	//search product
	@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchProduct_Coupon;
	
	@FindBy(xpath = "//div[@aria-haspopup='listbox' and @role='button']")
	WebElement selectCollection;
	
	
	@FindBy(xpath = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']")
	WebElement clickOncollection;
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")
	   WebElement uasgeLimitPerCoupon;
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement usageLimitPerUser;
	
	@FindBy(xpath = "//button[@type='button' and @class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-woo5nx']")
	WebElement publishButton;
	
	
	//Action method 
	public void clickonCouponButton () {
	couponbutton.click();
	}
	
	public void clickoncreateCouponbtn () {
		createcouponButton.click();
		}
	
	public void clickonDiscountAmount () {
		discountamount.click();
		}
	
	public void enterCouponCodeName(String couponName) {
		couponcodename.sendKeys(couponName);
		}
	
	public void enterDiscountAmount(String damount) {
		discamt.sendKeys(damount);
		}
	
	public void selectCheckbox() {
		allowfreeshipcheckbox.click();   
		}
	public void clickCalender(String dt1) {
		startcalenderbutton.sendKeys(dt1);     //calendar 
		
		}
	
	 public void pressTabAfterClickingCalendar() {
		 startcalenderbutton.sendKeys(Keys.TAB);           //method for press Tab to focus time field  enter date 
	    }
	
	 public void clickTime(String tm) {
		 start_timebutton.sendKeys(tm);     //time 
		}
	 
	 
	public void selectexpirydatecheckbox() {
		setexpirydtcheckbox.click();
	}
	
	public void clickexpiryCalender(String dt2) {
	expirycalenderdate.sendKeys(dt2);
	}
	
	 public void pressTabAfterClickingExpiryCalendar() {
		 expirycalenderdate.sendKeys(Keys.TAB);           //method for press Tab to focus time field  enter date 
	    }
	public void clickexpirytimebutton(String tm2) {
		expirytimebutton.sendKeys(tm2);
	}
	
	public void enterMinPurchaseAmt(String minpa) {
		minpurchase_amt.sendKeys(minpa);
	}
	public void enterMaxPurchaseAmt(String maxpa) {
		maxpurchase_amt.sendKeys(maxpa);    //maximum purchase amount
	}
	
	
	
	
	
	
	
	
	
	public void clickSearchProduct() {
		Actions actions = new Actions(driver);
		actions.click(searchProduct_Coupon).build().perform();  //click on search product used Action method 
	}
	public void clickDownArrowButton() {
		searchProduct_Coupon.sendKeys(Keys.ARROW_DOWN);  //Press DownArrow key (keyboard) twice
		searchProduct_Coupon.sendKeys(Keys.ARROW_DOWN);
		searchProduct_Coupon.sendKeys(Keys.ARROW_DOWN);
		searchProduct_Coupon.sendKeys(Keys.ENTER);               //press Enter key
		//searchProduct_Coupon.sendKeys(Keys.TAB);
	}
	
	
	
	public void clickOnSelectCollectionDD() {
		selectCollection.click();
	}
	
	public void clickOnSpecificCollection() {
	clickOncollection.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void enterUsageLimitPerCoupon(String ulpc){
		uasgeLimitPerCoupon.sendKeys(ulpc);
	}
	
	public void enterUsageLimitPerUser(String ulpu) {
		usageLimitPerUser.sendKeys(ulpu);
	}
	public void clickOnPublishButton(){
		publishButton.click();
}
}
