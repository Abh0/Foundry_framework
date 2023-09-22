package testCases;

import java.io.IOException;
import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObject.Application_Sign_inPage;
import pageObject.Home_page;
import pageObject.Variant_Product_functionality;
import testBase.BaseClass;

public class TC_020_add_virtual_product  extends BaseClass{

	
	
	
	
	@Test(priority = 20)
	public void addVirtualProduct() throws InterruptedException, SocketException {
			
		
					Home_page hp = new Home_page(driver);
					hp.clickSignIn();

					Application_Sign_inPage sng7 = new Application_Sign_inPage(driver);
					sng7.enterEmailId(rb.getString("email"));
					sng7.enterPassword(rb.getString("password"));
					sng7.clickOnLoginbtn();
		
					
					Variant_Product_functionality vp = new Variant_Product_functionality(driver);
					vp.clickOnProductButtonLeftSide();
					vp.clickOnAddProductButton();
					
					vp.enterProductName(rb.getString("prductname"));
					vp.enterProductDescription(rb.getString("productdecription"));
					vp.clickOnAddImageButton();
					
					String autoItScriptPath = "C:\\Users\\101Reporters\\Documents\\AutoIt Scripts\\Autoit collection.exe";  // path of .exe file 
					String imagePath = "C:\\Users\\101Reporters\\Documents\\Nayaami dummy\\hl1.webp";  
					String command = "\"" + autoItScriptPath + "\" " + "  " + "\"" + imagePath + "\"";

					try {
					    Process process = Runtime.getRuntime().exec(command);
					   
					} catch (IOException e) {
					    e.printStackTrace();
					}

					Thread.sleep(5000);
					
					
					vp.selectVariantProductCheckbox();
					
					vp.clickOnAddAttributesButton();
					
					vp.enterVariantProductName(rb.getString("vproductname"));
					vp.enterVariantProductOptions1(rb.getString("vproductdesc"));
					
					//vp.clickOnAddMoreVariantButton();
				//	vp.enterVariantProductOptions2(rb.getString("vproductdesc2"));
					
					vp.clickOnGenerateVariantButton();
					vp.clickOnVariantAddDetails();
					vp.clickOnAddMoreimagesButton();
					
					String autoItScriptPath1 = "C:\\Users\\101Reporters\\Documents\\AutoIt Scripts\\Autoit collection.exe";  // path of .exe file 
					String imagePath1= "C:\\Users\\101Reporters\\Documents\\Nayaami dummy\\hl2.webp";  
					String command1 = "\"" + autoItScriptPath + "\" " + "  " + "\"" + imagePath + "\"";

					try {
					    Process process = Runtime.getRuntime().exec(command);
					   
					} catch (IOException e) {
					    e.printStackTrace();
					}

					Thread.sleep(5000);
					
					vp.enterRegularPrice(rb.getString("regularpr"));
					vp.enterSalePrice(rb.getString("salepr"));
					
					
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
				

					vp.clickOnFeatureButton();
					
					
					
					
					vp.enterFeature1(rb.getString("feature1"));
					Thread.sleep(5000);
					vp.clickOnInventoryButton();
					vp.enterProductSku(randomString());
					vp.enterProductStock(randomNumber());
					Thread.sleep(5000);
					
					WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10)); 
					vp.clickOnShippingButton();
					
					vp.enterProductweight(rb.getString("weight"));
					vp.enterProductLenght(rb.getString("lenght"));
					vp.enterProductWidth(rb.getString("width"));
					vp.enterProductheight(rb.getString("height"));
					
					vp.enterShippingRegion(rb.getString("region"));
					vp.enterProductMetaTitle(rb.getString("metaTitle"));
					vp.enterProductMetaDesc(rb.getString("metaDescription"));
					
					
					vp.clickOnPublishButton();
					Thread.sleep(5000);
					
			
			
			}
	
	
	
	
}
