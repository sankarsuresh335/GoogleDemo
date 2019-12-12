package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LevelHookes {
	
	@Given("^: this is the first step$")
	public void this_is_the_first_step() throws Throwable {
		
		System.out.println("i am method call first");
	    
	}

	@When("^: this is the second step$")
	public void this_is_the_second_step() throws Throwable {
		
		System.out.println("i am method call sencond");
	   
	}

	@Then("^: this is the thired step$")
	public void this_is_the_thired_step() throws Throwable {
		
		System.out.println("i am method call third");
		
		
	    }



}
