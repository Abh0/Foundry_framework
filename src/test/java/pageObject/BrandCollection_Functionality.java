package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



public class BrandCollection_Functionality  extends BasePage{

	public BrandCollection_Functionality(WebDriver driver) {

		super(driver);

	}
	
	//Element locators
	@FindBy (xpath = "//span[normalize-space()='Collections']")
	WebElement collectionLeftSideButton;
	
	@FindBy(xpath = "//span[normalize-space()='Brand Collection']")
	WebElement brandcollectionButton;
	
	@FindBy(xpath = "//button[normalize-space()='Add Brand Collection']")	
	WebElement addBrandCollectionButton;
	
	@FindBy(xpath = "//input[@name='collectionname']")
	WebElement collectionName;
	
	@FindBy(xpath = "//input[@name='collectionslug']")
	WebElement collectionslug;
	
	@FindBy(xpath = "//textarea[@name='collectiondescription']")
	WebElement collectionDescription;
	
	@FindBy(xpath = "//label[normalize-space()='Choose Image']")
	WebElement chooseImageButton;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1tlh21t']")
	WebElement firstAddProductButton;
	
	
	@FindBy(xpath = "//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchProductForColl;
	
	
	
	
	
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-11i3utc']")
	WebElement secondAddProductButton; 
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1opsdle']")
	WebElement finalAddCollectionButton;
	
	//Action method
		
	public void clickOnCollectionLeftSideButton() {
		collectionLeftSideButton.click();
	}

	public void clickOnBrandCollectionLeftSideButton() {
		brandcollectionButton.click();
	}

	public void clickOnAddBrandCollection() {
		addBrandCollectionButton.click();
	}

	public void enterCollectionName(String cname) {
		collectionName.sendKeys(cname);
	}

	public void enterCollectionSlug(String slug) {
		collectionslug.sendKeys(slug);
	}

	public void enterCollectionDescription(String desc) {
		collectionDescription.sendKeys(desc);
	}

	public void clickOnChooseImageButton() {
		chooseImageButton.click();
	}
	public void clickOnAddProductButton () {
		firstAddProductButton.click();
	}
	
	public void clickSearchProductForCollection() {
		searchProductForColl.click();                        //click on search bar 
//		searchProductForColl.sendKeys(Keys.ARROW_DOWN);     // press down arrow of keyboard
//		searchProductForColl.sendKeys(Keys.ARROW_DOWN);             // press down arrow of keyboard
//		searchProductForColl.sendKeys(Keys.ARROW_DOWN);            // press down arrow of keyboard
//		searchProductForColl.sendKeys(Keys.ENTER);                     // press Enter key of keyboard
		
	}
	
	
	public void pressDownArrayAfterClick () {
	searchProductForColl.sendKeys(Keys.ARROW_DOWN);     // press down arrow of keyboard
	searchProductForColl.sendKeys(Keys.ARROW_DOWN);             // press down arrow of keyboard
	searchProductForColl.sendKeys(Keys.ARROW_DOWN);            // press down arrow of keyboard
	searchProductForColl.sendKeys(Keys.ENTER);  
	}
	
	
	public void clickOnAddProductBtnAfterSelectingProduct() {
		secondAddProductButton.click();
	}
	public void clickFinalAddCollectionButton() {
		finalAddCollectionButton.click();
	}
	
}
