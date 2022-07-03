package Test_Classes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords 
{
   @Test(invocationCount = 7)   // If we want to run a particular test case no of times, OR to run that TC in no of iterations "invocationCount" Keyword is Used
   public void TC_01() 
   {
    // System.out.println("TC_01");   // it will only Print the O/P in Console
	   
	   Reporter.log("TC_01");         // It will print in console and also save/print in Reports
   }
   
   
   @Test(enabled = false)  // If we want to Disable any TC in TestClass then we use "enabled" Keyword with Boolean operation
   public void TC_02() 
   {
	   System.out.println("TC_02");   // We also use SYSO statement in Company
   }
   
   
   @Test
   public void TC_03() 
   {
	   Reporter.log("TC_03");
   }
   
   
   @Test(dependsOnMethods = "TC_03")  // When we want to  run a test case prior to the any related test case or want to run that TC on basis of Other TC then we use "dependsOnMethods" Keyword
   public void TC_04()                
   {
	   Reporter.log("TC_04");   // if TC_03 runs then only TC_04 will be executed or else Skipped
   }
   
   
   @Test(dependsOnMethods = {"TC_03" , "TC_04"}) 
   public void TC_05() 
   {
	   Reporter.log("TC_05"); // if TC_03 and TC_04 runs then only TC_05 will be executed we can give no of conditiond or Testcases
   }
   
   
   @Test(timeOut = 4000) // If i want to run that TC in that Particular timeFrame or want to give that TC that particular time in which it has to run , then We use "Timeout" keyword
   public void TC_06() 
   {
	   Reporter.log("TC_06"); // If that TC takes more time that Timeout given it will be SKIPPED
   }
   
}

/*                          What is Default test run 5 Which are they ??
 * Result : [RemoteTestNG] detected TestNG version 7.4.0 
 * PASSED: TC_01
 * PASSED: TC_06 
 * PASSED: TC_01 
 * PASSED: TC_01 
 * PASSED: TC_01 
 * PASSED: TC_03 
 * PASSED: TC_01
 * PASSED: TC_04 
 * PASSED: TC_01 
 * PASSED: TC_01 
 * PASSED: TC_05
 * 
 * ==============Default test 
 * Tests run: 5,Failures: 0, Skips: 0 ===============================================
 * 
 * 
 * ============  Default suite 
 * Total tests run: 11, Passes: 11, Failures: 0, Skips: 0
 * ===============================================
 * 
 */