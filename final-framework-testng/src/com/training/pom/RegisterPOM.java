package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM {
	private WebDriver driver; 
	
	public RegisterPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='sign-in']")
	private WebElement Login; 
	
	@FindBy(linkText="Register")
	private WebElement Register;
	
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
	
	
	public   void clickLoginBtn() {
		this.Login.click(); 
	}
	
	public void clickRegister() {
		this.Register.click(); 
	}
	
	public void enterEmail() {
		this.email.sendKeys("manzoor@gmail.com"); 
	}
	
	public void enterFname1() {
		this.first_name.sendKeys("manzoor"); 
	}
	
	public void enterLname() {
		this.last_name.sendKeys("mehadi"); 
	}
	
	public void clickRegisterbutton() {
		this.register_button.click();
	     
				 
	}
	
	
		
	
}
