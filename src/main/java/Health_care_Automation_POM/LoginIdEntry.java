package Health_care_Automation_POM;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginIdEntry 
{
	
	@FindBy (xpath="//input[@type=\"text\"]")
	private WebElement email;
	
	@FindBy (xpath="//input[@name=\'hl-wlpass\']")
	private WebElement pass;
	
	@FindBy (xpath="//button[@type=\'submit\']")
	private WebElement logbutton;
	
	
	public LoginIdEntry (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	} 
	
	
	
	//methods as per WebElement 
	
	public void switchtowindow(WebDriver driver)
	{
		String url = "https://healcon.com/login/";
		Set <String> SS = driver.getWindowHandles();
		for (String i:SS) 
		{
			driver.switchTo().window(i);
			if (SS.equals(url)) 
			{
				System.out.println(SS+"Switched Window");
				break;
			}
		}
	}
	
	public void enteremail(String Email)
	{
		email.sendKeys(Email);;
	}
	
	public void enterpwd(String pwd) 
	{
		pass.sendKeys(pwd);
	}
	
	public void clickonloginbutton()
	{
		logbutton.click();
	}
	
}