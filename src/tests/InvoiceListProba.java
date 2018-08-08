package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.InvoicesList;
import pages.LogIn;

public class InvoiceListProba extends Browser{
 
		InvoicesList invoices;
		LogIn login;
	
	@Test(priority=12)
	public void LogIn() {
	driver.get("http://app.invoice-factory.source-code.rs");
	login = new LogIn(driver);
	assertTrue(login.isLogInPresent());
	login.inputCredentials("vladavr3@gmail.com","qwe123");	
	}

	@Test(priority=13)
	public void verifyPage() {
		invoices = new InvoicesList(driver);
		assertTrue(invoices.isAddNewInvoicePresent());
		
	}
	@Test(priority=14)
	public void clientDropDownMenu() {
		invoices = new InvoicesList(driver);
		invoices.clientListClick();
		invoices.clientListChoose();
	}
	
	@Test(priority=15)
	public void datesSelection() {
		invoices = new InvoicesList(driver);
		invoices.chooseFromDate();
		invoices.chooseToDate();
		assertEquals(invoices.isInvoicePresent(), "EUR");
	}
	
	@Test(priority=16)
	public void duplicateInvoice() {
		invoices = new InvoicesList(driver);
		invoices.duplicateOption();
		assertEquals(invoices.isDuplicateSelected(), "EUR");
	}
	
	@Test(priority=17)
	public void editInvoice() {
		invoices = new InvoicesList(driver);
		invoices.editOption();
		assertTrue(invoices.isCancelDisplayed());
	}
	
	@Test(priority=18)
	public void previewInvoice() {
		invoices = new InvoicesList(driver);
		invoices.previewOption();
		assertTrue(invoices.isCancelDisplayed());
		invoices.closePreviewPage();
		
	}
	
	@Test(priority=19)
	public void deleteInvoice() {
		invoices = new InvoicesList(driver);
		invoices.deleteOption();
		assertTrue(invoices.popUpisdisplayed());
		invoices.confirmPopUp();
		assertEquals(invoices.isDuplicateSelected(), "EUR");
	}
	
	@Test(priority=20)
	public void thisMonthOption() {
		invoices = new InvoicesList(driver);
		invoices.thisMonth();
	}
	
	@Test(priority=21)
	public void resetCalendarsOption() {
		invoices = new InvoicesList(driver);
		invoices.resetCalendars();
		assertTrue(invoices.isCalendarEmpty());
	}
	
}
