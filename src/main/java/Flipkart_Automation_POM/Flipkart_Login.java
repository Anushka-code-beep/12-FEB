package Flipkart_Automation_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Login 
{
   
   @FindBy (xpath = "//button[@class=\"_2KpZ6l _2doB4z\"]")     // Annotations[@findby]
   private WebElement Login;
   
   public Flipkart_Login(WebDriver driver)      // constructor
   {
	   PageFactory.initElements(driver, this);
   }
   
  public void clickonlogin() 
   {
	   Login.click();
   } 
}
