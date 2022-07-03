package Test_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Health_care_Automation_POM.LoginId;
import Health_care_Automation_POM.LoginIdEntry;

public class Test_Class_Annontations
{
   @BeforeClass
   public void Launch1 () 
   {
	   System.setProperty("webdriver.chrome.driver",
	  "C:\\Users\\akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			    					    				
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
   }
   
   @BeforeMethod 
   public void Login () 
   {
	   WebDriver driver = new ChromeDriver();
	   LoginId AK = new LoginId (driver);
	   AK.clickonID();
	   LoginIdEntry AK1 = new LoginIdEntry(driver);
	   AK1.clickonloginbutton();
   }
   
   @Test
   public void testcase()
   {
	   WebDriver driver = new ChromeDriver();
	   
   }
   
   @AfterMethod
   public void Logout() 
   {
	   WebDriver driver = new ChromeDriver();
   }
   
   @AfterClass
   public void Close() 
   {
	   WebDriver driver = new ChromeDriver();
   }
}
