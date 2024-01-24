package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Collection_Functionality extends BasePage {          //Add custom collection

	public Collection_Functionality(WebDriver driver) {

		super(driver);

	}
	
	
	//Element Locators
	@FindBy(xpath = "//span[normalize-space()='Collections']")
	WebElement collectionButtonLeftSide;
	@FindBy (xpath = "//button[normalize-space()='Add Custom Collection']")
	WebElement addCustomCollectionButton;
	@FindBy(xpath = "//input[@name='collectionname']")
	WebElement collectionName;
	@FindBy(xpath = "//input[@name='collectionslug']")
	WebElement collectionSlug;
	@FindBy(xpath = "//textarea[@name='collectiondescription']")
	WebElement collectionDescription;
	
	//Below Three locators are for SubCollection element locators
	
	//subCollection checkbox 
	
	@FindBy(xpath = "//input[@value='sub']")     
	WebElement subCollectionCheckbox;
	
	// select parent collection button
	@FindBy(xpath = "//div[@id='demo-select-small']")
	WebElement selectParentCollectionButton;
	
	//click on any one option of dropdown that is select specific parent collection
	@FindBy(xpath = "//li[@data-value='647455afee8dca24d528128f' and @role='option']")
			WebElement parentCollectionOption;
	
	
	
	
	//click on choose image button
	@FindBy(xpath= "//label[normalize-space()='Choose Image']")
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
	public void clickCollectionButtonLeftSide() {
		collectionButtonLeftSide.click();
	}

	public void clickOnAddCustomCollectionButton() {
		addCustomCollectionButton.click();
	}

	public void enterCollectionName(String clname) {
		collectionName.sendKeys(clname);
	}

	public void enterCollectionSlug(String cs) {
		collectionSlug.sendKeys(cs);
	}

	public void enterCollectionDescription(String cd) {
		collectionDescription.sendKeys(cd);
	}
	
	
	//Action method for SubCollection 
	public void selectSubCollectionCheckbox() {
		subCollectionCheckbox.click();
	}
	
	public void clickOnParentCollectionDropDown() {
		Actions actions = new Actions(driver);
		actions.click(selectParentCollectionButton).perform();
	}
	
	public void clickOnSpecificParentCollection() {
		parentCollectionOption.click();
	}
	
	
	
	public void clickOnChooseImageButton() {
		chooseImageButton.click();
	}
	public void clickOnAddProductButton () {
		firstAddProductButton.click();
	}
	public void clickSearchProductForCollection() {
		searchProductForColl.click();
		searchProductForColl.sendKeys(Keys.ARROW_DOWN);
		searchProductForColl.sendKeys(Keys.ARROW_DOWN);
		searchProductForColl.sendKeys(Keys.ARROW_DOWN);
		searchProductForColl.sendKeys(Keys.ENTER);
	}
	
	
	
//	public void pressDownArrayAfterClick() {
//		searchProductForColl.sendKeys(Keys.ARROW_DOWN);
//		searchProductForColl.sendKeys(Keys.ARROW_DOWN);
//		searchProductForColl.sendKeys(Keys.ARROW_DOWN);
//		searchProductForColl.sendKeys(Keys.ENTER);
//	} 

	public void clickOnAddProductBtnAfterSelectingProduct() {
		secondAddProductButton.click();
	}

	public void clickFinalAddCollectionButton() {
		finalAddCollectionButton.click();
	}

}
