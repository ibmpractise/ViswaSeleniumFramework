package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='sign-in']")
	private WebElement Login; 
	
	@FindBy(linkText="Register")
	private WebElement Register;
	
	@FindBy(id="user_login")
	private WebElement user_login;
	
	@FindBy(id="user_pass")
	private WebElement user_pass;
	
	@FindBy(name="login")
	private WebElement login1;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="first-name")
	private WebElement first_name;
	
	@FindBy(id="last-name")
	private WebElement last_name;
	
	@FindBy(className="register-button")
	private WebElement register_button;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
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
	
	
	public void enteruser_login() {
		this.user_login.sendKeys("admin");
	}
	
	public void enterPassword() {
		this.user_pass.sendKeys("admin@123");
	}
	public void clicklogin() {
		this.login1.click();
	}

	
		
	
}
