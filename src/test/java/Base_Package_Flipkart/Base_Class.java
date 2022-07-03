package Base_Package_Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class
{
   public WebDriver driver;
   
   public void launchMethod() 
   {
	   System.setProperty("webdriver.chrome.driver",
	   "C:\\Users\\akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
   }
}