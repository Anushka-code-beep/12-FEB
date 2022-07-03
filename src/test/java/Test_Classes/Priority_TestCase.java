package Test_Classes;

import org.testng.Reporter;
import org.testng.annotations.Test;

// In order to run the desired TC first, we Use "Priority"  Keyword

// if the Priority is not set then, TC as executed in Alphabetically in Ascending order.
// if the Priority is GIVEN are SAME to Multiple TestCases then it will choose that priority on basis of Aplabetical ascending order
// if the priority is not set, then Its Set To DEFAULT PRIORITY = "0" 
// Priority Keyword are given with annotations Only
// We can Multiple annotations to one TC

public class Priority_TestCase 
{ 
	@Test (priority = -1)
	public void TC_05()
	{
		Reporter.log("TC_05");
	}

	
	@Test (priority = -2)
	public void TC_04()
	{
		Reporter.log("TC_04");
	}
	
	
	@Test 
	public void TC_03()
	{
		Reporter.log("TC_03");
	}
	
	
	@Test (priority = 2)
	public void TC_01()
	{
		Reporter.log("TC_01");
	}
	
	
	@Test (priority = 1, invocationCount = 7, timeOut=3000) // we can take Multiple keywords in 1TC
	public void TC_02()
	{
		Reporter.log("TC_02");
		System.out.println("ABCD");   // Shown on the console, not in report
		Reporter.log("1234",true);         // not shown on the console, but showing in Report
	}
	
}