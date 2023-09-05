package pageObject;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Variant_Product_functionality extends BasePage{

	
	
	public Variant_Product_functionality(WebDriver driver) {

		super(driver);

	}
	
	
	//element identifier
	
	@FindBy(xpath = "//span[normalize-space()='Products']")
	WebElement productButtonLeftSide;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-52k1b0']")
	WebElement addProductButton;
	
	@FindBy(xpath = "//input[@name='productname']")
	WebElement productName;
	
	@FindBy(xpath = "//textarea[@name='productdescription']")
	WebElement productDescription ;
	
	@FindBy(xpath = "//label[normalize-space()='Add Images']")
	WebElement addImageButton;
	
	@FindBy(xpath = "//input[@value='variant']")
	WebElement variantProductCheckbox;
	
	@FindBy(xpath = "//button[normalize-space()='Add Attributes']")
	WebElement addAttributesButton;
	
	@FindBy(xpath = "//input[@name='productvariantname']")
	WebElement variantProductName;
	
	@FindBy(xpath = "(//input[@name='productvariantoptions' and @type='text'])[1]")
	WebElement variantProductOptions1;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yx12o9']//*[name()='svg']")
	WebElement addMoreVariantButton;
	
	@FindBy(xpath = "(//input[@name='productvariantoptions' and @type='text'])[2]")
	WebElement variantProductOptions2;
	
	//generate variants button
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1g4pia3']")
	WebElement generateVariantButton;
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-4xd59i']")
	WebElement variantAddDetails;
	
	@FindBy(xpath = "//label[normalize-space()='Add More Images']")
	WebElement addMoreimagesButton;
	
//pricing section
	//Regular price 
	@FindBy(xpath = "//input[@name='mrp' and @placeholder='Eg: ₹999']")
	WebElement regularPrice;

	// sale price
	@FindBy(xpath = "//input[@name='saleprice' and @placeholder='Eg: ₹900']")
	WebElement salePrice;
	
	//click on feature button
	@FindBy (xpath = "//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-1q8p1wn']")
	WebElement featureButton;
	
	@FindBy(xpath = "(//input[@name='productfeature'])[1]")
	WebElement feature1;
	
	//click on Inventory
	@FindBy(xpath = "//button[normalize-space()='Inventory']")
	WebElement inventoryButton;
	
	@FindBy(xpath = "//input[@name='productsku']")
	WebElement pdSKU;
	
	@FindBy(xpath = "//input[@name='productstock']")
	WebElement pdSTOCK;
	
	//shipping details
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-1q8p1wn']")
	WebElement shippingButton;
	
	@FindBy(xpath = "//input[@name='productweight']")
	WebElement productweight;
	
	@FindBy(xpath = "//input[@name='productlength']")
	WebElement productlenght;
	
	@FindBy(xpath = "//input[@name='productwidth']")
	WebElement productWidth;
	
	@FindBy(xpath = "//input[@name='productheight']")
	WebElement productheight;
	
	@FindBy(xpath = "//input[@name='productshippingregion']")
	WebElement shippingRegion;
	
	
	
	//search engine optimization: product meta title
	@FindBy(xpath = "//input[@name='productmetatitle']")
	WebElement productMetaTitle;
	
	@FindBy(xpath = "//textarea[@name='productdescription']")
	WebElement productMetaDesc;
	
	
	//click on publish button
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1opsdle']")
	WebElement publishButton;
	
	
	
	// Action method
	public void clickOnProductButtonLeftSide() {
		productButtonLeftSide.click();
	}

	public void clickOnAddProductButton() {
		addProductButton.click();
	}

	public void enterProductName(String vpd) {
		productName.sendKeys(vpd);
	}

	public void enterProductDescription(String vdesc) {
		productDescription.sendKeys(vdesc);
	}

	public void clickOnAddImageButton() {
		addImageButton.click();
	}
	
	public void selectVariantProductCheckbox() {
		variantProductCheckbox.click();
	}
	public void clickOnAddAttributesButton() {
		addAttributesButton.click();
	}
	public void enterVariantProductName(String varpname) {
		variantProductName.sendKeys(varpname);
	}
	
	public void enterVariantProductOptions1(String varipdesc) {
		variantProductOptions1.sendKeys(varipdesc);
	
	}
	public void clickOnAddMoreVariantButton() {
		addMoreVariantButton.click();
	}
	
	public void enterVariantProductOptions2(String varpdesc) {
		variantProductOptions2.sendKeys(varpdesc);
	}
	
	public void clickOnGenerateVariantButton() {
		generateVariantButton.click();
	}
	
	
	public void clickOnVariantAddDetails() {
		variantAddDetails.click();
	}
	
	
	public void clickOnAddMoreimagesButton() {
		addMoreimagesButton.click();
	}
	
	public void enterRegularPrice(String regprice) {
		regularPrice.sendKeys(regprice);
	}
	
	public void enterSalePrice(String salepr) {
		salePrice.sendKeys(salepr);
	}
	
	
	
	public void clickOnFeatureButton () {
		featureButton.click();
	}
	
	public void enterFeature1(String fe) {
        Actions actions = new Actions(driver);
        actions.sendKeys(feature1, fe).build().perform();
    }
	
	
	public void clickOnInventoryButton() {
		inventoryButton.click();
	}
	public void enterProductSku(String sku) {
		pdSKU.sendKeys(sku);
	}
	
	public void enterProductStock(String stc) {
		pdSTOCK.sendKeys(stc);
	}
	
	
	public void clickOnShippingButton() {
		shippingButton.click();
	} 
	public void enterProductweight(String weight) {
		productweight.sendKeys(weight);
	}
	public void enterProductLenght(String lenght) {
		productlenght.sendKeys(lenght);
	}
	
	public void enterProductWidth(String width) {
		productWidth.sendKeys(width);
	}
	
	public void enterProductheight(String height) {
		productheight.sendKeys(height);
	}
	public void enterShippingRegion(String region) {
		shippingRegion.sendKeys(region);
	}

	public void enterProductMetaTitle(String meta) {
		productMetaTitle.sendKeys(meta);
	}
	public void enterProductMetaDesc(String descmeta) {
		productMetaDesc.sendKeys(descmeta);
	}
	public void clickOnPublishButton() {
		publishButton.click();
	}
	
}
