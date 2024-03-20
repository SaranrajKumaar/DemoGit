package Basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pirority {
	
	@AfterMethod
	public void afmethod() {
		System.out.println("After method");
	}
	@Test

	public void webcarLoan() {
		System.out.println("Web car Loan");
	}
	@Test
	public void mobilecarLoan() {
		System.out.println("Mobile Car Loan");
	}
	
	@Test(groups = ("Smoke"))
	public void APICarLoan() {
		System.out.println("APICarLoan");
		
	}
	@BeforeMethod
	public void befMethod() {
		System.out.println("before methods");
	}
	
	
	
}
