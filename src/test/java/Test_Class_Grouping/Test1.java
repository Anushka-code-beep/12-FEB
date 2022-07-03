package Test_Class_Grouping;

import org.testng.annotations.Test;

public class Test1 
{
	   @Test (groups="pune")
	   public void TC_01() 
	   {
		   System.out.println("TC_01");
	   }
	   
	   @Test (groups="pune")
	   public void TC_02() 
	   {
		   System.out.println("TC_02");
	   }
	   
	   @Test (groups="pune")
	   public void TC_03() 
	   {
		   System.out.println("TC_03");
	   }
	   
	   @Test (groups="mumbai")
	   public void TC_04() 
	   {
		   System.out.println("TC_04");
	   }
	   
	   @Test (groups="mumbai")
	   public void TC_05() 
	   {
		   System.out.println("TC_05");
	   }
}
