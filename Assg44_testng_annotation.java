package testng_assignment_program;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assg44_testng_annotation {
	
	@Test
	public void test1()
	{
		
		System.out.println("@test execute");
	}
	
	@BeforeSuite
	public void test2()
	{
		System.out.println("@BeforeSuite execute");
		
	}
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
	@AfterClass
	public void test7()
	{
		System.out.println("@AfterClass execute");
		
	}
	@AfterTest
	public void test8()
	{
		
		System.out.println("@AfterTest execute");
	}
	@AfterSuite
	public void test9()
	{
		
		System.out.println("@AfterSuite execute");
	}
	
	

}
