package testng_assignment_program;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assg48 {
	
	@BeforeMethod
	public void test5()
	{
		System.out.println("@BeforeMethod execute");
		
	}
	@Test
	public void test1()
	{
		
		System.out.println("@test execute");
	}
	@AfterMethod
	public void test6()
	{
		System.out.println("@AfterMethod execute");
		
	}

}
