package assertion_java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass1 {

	
	//How to pass testcase and how to fail test case 
	@Test(priority=0)
	public void testcase1()
	{
		Assert.assertTrue(true);//mentioning true test case is passed
	}
	
	@Test(priority=1)
	public void testcase2()
	{
		Assert.assertTrue(false);//mentioning false means purposefully fail test case
	}
	
	@Test(priority=2)
	public void testcase3()
	{
		Assert.assertFalse(false);//assert expected is false and found to be false means test case is pass
		
	}
	
	@Test(priority=3)
	public void testcase4()
	{
		Assert.assertFalse(true);//assert expected is false and found to be true means test case will be fail
		
	}
	
	@Test(priority=4)
	public void testcase5()
	{
		
		//expected behaviours should be always hand written
		//actual sould come from pre-defined method
		Assert.assertEquals(false, false);
		
	}
	
	
}
