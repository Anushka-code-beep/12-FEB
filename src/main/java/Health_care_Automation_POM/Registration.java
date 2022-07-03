package Health_care_Automation_POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration
{
     
     @FindBy (xpath = "(//a[@id=\"hl-lp-addpatient\"])[2]")
     private WebElement Add;
     
     @FindBy (xpath = "//input[@name=\"hl-name\"]")
     private WebElement Name;
     
     @FindBy (xpath = "//label[@class=\"radio\"][1]")
     private WebElement Gender ;
     
     @FindBy (xpath = "//select[@name=\"hl-mobilerelation\"]")
     private WebElement Contact ;
     
	 @FindBy (xpath = "//input[@id=\"r-shipsname\"]")
     private WebElement Conperson;
		  
     @FindBy (xpath = "//input[@name=\"hl-mobile1\"]")
     private WebElement Mobile;
		  
	 @FindBy (xpath = "//input[@name=\"hl-email\"]")
     private WebElement Email ;
		  
	 @FindBy (xpath = "//textarea[@id=\"hl-address\"]")
	 private WebElement Address ;
		  		
	 @FindBy (xpath = "(//a[@href=\"javascript:void(0)\"])[1]") 
	 private WebElement Country ;
		 
	 @FindBy (xpath = "(//input[@type=\"text\"])[25]") 
	 private WebElement ConSearch ;
		
     @FindBy (xpath = "(//div[@class=\"select2-result-label\"])[1]")
     private WebElement conSearchtxt ;
		  
     @FindBy (xpath = "(//a[@href=\"javascript:void(0)\"])[2]")
     private WebElement City ;
		 
	 @FindBy (xpath = "(//input[@type=\"text\"])[25]")
	 private WebElement CitySearch ;
		  
     @FindBy (xpath = "(//div[@class=\"select2-result-label\"])[3]")
     private WebElement CitySearchtxt ;
		  
		/*
		 * @FindBy (xpath = "") private WebElement ;
		 * 
		 * @FindBy (xpath = "") private WebElement ;
		 * 
		 */
	 
		
     public Registration (WebDriver driver) 
     {
    	 PageFactory.initElements(driver, this);
     }
     
     
     
     public void RegistrationMethod(WebDriver driver) throws InterruptedException 
     {
    	 Add.click();
    	 Name.sendKeys("Akshay Kumar");
    	 Gender.click();
    	 
    	 Select Ak = new Select (Contact);
    	 Ak.selectByIndex(2);
    	 Conperson.sendKeys("Suraj");
    	 
    	 Mobile.sendKeys("7777877778");
    	 
    	 Email.sendKeys("ABCD@gmail.com");
    	 
    	 Address.sendKeys("Velocity BharathiVidyapeth Katraj Pune 411046");
    
    	 Country.click();
    	 
    	 ConSearch.sendKeys("Ind");
    	 
    	 Thread.sleep(3000);
    	 conSearchtxt.click();
    	 
    	 City.click();
    	 
    	 CitySearch.sendKeys("Pu");
    	 
    	 List <WebElement> DD = driver.findElements(By.xpath("//div[@class=\"select2-result-label\"]"));
    	 int count = DD.size();
    	 System.out.println(count);
    	 for (int i=0; i<=count-1; i++) 
    	 {
    		 System.out.println(DD.get(i).getText());
    		 if (DD.get(i).equals("Pune")) 
    		 {
    			 break;
    		 }
    	 }
     }
}