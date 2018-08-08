package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LogIn;

public class LogInTest extends Browser{
  
	LogIn login;
	
	@Test(priority=0)
	public void wrongLogInAttempts() {
		driver.get("http://app.invoice-factory.source-code.rs");
		login = new LogIn(driver);
		assertTrue(login.isLogInPresent());
		login.inputCredentials("peraperic@gmail.com", "123456");
		login.submit();
		assertTrue(login.isWarningPresent());
	}
	
	@Test(priority=1)
	public void wrongLogInAttempts1() {
		driver.get("http://app.invoice-factory.source-code.rs");
		login = new LogIn(driver);
		assertTrue(login.isLogInPresent());
		login.inputCredentials("","");
		login.submit();
		assertTrue(login.isEmptyWarningPresent());
	}
	
	@Test(priority=2)
	public void wrongLogInAttempts2() {
		driver.get("http://app.invoice-factory.source-code.rs");
		login = new LogIn(driver);
		assertTrue(login.isLogInPresent());
		login.inputCredentials("vladavr3@gmail.com","123456");
		login.submit();
		assertTrue(login.isWarningPresent());
	}
	
	@Test(priority=3)
	public void wrongLogInAttempts3() {
		driver.get("http://app.invoice-factory.source-code.rs");
		login = new LogIn(driver);
		assertTrue(login.isLogInPresent());
		login.inputCredentials("peraperic@gmail.com","qwe123");
		login.submit();
		assertTrue(login.isWarningPresent());
	}
	
	@Test(priority=4)
	public void wrongLogInAttempts4() {
		driver.get("http://app.invoice-factory.source-code.rs");
		login = new LogIn(driver);
		assertTrue(login.isLogInPresent());
		login.inputCredentials("VLADAVR3@GMAIL.COM","QWE123");
		login.submit();
		assertTrue(login.isWarningPresent());
	}
	
	@Test(priority=5)
	public void wrongLogInAttempts5() {
		driver.get("http://app.invoice-factory.source-code.rs");
		login = new LogIn(driver);
		assertTrue(login.isLogInPresent());
		login.inputCredentials("vladavr3@gmail","qwe123");
		login.submit();
		assertTrue(login.invalidEmailText());
	}
	
	@Test(priority=6)
	public void wrongLogInAttempts6() {
		driver.get("http://app.invoice-factory.source-code.rs");
		login = new LogIn(driver);
		assertTrue(login.isLogInPresent());
		login.inputCredentials("vladavr3gmail.com","qwe123");
		login.submit();
		assertTrue(login.invalidEmailText());
	}
	
	@Test(priority=7)
	public void wrongLogInAttempts7() {
		driver.get("http://app.invoice-factory.source-code.rs");
		login = new LogIn(driver);
		assertTrue(login.isLogInPresent());
		login.inputCredentials("qwe","vladavr3@gmail.com");
		login.submit();
		assertTrue(login.invalidEmailText());
	}
	
	@Test(priority=8)
	public void wrongLogInAttempts8() {
		driver.get("http://app.invoice-factory.source-code.rs");
		login = new LogIn(driver);
		assertTrue(login.isLogInPresent());
		login.inputCredentials("vladavr3@gmail.com","01234567899876543210123");
		login.submit();
		assertTrue(login.tooManyCharsInPassword());
	}
	
	/*@Test(priority=9)
	public void wrongLogInAttempts9() {
		driver.get("http://app.invoice-factory.source-code.rs");
		login = new LogIn(driver);									//login prolazi
		assertTrue(login.isLogInPresent());
		login.inputCredentials("VLADAVR3@GMAIL.COM","qwe123");
		login.submit();
		
	}*/
	
	@Test(priority=10)
	public void wrongLogInAttempts10() {
		driver.get("http://app.invoice-factory.source-code.rs");
		login = new LogIn(driver);
		assertTrue(login.isLogInPresent());
		login.inputCredentials("vladavr3@gmail.com","QWE123");
		login.submit();
		assertTrue(login.isWarningPresent());
	}
	
	/*@Test(priority=11)
	public void wrongLogInAttempts11() {
		driver.get("http://app.invoice-factory.source-code.rs");
		login = new LogIn(driver);
		assertTrue(login.isLogInPresent());
		login.inputCredentials("peraperic@gmail.com","123456789");
		for (int i = 0; i < 40; i++) {
			login.submit();
		}
		assertTrue(login.tooManyAttemptsError());   //test radi ali poruka Too Many Attempts ponekad 
													  onemoguci korektan login i nastavak testa
	}*/
		
	@Test(priority=12)
		public void LogIn() {
			driver.get("http://app.invoice-factory.source-code.rs");
			login = new LogIn(driver);
			assertTrue(login.isLogInPresent());
			login.inputCredentials("vladavr3@gmail.com","qwe123");	
			login.submit();
		}
	
	
}
