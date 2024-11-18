package testng_assignment_program;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assg51 {

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod execute");
	}
	
	@Test(enabled=false)
	public void testcase1()
	{
		System.out.println("testcase1 execute");
	}
	
	@Test(invocationCount=5)
	public void testcase2()
	{
		System.out.println("testcase2 execute");
	}
	
}
