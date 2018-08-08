package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewInvoice extends PageObjectModel{

	public NewInvoice(WebDriver driver) {
		super(driver);
	}
	
	Actions action;
	
	@FindBy(id ="add-new-invoice") 
	WebElement addNewInvoice;
	
	@FindBy(xpath ="//*[contains(text(),'save')]") 
	WebElement saveButton;
	
	@FindBy(id ="click-to-enter") 
	WebElement clickTitle;
	
	@FindBy(id ="invoice-title-content") 
	WebElement enterTitle;
	
	@FindBy(id ="inv-form-status") 
	WebElement selectStatus;
	
	@FindBy(linkText ="Draft") 
	WebElement statusDraft;
	
	@FindBy(css ="label[for='inv-form-client']") 
	WebElement selectTo;
	
	@FindBy(name ="business") 
	WebElement selectFrom;
	
	@FindBy(linkText = "Pamela Anderson") 
	WebElement client;
	
	@FindBy(linkText = "Drina Commerce") 
	WebElement business;
	
	@FindBy(id = "inv-form-number") 
	WebElement addInvoiceNumber;
	
	@FindBy(id = "inv-form-date-submitted") 
	WebElement dateSubmittedButton;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[5]/button/div") 
	WebElement selectDateSubmitted;
	
	@FindBy(id = "inv-form-date-ok-submitted")
	WebElement dateSubmittedOkButton;
	
	@FindBy(id = "inv-form-date-duedate") 
	WebElement dateDueButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/table/tbody/tr[3]/td[7]/button/div") 
	WebElement selectDateDue;
	
	@FindBy(id = "inv-form-date-ok-duedate") 
	WebElement dateDueOkButton;
	
	@FindBy(id = "inv-form-basis") 
	WebElement selectBasis;
	
	@FindBy(className = "v-select__slot") 
	List<WebElement> dropdownList;	// lista za izbor valute i banke
	
	@FindBy(xpath ="//*[contains(text(),'Euro')]") 
	WebElement euro;
	
	@FindBy(xpath ="//*[contains(text(),'Dinar')]") 
	WebElement dinar;
	
	@FindBy(id ="add-content-btn") 
	WebElement addButton;
	
	@FindBy(id ="inv-form-service-0") 
	WebElement serviceField;
	
	@FindBy(id ="inv-form-note-0") 
	WebElement noteField;
	
	@FindBy(id ="inv-form-days-0") 
	WebElement daysField;
	
	@FindBy(id ="inv-form-hours-0") 
	WebElement hoursField;
	
	@FindBy(id ="inv-form-rate-0") 
	WebElement ratePerHour;
	
	@FindBy(id ="inv-form-subtotal") 
	WebElement subTotal;
	
	@FindBy(id ="context-delete-inv-content-delete-0") 
	WebElement deleteButton;
	
	@FindBy(id ="inv-form-discount") 
	WebElement discountField;
	
	@FindBy(id ="inv-form-tax") 
	WebElement taxField;
	
	@FindBy(id ="inv-form-total") 
	WebElement totalSumField;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[5]/div/div/div/a/div") 
	WebElement selectBank;
	
	@FindBy(id ="inv-form-acc-num-title") 
	WebElement accountNumber;
	
	@FindBy(xpath = "//*[contains(text(),'The invoice number has already been taken.')]") 
	WebElement doubleInvNumError;
	
	@FindBy(className = "v-text-field__details") 
	List<WebElement> errorList;
	
	@FindBy(id ="inv-form-back-btn") 
	WebElement backButton;
	
	@FindBy(xpath ="//*[contains(text(),'There are no invoices!')]")
	WebElement noInvoicesText;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[3]/div/div/div[2]/button[2]/div") 
	WebElement yesButton;
	
	Actions actions;
	
	public boolean clientFieldError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(errorList));
		return errorList.get(1).isDisplayed();
	}
	
	public boolean businessFieldError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(errorList));
		return errorList.get(2).isDisplayed();
	}
	
	public boolean invNumberFieldError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(errorList));
		return errorList.get(3).isDisplayed();
	}
	
	public boolean basisFieldError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(errorList));
		return errorList.get(6).isDisplayed();
	}
	
	public boolean currencyFieldError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(errorList));
		return errorList.get(7).isDisplayed();
	}
	
	public boolean bankFieldError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(errorList));
		return errorList.get(11).isDisplayed();
	}
	
	public boolean noteFieldError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(errorList));
		return errorList.get(9).isDisplayed();
	}
	
	public boolean serviceFieldError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(errorList));
		return errorList.get(8).isDisplayed();
	}
	
	//**************************************
	
	public void addInvoice() {
		wait.until(ExpectedConditions.elementToBeClickable(addNewInvoice));
		addNewInvoice.click();
	}
	
	public boolean saveButton() {
		wait.until(ExpectedConditions.visibilityOf(saveButton));
		return saveButton.isDisplayed();
	}
	
	public void enterTitle() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("click-to-enter")));
		clickTitle.click();
		enterTitle.sendKeys("Test Invoice");
	}
	
	public void selectStatus() {
		action = new Actions(driver);
		action.moveToElement(selectStatus).click().build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(statusDraft));
		action.moveToElement(statusDraft).click().build().perform();
	}
	
	public void selectClient() {
		action = new Actions(driver);
		action.moveToElement(selectTo).click().build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(client));
		action.moveToElement(client).click().build().perform();
	}
	
	public void selectBusiness() {
		action = new Actions(driver);
		wait.until(ExpectedConditions.elementToBeClickable(selectFrom));
		action.moveToElement(selectFrom).click().build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(business));
		action.moveToElement(business).click().build().perform();
	}
	
	public void invoiceNumber() {
		addInvoiceNumber.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		wait.until(ExpectedConditions.textToBePresentInElement(addInvoiceNumber, ""));
		addInvoiceNumber.sendKeys("002");
	}
	
	public void chooseDateSubmitted() {
		actions = new Actions(driver);
		dateSubmittedButton.click();
		/*wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[5]/button/div")));
		selectDateSubmitted.click();*/
		wait.until(ExpectedConditions.elementToBeClickable(dateSubmittedOkButton));
		dateSubmittedOkButton.click();
		//actions.moveToElement(dateSubmittedOkButton).click().build().perform();
	}
	
	public void chooseDateDue() {
		actions = new Actions(driver);
		dateDueButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(selectDateDue));
		selectDateDue.click();
		wait.until(ExpectedConditions.elementToBeClickable(dateDueOkButton));
		actions.moveToElement(dateDueOkButton).click().build().perform();
	}
	
	public void basisData() {
		selectBasis.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("inv-form-basis")));
		selectBasis.sendKeys("goods");
	}
	
	public void selectCurency() {
		dropdownList.get(3).click();
		wait.until(ExpectedConditions.visibilityOf(euro));
		euro.click();
	}
	
	// *************************** 
	
	public void addContent() {
		addButton.click();
	}
	
	public void serviceInput() {
		wait.until(ExpectedConditions.visibilityOf(serviceField));
		serviceField.sendKeys("Cleaning");
	}
	
	public void noteInput() {
		noteField.sendKeys("good job");
	}
	
	public void daysInput() {
		daysField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		daysField.sendKeys("1");
	}
	
	/*public void hoursInput() {
		hoursField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		hoursField.sendKeys("8"); popunjava se automatski, iskljuceno zbog verifikacije ukupne sume jer se verifikuje preko stringa
	}*/
	
	public void ratePerHour() {
		ratePerHour.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		ratePerHour.sendKeys("10");
	}

	public String amountResult() {
		wait.until(ExpectedConditions.visibilityOf(subTotal));
		return subTotal.getText();
	}
	
	public void discountEntry() {
		discountField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		discountField.sendKeys("5");
	}
	
	public void taxEntry() {
		taxField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		taxField.sendKeys("10");
	}
	
	public String totalSum() {
		wait.until(ExpectedConditions.visibilityOf(totalSumField));
		return totalSumField.getText();
	}
	
	public void selectBank() {
		dropdownList.get(4).click();
		wait.until(ExpectedConditions.visibilityOf(selectBank));
		selectBank.click();
	}

	public void saveInvoice() {
		wait.until(ExpectedConditions.visibilityOf(saveButton));
		saveButton.click();
	}
	
	public String account() {
		wait.until(ExpectedConditions.visibilityOf(accountNumber));
		return accountNumber.getText();
	}
	
	public boolean errorDoubleInvNumber() {
		wait.until(ExpectedConditions.alertIsPresent());
		return doubleInvNumError.isDisplayed();
	}
	
	public void dropChanges() {
		backButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(yesButton));
		yesButton.click();
	}
	
	public boolean noInvoicesCheck() {
		return noInvoicesText.isDisplayed();
	}
	

}