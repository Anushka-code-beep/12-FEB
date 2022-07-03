package Base_Package_Health_Care;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
	public static WebDriver driver;
	
    public void LaunchBrowser1() 
    {
    	
    	System.setProperty("webdriver.chrome.driver",
    	"C:\\Users\\akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://practice.healcon.com/");
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
