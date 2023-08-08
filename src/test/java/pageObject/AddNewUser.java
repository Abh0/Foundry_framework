package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUser extends BasePage {

	
	public AddNewUser (WebDriver driver) {
		super(driver);
	}
	// click on setting icon button
	
	@FindBy (css = "svg[data-testid='SettingsOutlinedIcon']")

			WebElement settingiconbtn;
	
	//click on Add new user button 
	@FindBy (xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1r2avgj']")
         	WebElement addNewuserbutton;
	//enter username in add new user form 
	@FindBy (xpath = "//input[@placeholder='Enter User Name' and @type='text']")
			WebElement userName;
	
	//enter fullName in add new user form 
	@FindBy (xpath = "//input[@placeholder='Enter Full Name' and @type='text']")
			WebElement fullName;
	
	//enter email id in addd new user form
	@FindBy (xpath = "//input[@placeholder='Enter Email ID' and @type='text']")
			WebElement useremailID;
	
	//enter password
	@FindBy (xpath = "//input[@placeholder='Enter the Password']")
			WebElement userPassword;
	
	//click on Add new user submit button
	@FindBy (xpath = "//button[@type='submit']")
			WebElement addnewUserSubmitbtn;
	
	// Action method 
		public void settingButton () {
			settingiconbtn.click(); 
		}
		
		public void addNewUserButton () {
			addNewuserbutton.click();
		}
		public void enterUserName(String uname) {
			userName.sendKeys(uname);
		}
		public void enterFullName(String fname) {
			fullName.sendKeys(fname);
		}
		public void enterUserEmailId (String uemail) {
			useremailID.sendKeys(uemail);
		}
		public void enterPassword(String upwd) {
			userPassword.sendKeys(upwd);
		}
		
		public void clickSubmitbtn () {
			addnewUserSubmitbtn.click();
		}
		
		
		
		
		
		
	
	
	
	
	

	
}
