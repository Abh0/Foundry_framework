package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Order_BULK_ACTION_fun  extends BasePage{

	public Order_BULK_ACTION_fun(WebDriver driver) {

		super(driver);
	}
	
	//Element Locators
	
	@FindBy(xpath = "//span[normalize-space()='Orders']")
	WebElement orderButtonLeftside;

	@FindBy (xpath = "//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-root MuiCheckbox-colorPrimary css-t2fsqn']//input[@type='checkbox']")
	WebElement orderIDCheckbox;
	
	@FindBy(xpath = "//button[normalize-space()='Bulk Action']")
	WebElement bulkActionButton;
	
	//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1sdumzy']
	
	@FindBy(xpath = "(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-1uwabd6'])[1]")
	WebElement changedStatusToCancelled;
	
	@FindBy(xpath = "(//button[normalize-space()='Apply'])[1]")
	WebElement applyButton;
	
	
	
	
	@FindBy(xpath = "//button[@aria-label='Go to page 2']")
	WebElement page2SlidePagination;
	
	@FindBy(xpath = "(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-1uwabd6'])[2]")
	WebElement changedStatusToPending;
	
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-text MuiPaginationItem-circular MuiPaginationItem-page css-1xr9krm'])[2]")
	WebElement page3SlidePagination;
	
	
	//dropdown value
	@FindBy(xpath = "(//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-1uwabd6'])[3]")
	WebElement changedStatusToProcessing;
	
	 
	
	//Action method
	
	
//	private void clickWithJavaScript(WebElement element) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", element);
//    }
	
	public void clickOnOrderButton() {
		orderButtonLeftside.click();
	}

	public void selectOrderIDCheckbox() {
		Actions actions = new Actions(driver);
		actions.click(orderIDCheckbox).build().perform();
	}

	public void clickOnBulkActionButton() {
		bulkActionButton.click();
	}
	public void firstValueChangedStatusToCancelled() {
		changedStatusToCancelled.click();
	}
	
	public void clickOnApplyButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", applyButton);                      
	}
	
	                                                            // for verification is order status changed or not
		
	
	public void clickOn2ndPage() {
		page2SlidePagination.click();
	}
	public void clickOnChangedStatusToPending() {
		changedStatusToPending.click();
	}
	public void clickOn3rdPage() {
		page3SlidePagination.click();
	}
	public void clickOnChangedStatusToProcessing() {
		changedStatusToProcessing.click();
	}
	
	
	
}
