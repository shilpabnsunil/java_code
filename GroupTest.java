package groupingtests;

import org.testng.annotations.Test;

public class GroupTest {
	
	
	@Test(groups={"integration"})
	public void testcase1()
	{
		
	}
	@Test(groups={"system"})
	public void testcase2()
	{
		
	}
	@Test(groups={"system","smoke"})
	public void testcase3()
	{
		
	}
	@Test(groups={"system"})
	public void testcase4()
	{
		
	}
	@Test(groups={"integration"})
	public void testcase5()
	{
		
	}
	

}
