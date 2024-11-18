package testng_assignment_program;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Assg45 {

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
	@AfterClass
	public void test7()
	{
		System.out.println("@AfterClass execute");
		
	}

}
