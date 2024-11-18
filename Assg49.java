package testng_assignment_program;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assg49 {

	@BeforeMethod
	public void test1()
	{
	System.out.println("test1 execute");
	}

	@Test(priority=1)
	public void Logout()
	{
		System.out.println("Logout from amazon");
	}
	
	@Test(priority=2)
	public void Login()
	{
		System.out.println("Login from amazon");	
	}
	
	@AfterMethod
	public void Test2()
	{
		System.out.println("test2 execute");
	}
}
