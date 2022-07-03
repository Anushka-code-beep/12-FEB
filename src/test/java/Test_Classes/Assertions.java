package Test_Classes;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions 
{
   String act = "google";
   String exp = "google";
   SoftAssert soft = new SoftAssert();
   
   @Test
   public void TC_01()
   {
	   //HARDASSERT - no need to create object  //HardAssert used when we want to not execute the remaining Code if Any One assertion fails
	   Assert.assertEquals(act, exp);  // PASS 
	   Assert.assertNotEquals(act, exp);  // FAIL  [here in HardAssert if assertion fails it will not execute the remaining Code]
	   Assert.assertTrue(true);           // TRUE
	   Assert.assertFalse(true);          // FALSE
	   Assert.assertFalse(false, "PassedTC_01");   //TRUE
	   Assert.fail();                              // FAIL   used to fail the TestCase
   }
   
   @Test
   public void TC_02() 
   {
	   // SOFTASSERT - Need to create object  //SoftAssert used when if we want to execute all assertions irrespective of any one assertion fails 
	   soft.assertEquals(act, exp);        // TRUE        
	   soft.assertNotEquals(act, exp);     // FALSE
	   soft.assertTrue(true);              // TRUE
       soft.assertFalse(true);              // FALSE
       soft.assertFalse(false,"Passed TC_02");  // TRUE
       soft.fail();                               // FAIL
       soft.assertAll();                         // in order to execute more than one assertions {ASSERTALL} must be given
                                                // in SoftAssert --> if TC PASS then code after ASSERT_ALL will be executed && if TC fail then ASSERT_ALL will be last line
   }		   
}