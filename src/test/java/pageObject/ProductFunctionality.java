package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductFunctionality extends BasePage {

	public ProductFunctionality(WebDriver driver) {

		super(driver);

	}

	@FindBy(xpath = "//span[normalize-space()='Products']")
	WebElement productButtonleftside;

	@FindBy(xpath = "//button[normalize-space()='Add Product']")
	WebElement addProductButton; // click on ADD PRODUCT button on page

	@FindBy(xpath = "//input[@name='productname' and @placeholder='Type Product Name here']")
	WebElement productName;

	@FindBy(xpath = "//textarea[@name='productdescription' and @placeholder='Type Product Description here']")
	WebElement productDescription;

	@FindBy(xpath = "//label[@style='padding: 8px; cursor: pointer;']")
	WebElement addImage; // add image button
	
	@FindBy(xpath = "//input[@placeholder='Eg: ₹999' and @id='mrp']")
	WebElement regPriceText;
	
	@FindBy(xpath = "//input[@placeholder='Eg: ₹900' and @id='sale_price']")
	WebElement sales_Price;
	
	@FindBy(xpath = "//button[normalize-space()='Inventory']")
	WebElement inventarybutton;
	
	@FindBy(xpath = "//input[@name='productsku']")
	WebElement productsku;
	
	@FindBy(xpath = "//input[@name='productstock']")
	WebElement productstock;
	
	@FindBy (xpath = "//input[@name='productmetatitle' and @placeholder='Type Meta Title here']")
	WebElement metaTitle;
	
	@FindBy(xpath = "//textarea[@name='productmetadesc' and @placeholder='Type Meta Description here']")
	WebElement metadescription;
	
	@FindBy(xpath = "//button[normalize-space()='Category']")
	WebElement categorydd;
	
	@FindBy(xpath = "//input[@class='PrivateSwitchBase-input css-1m9pwf3' and @value='Men']")//select checkbox 
	WebElement catcheckbox ;
	
	@FindBy(xpath = "//button[normalize-space()='Sub Category']")
	WebElement subcategorydd;
	
	@FindBy(xpath = "//input[@class='PrivateSwitchBase-input css-1m9pwf3' and @value='Hoodies']")
	WebElement subcatcheckbox;
	
	@FindBy (xpath = "//textarea[@placeholder='Eg: Fashion, Health, Places']")
	WebElement tags;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1opsdle']")
	WebElement publishButton;
	
	// Action Method
	public void clickOnProductButton() {
		productButtonleftside.click();
	}

	public void clickAddProductButton() {
		Actions act = new Actions(driver);
		act.moveToElement(addProductButton).click().perform();
	}

	public void enterProductName(String pdname) {
		productName.sendKeys(pdname);
	}

	public void enterProductDescription(String pdDescription) {
		productDescription.sendKeys(pdDescription);
	}

	public void clickAddImageButton() {
            addImage.click();
		}
	public void enterRegularPrice(String regprice) {
        regPriceText.sendKeys(regprice);
	}
	public void enterSalesPrice(String saleprice) {
        sales_Price.sendKeys(saleprice);
	}
	public void clickInventaryButton() {
        inventarybutton.click();
	}
	public void enterproductsku(String psku) {
        productsku.sendKeys(psku);
	}
	public void enterProductStock(String pstock) {
        productstock.sendKeys(pstock);
	}
	
	public void enterMetaTitle (String mtitle) {
		metaTitle.sendKeys(mtitle);
	}
	
	public void enterMetaDescription (String mdesc) {
		metadescription.sendKeys(mdesc);
	}
	public void clickCategoryDD () {
		categorydd.click();
		}
	public void selectCategory () {
		catcheckbox.isEnabled();
	}
	
	public void clicksubCategory () {
		subcategorydd.click();
	}
	
	public void selectSubcategory() {
		subcatcheckbox.isEnabled();
	}
	public void entertags (String tag) {
		tags.sendKeys(tag);
	}
	
	public void clickPublishButton() {
		publishButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	}

