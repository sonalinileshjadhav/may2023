package utility;

public class Calling 
{
	
	
	public static void main(String[] args)
	{
		
		
	  
	//launch browser	
	   Object[] input1 =new Object[2];
	            input1[0]="webdriver.chrome.driver";
	            input1[1]="C:\\Automation\\chromedriver.exe";
          SeleniumOperations.brouserLaunch(input1); 
          
          
        //open app  
       Object[]input2=new Object[1];
                input2[0]="http://primusbank.qedgetech.com/";
          SeleniumOperations.openApplication(input2);
		 
		//enter u name
       Object[] input3 =new Object[2];
	            input3[0]="//*[@name='txtuId']";
	            input3[1]="Admin";
          SeleniumOperations.enterTextOnUi(input3);        
                
        //enter password
          Object[] input4 =new Object[2];
          input4[0]="//*[@name='txtPword']";
          input4[1]="Admin";
    SeleniumOperations.enterTextOnUi(input4);
          
           //click on login       
          Object[]input5=new Object[1];
          input5[0]="//*[@name='login']";
    SeleniumOperations.clickOnElement(input5);            
		
    //validation for login 
   
    Object[]valid1=new Object[1];
    valid1[0]="//*[text()='Admin']";
SeleniumOperations.validation(valid1);  
		
//click on branches

     Object[]input6=new Object[1];
     input6[0]="(//*[@height='24'])[2]";
     SeleniumOperations.clickOnElement(input6);            

//select country
     Object[] input7 =new Object[2];
      input7[0]="//*[@name='lst_countryS']";
      input7[1]="INDIA";
      SeleniumOperations.selectValue(input7);
	
   
//select country
Object[] input8 =new Object[2];
input8[0]="//*[@name='lst_stateS']";
input8[1]="MAHARASTRA";
SeleniumOperations.selectValue(input8);

//select country
Object[] input9 =new Object[2];
input9[0]="//*[@name='lst_cityS']";
input9[1]="MUMBAI";
SeleniumOperations.selectValue(input9);


//click on search
Object[]input10=new Object[1];
input10[0]="//*[@id='btn_search']";
SeleniumOperations.clickOnElement(input10);  

//validation for search
Object []valid2=new Object[2];
valid2[0]="(//*[contains(text(),'MUMBAI')])[1]";
valid2[1]="MUMBAI";
SeleniumOperations.validation(valid2);

		

		 
	} 
	

}
