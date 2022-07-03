package Test_Classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTestNG 
{
  @BeforeClass
  public void Launch () // launch browser  
  {
	  System.out.println("@BeforeClass");
  }
  
  @BeforeMethod
  public void BeforeM () // Prerequisite, Xpaths, Webelements, Locators
  {
	  System.out.println("@BeforeMethod");
  }
  
  
  @Test
  public void TC_01 ()   // TestCase, Execution, Operation
  {
	  System.out.println("@TC_01");
  }
  
  @Test
  public void TC_02 ()   // TestCase, Execution, Operation
  {
	  System.out.println("@TC_02");
  }
  
  @Test
  public void TC_03 ()   //  TestCase, Execution, Operation
  {
	  System.out.println("@TC_03");
  }
  
  
  @AfterMethod
  public void AfterM ()  // AfterExecution 
  {
	  System.out.println("@AfterMethod");
  }
  
  @AfterClass 
  public void Close () // Closing 
  {
	  System.out.println("@AfterClass");
  }
  
}