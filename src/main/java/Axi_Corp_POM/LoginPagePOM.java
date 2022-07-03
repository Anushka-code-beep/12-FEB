package Axi_Corp_POM;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM
{
   @FindBy(xpath="(//a[@target=\'_blank\'])[19]") 
   private WebElement login;
   
   @FindBy(xpath="//button[@id=\"wzrk-cancel\"]") 
   private WebElement popup;
   
   public LoginPagePOM(WebDriver driver) 
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void ClickonSignin() 
   {
	   login.click();
   }
   
   public void Popuphandle() 
   {
	   popup.click();
   }
}
