package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LogIn;
import pages.NewInvoice;

public class RandomTests extends Browser{
	LogIn login;
    NewInvoice invoice;
   
    @Test(priority=22)
    public void LogIn() {
		driver.get("http://app.invoice-factory.source-code.rs");
		login = new LogIn(driver);
		assertTrue(login.isLogInPresent());
		login.inputCredentials("vladavr3@gmail.com","qwe123");	
		login.submit(); 
	}
    
    @Test(priority=23)
    public void newInvoice() {
	 invoice = new NewInvoice(driver);
	 invoice.addInvoice();
	 assertTrue(invoice.saveButton());
	}
    
    @Test(priority=24)
    public void addInputs() {
	 invoice = new NewInvoice(driver);
	 invoice.addContent();
	}
    
    @Test(priority=25)
    public void save() {
	 invoice = new NewInvoice(driver); 
	 invoice.saveInvoice();
	}
    
    
    @Test(priority=26)
    public void verifyErrors() {
	 invoice = new NewInvoice(driver);
	 assertTrue(invoice.clientFieldError());
	 assertTrue(invoice.businessFieldError());
	 assertTrue(invoice.invNumberFieldError());
	 assertTrue(invoice.basisFieldError());
	 assertTrue(invoice.currencyFieldError());
	 assertTrue(invoice.bankFieldError());
	 assertTrue(invoice.noteFieldError());
	 assertTrue(invoice.serviceFieldError());
	}
 
 
 /*@Test(priority=24)
    public void selectClient() {
	 invoice = new NewInvoice(driver);
		invoice.selectClient();
	}
 
 @Test(priority=25)
    public void selectBusiness() {
	 invoice = new NewInvoice(driver);
	invoice.selectBusiness();
	}
 
 
 @Test(priority=26)
    public void chooseDate() {
	 invoice = new NewInvoice(driver);
		invoice.chooseDateSubmitted();
	}
 
 @Test(priority=27)
    public void chooseDateDue() {
	 invoice = new NewInvoice(driver);
	 invoice.chooseDateDue();
	}

 @Test(priority=28)
    public void selectBasis() {
	 invoice = new NewInvoice(driver);
	 invoice.basisData();
	}
 
 @Test(priority=29)
    public void chooseCurency() {
	 invoice = new NewInvoice(driver);
	 invoice.selectCurency();
	}
 @Test(priority=30)
    public void invoiceNumber() {
	 invoice = new NewInvoice(driver);
	 invoice.invoiceNumber();
	}
 
 @Test(priority=31)
    public void addInputs() {
	 invoice = new NewInvoice(driver);
	 invoice.addContent();
	}
 
 @Test(priority=32)
    public void sevice() {
	 invoice = new NewInvoice(driver);
	 invoice.serviceInput();
	
	}
 
 @Test(priority=33)
    public void note() {
	 invoice = new NewInvoice(driver);
	 invoice.noteInput();
	
	}
 
 @Test(priority=34)
    public void days() {
	 invoice = new NewInvoice(driver);
	 invoice.daysInput();
	}
 
 @Test(priority=35)
    public void hours() {
	 invoice = new NewInvoice(driver);
	
	}
 
 @Test(priority=36)
    public void rate() {
	 invoice = new NewInvoice(driver);
	 invoice.ratePerHour();
	}
 
 @Test(priority=37)
    public void amount() {
	 invoice = new NewInvoice(driver);
	 assertEquals(invoice.amountResult(), "80.00");
	}
 
 @Test(priority=38)
    public void discount() {
	 invoice = new NewInvoice(driver);
	 invoice.discountEntry();
	}
 
 @Test(priority=39)
    public void tax() {
	 invoice = new NewInvoice(driver);
	 invoice.taxEntry();
	}
 
 @Test(priority=40)
    public void sumTotal() {
	 invoice = new NewInvoice(driver);
	 assertEquals(invoice.totalSum(), "83.60");
	}
 

 @Test(priority=41)
    public void bank() {
	 invoice = new NewInvoice(driver);
	 invoice.selectBank();
	}
 
 @Test(priority=42)
    public void accountNmbr() {
	 invoice = new NewInvoice(driver);
	 assertEquals(invoice.account(), "Account number");
	}*/
 

	
}
