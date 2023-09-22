package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

public class Menu_Functionality extends BasePage {

	
	public Menu_Functionality(WebDriver driver) {

		super(driver);

	}
	
	
	//Element Locators
	
	@FindBy(xpath = "//span[normalize-space()='Menu']")
	WebElement leftSideMenuButton;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-45bayy']")
	WebElement createMenubtn;
	
	@FindBy(xpath = "//input[@placeholder='Enter Menu Name']")
	WebElement menuName;
	
	@FindBy (xpath = "//div[@aria-haspopup='listbox']")
	WebElement addCategorybtn;
	
	@FindBy(xpath = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']")
	WebElement dropdownvalue;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-vp0s9d']")
	WebElement savebutton;
	
	@FindBy(xpath = "//td[normalize-space()='Mobile 1']")
	WebElement anymenu;
	
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-1j7qk7u'])[1]")
	WebElement editButton;
	
	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]")
	WebElement checkbox;
	
	@FindBy (xpath ="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1uy3cy0'])")
	WebElement innerUpdate;
	
	@FindBy (xpath= "(//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-vp0s9d'])")
	WebElement outerUpdate;
	
	
	//Actions Method
	public void clickOnLeftSideMenuButton() {
		leftSideMenuButton.click();
		
	}
	public void clickOnCreateMenuButton() {
		createMenubtn.click();
	}
	public void enterMenuName(String menuname) {
		Actions action = new Actions(driver);
		menuName.clear();
		action.sendKeys(menuname);
	}
	public void clickOnAddCategotyDropdown() {
		addCategorybtn.click();
	}
	public void selctDropdownValue() {
		dropdownvalue.click();
	}
	public void clickOnSaveButton() {
		savebutton.click();
		
	}
	public void clickOnAnyMenu() {
		anymenu.click();
		
	}
	public void clickOnEditButton() {
		editButton.click();
	
	}
	public void selectCheckBox() {
		checkbox.click();
	}
	public void clickOnInnerUpdate() {
		innerUpdate.click();
	}
	public void clickOnOuterUpdate() {
		outerUpdate.click();
	}
	
}
//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']  xpath for dropdown frame