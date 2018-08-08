package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BusinessTab extends PageObjectModel{

	public BusinessTab(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id ="nav-bar-business") 
	WebElement businessTab;
	
	@FindBy(id ="add-new-business") 
	WebElement addNewbusiness;
	
	@FindBy(id ="expand-business-details") 
	WebElement expandDetails;
	
	@FindBy(id ="business-form-add-bank-btn") 
	WebElement addBankAccount;
	
	@FindBy(id ="business-form-name") 
	WebElement addBusinessName;
	
	@FindBy(id ="business-form-country") 
	WebElement addCountryMenu;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[3]/div/div/div[2]/a/div/div") 
	WebElement selectCountry;
	
	@FindBy(id ="business-form-city") 
	WebElement addCity;
	
	@FindBy(id ="business-form-street") 
	WebElement addStreet;
	
	@FindBy(id ="business-form-zip") 
	WebElement addZip;
	
	@FindBy(id ="business-form-reg-num") 
	WebElement addRegNumber;
	
	@FindBy(id ="bank-dialog-name") 
	WebElement bankName;
	
	@FindBy(id ="bank-dialog-num") 
	WebElement accountNumber;
	
	@FindBy(id ="bank-dialog-swf-num") 
	WebElement swiftNumber;
	
	@FindBy(id ="bank-dialog-pay-inst") 
	WebElement payInstructions;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[2]/div/div/div/div/form/div[5]/div/div[2]/div[1]/div/div/div/div[1]") 
	WebElement currency;
	
	@FindBy(linkText ="Dinar") 
	WebElement currencySelect;
	
	@FindBy(id ="bank-dialog-cancel") 
	WebElement cancelButton;
	
	@FindBy(id ="bank-dialog-add-bank") 
	WebElement confirmBankAdding;
	
	@FindBy(id ="bank-list-bank-name") 
	WebElement addedBank;
	
	/*@FindBy(className ="v-expansion-panel__header") 
	List<WebElement> bankList;*/
	
	
	Actions actions;
	
	public void switchToBusiness() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		businessTab.click();
	}
	
	public boolean IsAddButtonPresent() {
		wait.until(ExpectedConditions.visibilityOf(addNewbusiness));
		return addNewbusiness.isDisplayed();
	}
	
	public void addNewBusinessButton() {
		wait.until(ExpectedConditions.elementToBeClickable(addNewbusiness));
		addNewbusiness.click();
	}
	
	public boolean isAddNewBankPresent() {
		wait.until(ExpectedConditions.visibilityOf(addBankAccount));
		return addBankAccount.isDisplayed();
	}
	
	public void addBusinessName() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("business-form-name")));
		addBusinessName.sendKeys("Bootcamp");
	}
	
	public void selectCountry() {
		addCountryMenu.click();
		wait.until(ExpectedConditions.visibilityOf(addCountryMenu));
		addCountryMenu.sendKeys("ser");
		wait.until(ExpectedConditions.visibilityOf(selectCountry));
		selectCountry.click();
		
	}
	
	public void city() {
		wait.until(ExpectedConditions.visibilityOf(addCity));
		addCity.sendKeys("Belgrade");
	}
	
	public void street() {
		wait.until(ExpectedConditions.visibilityOf(addStreet));
		addStreet.sendKeys("K.Milosa");
	}
	
	public void zip() {
		wait.until(ExpectedConditions.visibilityOf(addZip));
		addZip.sendKeys("11000");
	}
	
	public void regNumber() {
		wait.until(ExpectedConditions.visibilityOf(addRegNumber));
		addRegNumber.sendKeys("123456");
	}
	
	public void bankAccount() {
		addBankAccount.click();
	}
	
	public boolean isCancelPresent() {
		wait.until(ExpectedConditions.visibilityOf(cancelButton));
		return cancelButton.isDisplayed();
	}
	
	public void bank() {
		bankName.sendKeys("Komercijalna banka");
	}
	
	public void account() {
		accountNumber.sendKeys("123456789-00");
	}

	public void swift() {
		swiftNumber.sendKeys("654321");
	}

	public void payment() {
		payInstructions.sendKeys("Cash");
	}
	
	public void selectCurency() {
		currency.click();
		wait.until(ExpectedConditions.elementToBeClickable(currencySelect));
		currencySelect.click();
	}
	
	public void addingBank() {
		wait.until(ExpectedConditions.elementToBeClickable(confirmBankAdding));
		confirmBankAdding.click();
	}
	
	/*public boolean isBankListPopulated() {
		wait.until(ExpectedConditions.visibilityOfAllElements(bankList));
		for (int i = 0; i < bankList.size(); i++) {
			if (bankList.isEmpty()) {
				return false;
			} 
		}
				return true;
	}*/
	
	public String isBankListPopulated() {
		wait.until(ExpectedConditions.visibilityOf(addedBank));
		return addedBank.getText();
	}
	
	
	
	
}
	
