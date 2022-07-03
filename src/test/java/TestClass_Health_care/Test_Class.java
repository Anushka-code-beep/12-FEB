package TestClass_Health_care;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Package_Health_Care.Base_Class;
import Health_care_Automation_POM.LoginId;
import Health_care_Automation_POM.LoginIdEntry;
import Util_Package.Utility_class;

public class Test_Class extends Base_Class
{
	LoginId login;            // Declaration of POM classes as Global Variable
	LoginIdEntry logEntry;     // Global variables used because its designing pattern and making global variable can be suitable than making object always 
	//Registration register;
	
    @BeforeClass
    public void Launch()
    {
    	LaunchBrowser1() ;            
    	login = new LoginId(driver);                 // Initializing the Variable 
    	logEntry = new LoginIdEntry(driver);    	
    } 
    
     @BeforeMethod
     public void LoginPage() throws InterruptedException 
     {
    	 login.clickonID();
    	 Thread.sleep(3000);
    	 
    	 logEntry.switchtowindow(driver);
    	 logEntry.enteremail("akshaykondhalkar7@gmail.com"); // we don't Hardcode values here else,
         // by using utility class we fetch data from diff file [its a data driven framework]
       
    	 logEntry.enterpwd("9011395560");
         logEntry.clickonloginbutton();
     }
     
     @Test
     public void TC_01() 
     {
    	 Reporter.log("TC_01");
    	 System.out.println("Pass TC");
     }
     
     @AfterMethod
     public void Logout() 
     {
      	Reporter.log("LOGOUT");
   	    System.out.println("Pass logout");
     }
     
     @AfterClass
     public void Close()
     {
      	Reporter.log("Close");
   	    System.out.println("pass close");
     }
}
