package Health_care_Automation_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginId 
{
   
    @FindBy (xpath="(//a[@href=\"https://healcon.com/login/\"])[2]")
    private WebElement ID;
    
    public LoginId (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);   	
    }
    
    public void clickonID()
    {
	  ID.click();
    }  
}