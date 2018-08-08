package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.BusinessTab;
import pages.LogIn;

public class BusinessTest extends Browser{
  
	BusinessTab business;
	LogIn login;
	
	
	
	 @Test(priority=50)
	    public void businessTabSwitch() {
		 business = new BusinessTab(driver);
		 business.switchToBusiness();
		}
	 
	 
	 @Test(priority=51)
	    public void addBusiness() {
		 business = new BusinessTab(driver);
		 assertTrue(business.IsAddButtonPresent());
		 business.addNewBusinessButton();
		 assertTrue(business.isAddNewBankPresent());
		}
	 
	 @Test(priority=52)
	    public void bussinesNameField() {
		 business = new BusinessTab(driver);
		 business.addBusinessName();
		}
	 
	 @Test(priority=53)
	    public void countrySelection() {
		 business = new BusinessTab(driver);
		 business.selectCountry();
		}
	 
	 @Test(priority=54)
	    public void cityInput() {
		 business = new BusinessTab(driver);
		 business.city();
		}
	 @Test(priority=55)
	    public void streetInput() {
		 business = new BusinessTab(driver);
		 business.street();
		}
	 
	 @Test(priority=56)
	    public void zipInput() {
		 business = new BusinessTab(driver);
		 business.zip();
		}
	 
	 @Test(priority=57)
	    public void regNumberInput() {
		 business = new BusinessTab(driver);
		 business.regNumber();
		}
	 
	 @Test(priority=58)
	    public void addBank() {
		 business = new BusinessTab(driver);
		 business.bankAccount();
		 assertTrue(business.isCancelPresent());
		}
	 
	 @Test(priority=59)
	    public void bankName() {
		 business = new BusinessTab(driver);
		 business.bank();
		}
	 
	 @Test(priority=60)
	    public void accountInput() {
		 business = new BusinessTab(driver);
		 business.account();
		}
	 
	 @Test(priority=61)
	    public void swiftInput() {
		 business = new BusinessTab(driver);
		 business.swift();
		}
	 
	 @Test(priority=62)
	    public void paymentInstrcInput() {
		 business = new BusinessTab(driver);
		 business.payment();
		}
	 
	 @Test(priority=63)
	    public void chooseCurrency() {
		 business = new BusinessTab(driver);
		 business.selectCurency();
		}
	 
	 @Test(priority=64)
	    public void confirmAddingBank() {
		 business = new BusinessTab(driver);
		 business.addingBank();
		}
	 
	 @Test(priority=65)
	    public void bankList() {
		 business = new BusinessTab(driver);
		 String bank = "Komercijalna banka";
		 assertEquals(business.isBankListPopulated(), bank);
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

