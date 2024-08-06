package mapping;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Login {
	
	@Given("user open {string} brouser with exe as {string}")
	public void user_open_brouser_with_exe_as(String bname, String exe)
	{
		   Object[] input1 =new Object[2];
           input1[0]=bname;
           input1[1]=exe;
     SeleniumOperations.brouserLaunch(input1); 
	}
	


	@Given("user enter url as {string}")
	public void user_enter_url_as(String url) 
	{
		 Object[]input2=new Object[1];
         input2[0]=url;
   SeleniumOperations.openApplication(input2);
	    
	}

	@When("user enter (.+) as Username")
	public void user_enter_as_username(String uname) 
	{
		Object[] input3 =new Object[2];
        input3[0]="//*[@name='txtuId']";
        input3[1]=uname;
  SeleniumOperations.enterTextOnUi(input3); 
	}

	@When("user enter (.+) as Password")
	public void user_enter_as_password(String pass) 
	{
		Object[] input4 =new Object[2];
        input4[0]="//*[@name='txtPword']";
        input4[1]=pass;
  SeleniumOperations.enterTextOnUi(input4);
	}

	@When("user click on Login button")
	public void user_click_on_login_button() 
	{
		  Object[]input5=new Object[1];
          input5[0]="//*[@name='login']";
    SeleniumOperations.clickOnElement(input5); 
	}

	@Then("Application shows Admin page to user")
	public void application_shows_admin_page_to_user() 
	{
		 Object[]valid1=new Object[1];
		    valid1[0]="//*[text()='Admin']";
		SeleniumOperations.validation(valid1); 
	}

    


}
