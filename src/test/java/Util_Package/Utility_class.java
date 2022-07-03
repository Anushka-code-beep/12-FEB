package Util_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_class
{
	// its used to fetch username/id/data from file and use in test class, method here will return type as they fetch data 
    
	// data driven framework - testdata is separated from testscript and saved in diff file its data driven framework
	
	public static void captureScreenshot(WebDriver driver) throws IOException 
      {
    	  File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	  
    	  Date d = new Date();
    	  SimpleDateFormat SS = new SimpleDateFormat("MMddYYYY_HHmmss");
    	  String Timestamp = SS.format(d);
    	  File dest =  new File ("D:\\Selenium_Automation\\ScreenShot/"+Timestamp+".jpg");
    	  FileHandler.copy(src, dest);
      }
      
	
	
     public static String fetchData(int row, int cell) throws IOException
      {
    	  String path ="C:\\Users\\akshay\\Desktop\\TestNG.xlsx";
    	  FileInputStream file = new FileInputStream(path);  // File Read
          
          
          Workbook a = WorkbookFactory.create(file);
          String b = a.getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
			
          return b;
          // String Data  - Should be between ' ' ;
          // Numeric Data - Should have ' at the End
          
      }
}