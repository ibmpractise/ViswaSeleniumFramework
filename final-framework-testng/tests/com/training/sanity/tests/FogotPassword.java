package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ForgotPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

@Test
public class FogotPassword {
	private WebDriver driver;
	private String baseUrl;
	private ForgotPOM forgotPOM;
	private static Properties properties;
	private Assert passed;
	//private ScreenShot screenShot;
	//private Object Register;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		forgotPOM = new ForgotPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	public void validRegisterTest() {
		
		forgotPOM.clickLoginBtn();
		forgotPOM.clickLost();
		forgotPOM.enteremail();
		forgotPOM.clickforgot1();
		
		String actualText=driver.findElement(By.xpath("//p[contains(text(),'The email could not be sent.')]")).getText();
		System.out.println(actualText);
		String ExpectedText = "A confirmation link has been sent to your email address";
		Assert.assertEquals(ExpectedText, actualText);
		
		
		}		
		//loginPOM.sendUserName("admin");
		//loginPOM.sendPassword("admin@123");
		//loginPOM.clickLoginBtn(); 
		//screenShot.captureScreenShot("First");
	}

