package groupingtests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrytestcase implements IRetryAnalyzer
{

	int initialcount=0;
	int RetryCount=2;//we can decide how many times we can retry failed testcases
	@Override
	public boolean retry(ITestResult result) {
		if(initialcount<RetryCount)
		{
			initialcount++;
			return true;
		}
		
		
		
		return false;
	}

}
