package support;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Tempt {
	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		
		//enter u name
		driver.findElement(By.xpath("//*[@name='txtuId']")).sendKeys("Admin");
		
		//enter pass
	    driver.findElement(By.xpath("//*[@name='txtPword']")).sendKeys("Admin");
		
		//click on login
	    driver.findElement(By.xpath("//*[@name='login']")).click();
		
		//click on branches
	    driver.findElement(By.xpath("(//*[@height='24'])[2]")).click();
				
				//select INDIA as country
		   Select country=new Select(driver.findElement(By.xpath("//*[@name='lst_countryS']")));
			      country.selectByVisibleText("INDIA");
				
				//select MH as STATE
		   Select state=new Select(driver.findElement(By.xpath("//*[@name='lst_stateS']")));
			      state.selectByVisibleText("MAHARASTRA");
				
				//select MUMBSI as CITY
		   Select city=new Select(driver.findElement(By.xpath("//*[@name='lst_cityS']")));
			      city.selectByVisibleText("MUMBAI");
				
				//click on search
		driver.findElement(By.xpath("//*[@id='btn_search']")).click();
		
		
		
		
	  Object a [] =new Object[2]; 
	  a[0]="abc";
	  a[1]="xyz";
	  
	  
	  
	  
	  
	}

}
