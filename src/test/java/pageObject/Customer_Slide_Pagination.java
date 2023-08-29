package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer_Slide_Pagination extends BasePage{

	
	
	
	public  Customer_Slide_Pagination (WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Customers']")
	WebElement customerButton;
	
	@FindBy(xpath = "//button[@aria-label='Go to page 2']")
	WebElement secondSlidePage;
	
	@FindBy(xpath = "//button[@aria-label='Go to page 3']")
	WebElement thirdPage;
	
	@FindBy(xpath = "//button[@aria-label='Go to page 4']")
	WebElement fourthPage;
	
	@FindBy(xpath = "//button[@aria-label='Go to page 5']")
	WebElement fifthpage;
	
	@FindBy(xpath = "//button[@aria-label='Go to page 6']")
	WebElement sixthpage;
	
	@FindBy(xpath = "//button[@aria-label='Go to page 7']")
	WebElement seventhpage;
	
	public void clickCustomerButton() {
		customerButton.click();
	}
	
	public void clicksecondpage() {
		secondSlidePage.click();
	}
	public void clickthirdpage() {
		thirdPage.click();
	}
	
	public void clickfourthpage() {
		fourthPage.click();
	}
	
	public void clickfifthpage() {
		fifthpage.click();
	}
	public void clicksixthpage() {
		sixthpage.click();
	}
	 
	public void clickseventhpage() {
		seventhpage.click();
	}
}
