package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPOM {
	private WebDriver driver; 
	
	public ForgotPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='sign-in']")
	private WebElement Login; 
	
	@FindBy(linkText ="Lost Your Password?")
	private WebElement Lost;
	
	@FindBy(className="lostpassword-button")
	private WebElement forgot;
	
	@FindBy(id="user_login")
	private WebElement email;
		
	@FindBy(xpath="//*[@id=\"lostpasswordform\"]/p[2]/input']")
	private WebElement login;
	
	@FindBy(xpath="/html/body/p/text()[1]")
	private WebElement Email1;
	
		
	
	//public void sendUserName(String userName) {
	//	this.userName.clear();
	//	this.userName.sendKeys(userName);
	//}
	
	/*public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}*/
	
	
	public void clickLoginBtn() {
		this.Login.click(); 
	}
	
	public void clickLost() {
		this.Lost.click(); 
	}
	
	public void clickforgot1() {
		this.forgot.click(); 
	}
	
	
	public void enteremail() {
		this.email.sendKeys("manzoor@gmail.com"); 
	}
	
		
	
		
	}
	
	
	
		
	

