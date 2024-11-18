package testng_assignment_program;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assg50 {
	
	@BeforeMethod
	public void testbefore()
	{
		System.out.println("testbefore execute");
	}
	@Test(priority=1)
	public void Registration()
	{
		System.out.println("Registration to amazon");
	}
	
	@Test(priority=0)
	public void Login()
	{
		System.out.println("Login from amazon");
	}
	
	@AfterMethod
	public void testafter()
	{
		System.out.println("testafter execute");
	}
	
	@Test(priority=2)
	public void Logout()
	{
		System.out.println("Logout from amazon");
	}
	
	

}
