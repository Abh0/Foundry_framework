package pageObject;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Misc_Functionality extends BasePage {

	
	public Misc_Functionality(WebDriver driver) {

		super(driver);

	}
	
	//Element locators
	
	
	@FindBy(xpath = "//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-2h2pk4']")
	WebElement appLogo;
	
	@FindBy(tagName = "a")
	WebElement links;

	
	
	
	
	
	
	
	
	
	
	//Action method
	
	public void verifyLogo() {
		appLogo.click();
	}
	
	public void brokenLinks() {
		links.getSize();
		
	}
	
}
