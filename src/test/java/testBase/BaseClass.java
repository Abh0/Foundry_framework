package testBase;

import java.awt.Color;
import java.awt.BasicStroke;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class BaseClass {

	public static WebDriver driver;
	public Logger logger;
	public ResourceBundle rb;

	@BeforeClass
	@Parameters("browser")
	public void setup(String br) throws InterruptedException {

		rb = ResourceBundle.getBundle("config"); // reading data from properties file
		logger = LogManager.getLogger(this.getClass());

		// if else {} condition for execute script on multiple browser
		
		if (br.equalsIgnoreCase("chrome")) {
			logger.info("...Launching Chrome browser...");

			/*
			 * below chromeoptions is for to avoid the line while running chrome browser the
			 * line is like "Chrome is being controlled by automated test software"
			 */

			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--disable-save-password-bubble");
			 options.addArguments("--disable-notifications");
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			driver = new ChromeDriver(options);
					
		} else if (br.equalsIgnoreCase("firefox")) {
			logger.info("...Launching Firefox browser...");
			driver = new FirefoxDriver();

		} else if (br.equalsIgnoreCase("edge")) {
			logger.info("...Launching E browser...");
			EdgeOptions options = new EdgeOptions();

			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

			driver = new EdgeDriver();
		}
		
			
			
		

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.get(rb.getString("appURL")); // hard coded the url
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	   

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	// for dynamically generated the random email id
	public String randomString() {

		String generatedString = RandomStringUtils.randomAlphabetic(7);
		return generatedString;
	}

	// for dynamically generate the random number
	public String randomNumber() {

		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}

	// for dynamically generated the character+number
	public String randomAlphaNumeric() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		String generatedNumber = RandomStringUtils.randomNumeric(5);
		return (generatedString + generatedNumber);

	}
	
	
	
	
	// capture screenshot method if test case failed 
	
	public String captureScreen(String tname) throws IOException {

		/*
		 * Date dt = new Date(); SimpleDateFormat sp = new
		 * SimpleDateFormat("yyyyMMddhhmmss"); String timeStamp = sp.format(dt); below
		 * one line and this 3 line are same meaning
		 */

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshot\\" + tname + "_" + timeStamp + ".png";

		try {

			FileUtils.copyFile(source, new File(destination));
			drawRedBox(destination);

		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
	}
	
	
	// block of code for to draw redline where webpage show error
	
	public void drawRedBox(String imagePath) throws IOException {
		File imageFile = new File(imagePath);
		BufferedImage image = ImageIO.read(imageFile);
		Graphics2D g2d = image.createGraphics();

		// You can adjust these values based on your requirement
		int boxX = 500; // X-coordinate of the top-left corner of the red box
		int boxY = 250; // Y-coordinate of the top-left corner of the red box
		int boxWidth = 700; // Width of the red box
		int boxHeight = 500; // Height of the red box

		// Set the stroke color and thickness
		g2d.setColor(Color.RED);
		g2d.setStroke(new BasicStroke(3));

		// Draw the rectangle
		g2d.drawRect(boxX, boxY, boxWidth, boxHeight);

		// Dispose of the graphics context
		g2d.dispose();

		// Write the modified image back to the same file
		ImageIO.write(image, "png", imageFile);

	}	 
	
	 
	 
	 
	 
	 
	 
	 
	
	
	
//This block of code for to resolve the java.net.exception 
	
//	public void main(String[] args)  throws SocketException{
//		try {
//			ChromeOptions options = new ChromeOptions();
//
//			WebDriver driver = new ChromeDriver(options);
//
//			driver.quit();
//	        }
//		catch (Exception se) {
//		
//	            System.out.println("SocketException occurred: " + se.getMessage());
//	         
//	            int maxRetries = 3;
//	            int retryCount = 0;
//	            boolean success = false;
//	            
//	            while (retryCount < maxRetries && !success) {
//	                try {
//	                    ChromeOptions options = new ChromeOptions();
//	                    
//	                    // Add Chrome options and configurations as needed
//	                    
//	                    WebDriver driver = new ChromeDriver(options);
//	                    
//	                    // Perform your Selenium actions using the WebDriver
//	                    
//	                    driver.quit(); // Close the browser when done
//	                    
//	                    success = true; // Mark the action as successful
//	                } catch (Exception seRetry) {
//	                    // Handle the SocketException for retry
//	                    System.out.println("SocketException on retry attempt " + (retryCount + 1));
//	                    System.out.println("Retrying...");
//	                    retryCount++;
//	                }
//	            }
//	            
//	            if (!success) {
//	                // If all retries failed, you might throw an exception or take other actions
//	                System.out.println("All retry attempts failed. Handle as needed.");
//	            }
//	        }
//	    }
	}


	
	
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


