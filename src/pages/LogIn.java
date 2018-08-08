package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogIn extends PageObjectModel{

	public LogIn(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id ="login-form-email") 
	WebElement logInField;		
					
	@FindBy(id ="login-pass") 
	WebElement passwordField;
	
	@FindBy(id ="login-form-btn") 
	WebElement loginButton;
	
	@FindBy(xpath ="//*[contains(text(),'Invalid credentials.')]") 
	WebElement invalidCredentialsText;
	
	@FindBy(xpath ="//*[contains(text(),'The email field must be a valid email.')]") 
	WebElement invalidEmailText;
	
	@FindBy(xpath ="//*[contains(text(),'The email field is required.')]") 
	WebElement emptyUsername;
	
	@FindBy(xpath ="//*[contains(text(),'Too Many attempts.')]") 
	WebElement tooManyAttemptsText;
	
	@FindBy(xpath ="//*[contains(text(),'The password field may not be greater than 20 characters.')]") 
	WebElement tooManyCharacters;
	
	@FindBy(id ="add-new-invoice") 
	WebElement addNewInvoice;
	
	
	  
	
	
	
	
	public void inputCredentials(String email, String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-form-email")));
		logInField.clear();
		logInField.sendKeys(email);
		
		passwordField.clear();
		passwordField.sendKeys(password);
	}
	
	public void submit() {
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
	}
	
	public boolean isLogInPresent() {
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		return loginButton.isDisplayed();
	}
	
	public boolean isWarningPresent() {
		wait.until(ExpectedConditions.visibilityOf(invalidCredentialsText));
	return	invalidCredentialsText.isDisplayed();
	}
	
	public boolean isEmptyWarningPresent() {
		wait.until(ExpectedConditions.visibilityOf(emptyUsername));
		return emptyUsername.isDisplayed();
	}
	
	public boolean tooManyAttemptsError() {
		wait.until(ExpectedConditions.visibilityOf(tooManyAttemptsText));
		return tooManyAttemptsText.isDisplayed();
	}
	
	public boolean tooManyCharsInPassword() {
		wait.until(ExpectedConditions.visibilityOf(tooManyCharacters));
		return tooManyCharacters.isDisplayed();
	}
	
	public boolean invalidEmailText() {
		wait.until(ExpectedConditions.visibilityOf(invalidEmailText));
		return invalidEmailText.isDisplayed();
	}
	

}
