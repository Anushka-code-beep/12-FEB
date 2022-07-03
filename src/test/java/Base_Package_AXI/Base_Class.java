package Base_Package_AXI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
    public WebDriver driver;
    
    public void launchBrowser() 
    {
    System.setProperty("webdriver.chrome.driver",
      "C:\\Users\\akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
    
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://upstox.com/");
    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    
    }
}
