package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUser extends BasePage {

	
	public AddNewUser (WebDriver driver) {
		super(driver);
	}
	// click on setting icon button
	@FindBy (xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit MuiIconButton-sizeMedium css-1deacqj']")
	WebElement settingiconbtn;
	
	//click on Add new user button 
	@FindBy (xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1r2avgj']")
	WebElement addNewuserbutton;
	
	
	
	// Action method 
		public void settingButton () {
			settingiconbtn.click(); 
		}
		
		public void addNewUserButton () {
			addNewuserbutton.click();
		}
		
		
		
		
	
	
	
	
	

	
}
