package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{
	
	public static ChromeDriver driver=null;
	//browser launch
	    public static void brouserLaunch(Object[]inputParameters) //2 atgs
	    {
	    	String bname=(String) inputParameters[0];  //chrome
	    	String exe=(String) inputParameters[1]; //exe
	    	 
	    	if(bname.equalsIgnoreCase("chrome"))
	    	{
	    	  
	    	System.setProperty("webdriver.chrome.driver",exe);
	    	
	    	 driver=new ChromeDriver();
	    	driver.manage().window().maximize();
	    	}
	    	
	 
	    }
	
	//open  application
	    
	  public static void openApplication(Object[]inputParameters)
	  {
		  String url=(String) inputParameters[0];
		  driver.get(url);
	  }	
	  //enter text on ui
	    	
	   public static void enterTextOnUi(Object[]inputParameters)
	    	{
	    		String xpath=(String) inputParameters[0];
	    		String text=(String) inputParameters[1];
	    		driver.findElement(By.xpath(xpath)).sendKeys(text);
	    	} 
	   
	   //click on element
	   
	   public static void clickOnElement(Object[]inputParameters)
		  {
			  String xpath=(String) inputParameters[0];
			  driver.findElement(By.xpath(xpath)).click();
		  }	
	   // static dropdown  by select
	   public static void selectValue(Object[]inputParameters)
	   {
		   String xpath =(String) inputParameters[0];
		   String value = (String) inputParameters[1];
		   Select sel=new Select(driver.findElement(By.xpath(xpath)));
		          sel.selectByValue(value);
	   }
	   
	   
	  //validation
	   public static void validation(Object[]inputParameters)
	   {
		   String xpath=(String)inputParameters[0];
		   
		String capturedText=   driver.findElement(By.xpath(xpath)).getText();
		   
		   String givenText="Admin";
		   
		   if(capturedText.equalsIgnoreCase(givenText))
		   {
			   System.out.println("Test Case Pass");
		   }
		   else
		   {

			   System.out.println("Test Case Fail");
		   }
		   
		   
	   }
	   
}
	
	
	


