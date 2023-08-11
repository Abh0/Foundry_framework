package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OrderFunctionality extends BasePage{

	
	public OrderFunctionality(WebDriver driver) 
	{
		super(driver);
		
		}
	
	//click on order button on home page 
	@FindBy (xpath = "//span[normalize-space()='Orders']")
	WebElement orderButton;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-45bayy']")
	WebElement addorderbutton;
	
	@FindBy(xpath = "//input[@name='name' and @type='text']")
	WebElement customerName;
	
	@FindBy(xpath = "//input[@name='email' and @type='email']")
	WebElement customerEmail; 
	
	
	 //contact number here i enter absolute  xpath cause on same page two element are same
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")
	WebElement customerPhoneNumaber;
                  
	
	@FindBy (xpath = "//input[@name='house']")
	WebElement customerHouseNo;
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
	WebElement dropdownType;
	
	@FindBy (xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[2]")
	WebElement dropdownvalue;
	
	@FindBy(xpath = "//textarea[@name='address']") 
	WebElement customerAddress ;
	
	@FindBy (xpath = "//input[@name='pincode' and @type='number']")
	WebElement customerPINCode ;                     // customer pin code
	//Absolute xpath
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[1]/input[1]")
	WebElement orderDeliveryNumber;
	
	// click on add product button 
	@FindBy (xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1ptlh4a'] ")
	WebElement addProductButton;
	
	@FindBy (xpath = "/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement serachProduct;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-11i3utc' and @type='button']")
	WebElement addProductButtonsecond;
	
	
	//click on Add or submit button
	@FindBy(xpath = "//button[@tabindex='0' and @class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-gu5yxk'] ")
	WebElement addButton;
	
	
	
	
	
	

	
	
	//Action method
	public void clickOrderbutton () {
		orderButton.click();
	}
	public void clickAddOrderButton() {
		addorderbutton.click();
	}
	
	public void enterCustomerName(String cname) {
		customerName.sendKeys(cname);
	}
	
	public void enterCustomerEmail(String cemail) {
		customerEmail.sendKeys(cemail);
	}
	public void enterCustomerPhoneNo(String cphone) {
		customerPhoneNumaber.sendKeys(cphone);
		
	}
	public void enterCustomerHouseNo(String chouse) {
		customerHouseNo.sendKeys(chouse);
	}
	 public void clickOnTypeDropdown () {
		 dropdownType.click();
	 }
	 public void selectdropdownvalue() {
		 dropdownvalue.click();
	 }
	 public void enterCustomerAddress (String caddress ) {
		 customerAddress.sendKeys(caddress);
	 }
	  public void enterCustomerPINcode (String pincode) {
		  customerPINCode.sendKeys(pincode);
	  }
	  public void enterCustomerDeliveryNo (String oDelivery) {
		  orderDeliveryNumber.sendKeys(oDelivery);
	  }
	  
	  public void clickOnAddProductButton () {
		  addProductButton.click();
	  }
	  
	  public void searchProductText(String sProduct) {
		  serachProduct.sendKeys(sProduct);
		  serachProduct.sendKeys(Keys.ENTER);  //Press Enter key on keyboard
		  
	  }
	  public void clickOnAddProductBtnSecond () {
		  addProductButtonsecond.click();
	  }
	  
	   
	   public void clickOnAddButton() {
		    Actions act = new Actions(driver);
		    act.moveToElement(addButton).click().perform();
		}
	  
}