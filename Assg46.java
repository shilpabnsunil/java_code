package testng_assignment_program;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assg46 {
	@BeforeTest
	public void test3()
	{
		System.out.println("@BeforeTest execute");
		
	}
	@BeforeClass
	public void test4()
	{
		System.out.println("@BeforeClass execute");
		
	}
	@BeforeMethod
	public void test5()
	{
		System.out.println("@BeforeMethod execute");
		
	}
	@AfterMethod
	public void test6()
	{
		System.out.println("@AfterMethod execute");
		
	}
	@Test
	public void test1()
	{
		
		System.out.println("@test execute");
	}
	

}
