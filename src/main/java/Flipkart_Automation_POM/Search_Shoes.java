package Flipkart_Automation_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Shoes 
{
     @FindBy(xpath="//input[@name=\'q\']")
     private WebElement searchBoxTxt;
     
     @FindBy(xpath="//button[@type=\'submit\']")
     private WebElement searchBoxClick;
     
     
     public Search_Shoes (WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     
     public void enterSearch(String Srh) 
     {
    	 searchBoxTxt.sendKeys(Srh);
     }
     
     public void clickonsearch() 
     {
    	 searchBoxClick.click();
     }
     
}
