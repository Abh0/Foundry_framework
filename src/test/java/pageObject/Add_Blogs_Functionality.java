package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Add_Blogs_Functionality extends BasePage {

	public Add_Blogs_Functionality(WebDriver driver) {

		super(driver);

	}
	
	//Element Locators
	 //blog button left side bar
	@FindBy(xpath = "//span[normalize-space()='Blogs']")
	WebElement blogButtonLeftSide;
	
	
	// add new  blog button 
	@FindBy (xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-63ug8l']")
	WebElement addBlogButton;
	
	// Enter title of blogs
	@FindBy(xpath = "//input[@placeholder='Title (eg:  Blog about the benefits of Sanitary pads)']")
	WebElement titleOfBlog ;
	
	//enter description of blogs
	@FindBy (xpath = "//textarea[@placeholder='Write the description here ...']")
	WebElement descriptionOfBlog ;
	
	
	//enter write here details text
	@FindBy (xpath =  "//div[@class='ql-editor ql-blank']")
	WebElement writeHere ;
	
	//click on Add Image Button
	@FindBy(xpath = "//label[@for='blogImage']")
	WebElement addImageButton;
	
	//enter Author name
	@FindBy (xpath = "//input[@placeholder='Author']")
	WebElement authorName;
	
	//enter tags here
	@FindBy (xpath = "//input[@placeholder='Eg:  Fashion, Health']")
	WebElement tags;
	
	//enter 
	@FindBy (xpath = "//textarea[@placeholder='Add a summary of the post to appear on your home page or blog.']")
	WebElement excerpts;
	
	// click on SAVE button
	@FindBy (xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-nb1bkz']")
	WebElement saveButton;
	
	//click on pagination number
	@FindBy(xpath = "//button[@aria-label='Go to page 2']")
	WebElement slidePagination;
	
	@FindBy(xpath = "//tbody/tr[2]/td[1]/span[1]/input[1]")
	WebElement blogCheckbox;
	
	//click on Bulk Action
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1sdumzy']")
	WebElement bulkActionButton;
	
	@FindBy(xpath = "//span[contains(text(),'Delete selected blogs')]")
	WebElement deleteselectedblogButton;
	
	//click on Apply button
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1j20ih4']")
	WebElement applyButton;
	
	//click on Yes, Delete Button
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-8rpmbq']") 
	WebElement yesDeleteButton;
	
	
	//click on Trashed button
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-1cmtcva']")
	WebElement trashedButton;
	
	//click on published selected blogs
	@FindBy(xpath = "//body/div[@id='simple-popover']/div[3]/ul[1]/div[2]")
	WebElement publishedSelectedBlogs;
	
	//click on yes, published button
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-fec3a5']")
	WebElement  yesPublishedButton;
	
	//click on any blog for edit
	@FindBy(xpath = "//tbody/tr[2]/td[3]")
	WebElement openAnyBlog ;
	
	//Action Methods
	 public void clickOnBlogButtonLeftSide () {
	blogButtonLeftSide.click();
	 }
	public void clickOnAddBlogButton () {
		addBlogButton.click();
	}
	public void enterTitleOfBlog (String title) {
		titleOfBlog.sendKeys(title);
	}
	
	
	//clear blog description 
	public void clearBlogDescription() {
		
		 Actions actions = new Actions(driver);
         actions.click(descriptionOfBlog).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		
	}
	
	public void enterDescriptionOfBlog (String desc) {
		descriptionOfBlog.sendKeys(desc);
		
	}
	
	
	public void enterWriteHere (String wh) {
		writeHere.sendKeys(wh);
	}
	
	public void clickOnAddImageButton() {
		addImageButton.click();
	}
	public void enterAuthorName (String aname) {
	authorName.sendKeys(aname);
	}
	
	public void enterTags (String ta) {
		tags.sendKeys(ta);
	}
	public void enterExcerpts (String ex) {
		excerpts.sendKeys(ex);
	}
	 
	public void clickOnSaveButton () {
		 Actions actions = new Actions(driver);
         actions.moveToElement(saveButton).click().perform();
         }
	
	
	public void clickOnSlidePagination() {
		slidePagination.click();
	}
	
	public void selectCheckbox () {
		blogCheckbox.click();
	}
	public void clickOnBulkAction() {
		bulkActionButton.click();
	}
	
	public void clickOnDeleteselectedblogButton() {
		deleteselectedblogButton.click();
	}
	
	public void clickOnApplyButton() {
		applyButton.click();
	}
	public void clickYesDeleteButton () {
		yesDeleteButton.click();
	}
	
	public void clickOnTrashedButton () {
		trashedButton.click();
		trashedButton.sendKeys(Keys.F5);
	}
	public void clickOnPublishedSelectedBlogs () {
		publishedSelectedBlogs.click();
	}
	
	public void clickOnYesPublishedButton () {
		yesPublishedButton.click();
	}
	public void clickOnAnyBlog ( ) {
		openAnyBlog.click();
	}
}
