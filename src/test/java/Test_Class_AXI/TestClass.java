package Test_Class_AXI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Axi_Corp_POM.LoginPagePOM;
import Base_Package_AXI.Base_Class;

public class TestClass extends Base_Class
{
	LoginPagePOM axilogin;
	
	
  @BeforeClass
  public void launchbrowser() 
  {
	  launchBrowser();
	  axilogin = new LoginPagePOM(driver);
	  
  }
  
  @BeforeMethod
  public void LoginPreconditon() 
  {
	  axilogin.ClickonSignin();
	  axilogin.Popuphandle();
  }
  
  @Test
  public void signintest() 
  {
	  System.out.println("TC_01");
  }
  
  @AfterMethod
  public void logoutcondition() 
  {
	  System.out.println("Logout");
  }
  
  @AfterClass
  public void closeBrowser() 
  {
	  driver.close();
  }
}
