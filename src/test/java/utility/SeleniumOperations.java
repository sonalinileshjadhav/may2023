package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import mapping.ConfigReader;

public class SeleniumOperations 
{
	public static ConfigReader config;
	
	
	public static ChromeDriver driver=null;
	//browser launch
	    public static void brouserLaunch(Object[]inputParameters) //2 atgs
	    {
	    	
	    	try
	    	{
	    		
	    	
	    	String bname=(String) inputParameters[0];  //chrome
	    	
	    	 
	    if(bname.equalsIgnoreCase("chrome"))
	    {
	    	 config = new ConfigReader();
	    	  
	    	System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome());
	    	driver=new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    }
	    	
	 
	    }
	    catch(Exception e) 
	    {
	    	System.out.println(e);
	    }
}
	//open  application
	    
	  public static void openApplication()
	 
	  {
		  try
	    	{
	    		
		  
		  driver.get(config.getApplicationUrl());
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  }	
		    catch(Exception e) 
		    {
		    	System.out.println(e);
		    }
	  }
	  //enter text on ui
	    	
	   public static void enterTextOnUi(Object[]inputParameters)
	    	{
		   try {
	    		String xpath=(String) inputParameters[0];
	    		String text=(String) inputParameters[1];
	    		driver.findElement(By.xpath(xpath)).sendKeys(text);
	    		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	} 
		    catch(Exception e) 
		    {
		    	System.out.println(e);
		    }
	    	}
	   
	   //click on element
	   
	   public static void clickOnElement(Object[]inputParameters)
		  {
		   try
		   {
			    String xpath=(String) inputParameters[0];
			  driver.findElement(By.xpath(xpath)).click();
			  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   }
		  
	       catch(Exception e) 
	       {
	    	System.out.println(e);
	      }
          }
		   

	   // static dropdown  by select
	   public static void selectValue(Object[]inputParameters)
	   {
		   try
		   {
		   String xpath =(String) inputParameters[0];
		   String value = (String) inputParameters[1];
		   Select sel=new Select(driver.findElement(By.xpath(xpath)));
		          sel.selectByValue(value);
		          driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   }
		    catch(Exception e) 
		    {
		    	System.out.println(e);
		    }
	   }
	   
	   
	  //validation
	   public static void validation(Object[]inputParameters)
	   {
		   try
		   {
		   String xpath=(String)inputParameters[0];
		   
		String capturedText=   driver.findElement(By.xpath(xpath)).getText();
		   
		   String givenText="text";
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   
		   if(capturedText.equalsIgnoreCase(givenText))
		   {
			   System.out.println("Test Case Pass");
		   }
		   else
		   {

			   System.out.println("Test Case Fail");
		   }
		   
		   
		   
		   
	   }
		   catch(Exception e) 
		    {
		    	System.out.println(e);
		    }
	   }
	   
}
	   
	


