package StepDefinition;

import com.lmsHack.baseClass.baseClass;

import io.cucumber.java.en.*;


public class Login extends baseClass{
	
	
	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		
		System.out.println("User is on the browser");
		
	    
	}

	@When("User opens the LMS Website")
	public void user_opens_the_lms_website() {
		
		setup(baseURL);
		
	}
	    

	@Then("User should see the Login page")
	public void user_should_see_the_login_page() {
		
		System.out.println("User able to view the login page");
	   
	}

	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
	    
	}

	@When("User clicks the Login button after entering invalid username or password")
	public void user_clicks_the_login_button_after_entering_invalid_username_or_password() {
	    
	}

	@Then("User should not be logged in")
	public void user_should_not_be_logged_in() {
	   
	}

	@When("User clicks the Login button after entering valid username and password")
	public void user_clicks_the_login_button_after_entering_valid_username_and_password() {
	    
	}

	@Then("User should see the LMS Home page.")
	public void user_should_see_the_lms_home_page() {
	   
	}


}
