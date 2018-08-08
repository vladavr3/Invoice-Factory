package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InvoicesList extends PageObjectModel{

	public InvoicesList(WebDriver driver) {
		super(driver);
	}

	@FindBy(id ="add-new-invoice") 
	WebElement addNewInvoice;
	
	@FindBy(css ="label[for='filter-client']") 
	WebElement clientDropdown;
	
	@FindBy(linkText ="Pamela Anderson") 
	WebElement client;
	
	@FindBy(id ="filter-from") 
	WebElement calendarFrom;
	
	@FindBy(id ="filter-to") 
	WebElement calendarTo;
	
	@FindBy(xpath ="//*[contains(text(),'2')]") 
	WebElement calendarFromDate;
	
	@FindBy(id ="filter-from-ok") 
	WebElement calendarFromOkButton;
	
	@FindBy(xpath ="//*[contains(text(),'22')]") 
	WebElement calendarToDate;
	
	@FindBy(id ="filter-to-ok") 
	WebElement calendarToOkButton;
	
	@FindBy(id ="inv-currency-2018-PAM5") 
	WebElement selectedInvoice;
	
	@FindBy(id ="context-337") 
	WebElement optionsButton;
	
	@FindBy(id ="context-copy-306") 
	WebElement duplicateButton;
	
	@FindBy(id ="context-edit-337") 
	WebElement editButton;
	
	@FindBy(id ="context-delete-306") 
	WebElement deleteButton;
	
	@FindBy(id ="context-preview-306") 
	WebElement previewButton;
	
	@FindBy(id ="inv-form-cancel-btn") 
	WebElement cancelButton;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[8]/div/div/nav/div/div[1]") 
	WebElement previewText;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[6]/div/div/div[2]/div/div/div[1]/div/div[1]/div/i") 
	WebElement closeButton;
	
	@FindBy(id ="context-download-dialog-yes-306") 
	WebElement popUpYesButton;
	
	@FindBy(id ="filter-period") 
	WebElement filterPeriodButton; 
	
	@FindBy(id ="this-month") 
	WebElement thisMonthButton; 
	
	@FindBy(id ="reset-dates") 
	WebElement resetDatesButton; 
	
	Actions actions;
	
	public boolean isAddNewInvoicePresent() {
		wait.until(ExpectedConditions.visibilityOf(addNewInvoice));
		return addNewInvoice.isDisplayed();
	}
	
	public void clientListClick() {
		actions = new Actions(driver);
		wait.until(ExpectedConditions.elementToBeClickable(clientDropdown));
		clientDropdown.click();
	}
	
	public void clientListChoose() {
		actions = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOfAllElements(client));
		client.click();
	}
	
	public void chooseFromDate() {
		actions = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(calendarFrom));
		calendarFrom.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'2')]")));
		calendarFromDate.click();
		wait.until(ExpectedConditions.elementToBeClickable(calendarFromOkButton));
		actions.moveToElement(calendarFromOkButton).click().build().perform();
	}
	
	public void chooseToDate() {
		actions = new Actions(driver);
		calendarTo.click();
		wait.until(ExpectedConditions.elementToBeClickable(calendarToDate));
		calendarToDate.click();
		wait.until(ExpectedConditions.elementToBeClickable(calendarToOkButton));
		actions.moveToElement(calendarToOkButton).click().build().perform();
	}
	
	public String isInvoicePresent() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inv-currency-2018-PAM5")));
		return selectedInvoice.getText();
	}
	
	public void duplicateOption() {
		optionsButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(duplicateButton));
		duplicateButton.click();
	}
	
	public String isDuplicateSelected() {
		wait.until(ExpectedConditions.visibilityOf(selectedInvoice));
		return selectedInvoice.getText();
	}
	
	public void editOption() {
		wait.until(ExpectedConditions.visibilityOf(optionsButton));
		optionsButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(editButton));
		editButton.click();
	}
	
	public boolean isCancelDisplayed() {
		return cancelButton.isDisplayed();
	}
	
	public void previewOption() {
		optionsButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(previewButton));
		previewButton.click();
	}
	
	public String previewInvoice() {
		return previewText.getText();
	}
	public void closePreviewPage() {
		closeButton.click();
	}
	
	public void deleteOption() {
		optionsButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
		deleteButton.click();
	}
	public void confirmPopUp() {
		driver.switchTo().alert().accept();
	}
	
	public boolean popUpisdisplayed() {
		return popUpYesButton.isDisplayed();
	}
	
	public void thisMonth() {
		filterPeriodButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(thisMonthButton));
		thisMonthButton.click();
	}
	
	public void resetCalendars() {
		filterPeriodButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(resetDatesButton));
		resetDatesButton.click();
	}
	
	public boolean isCalendarEmpty() {
	return calendarFrom.getText().isEmpty();
	}
	
	
	
}
