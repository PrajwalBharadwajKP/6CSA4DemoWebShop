package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="FirstName")
	private WebElement firstname;
	@FindBy(id="LastName")
	private WebElement lastname;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(id="Password")
	private WebElement password;
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPassword;
	@FindBy(id="register-button")
	private WebElement registerBTN;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	public WebElement getRegisterBTN() {
		return registerBTN;
	}
}