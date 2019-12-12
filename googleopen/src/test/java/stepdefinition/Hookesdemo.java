package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hookesdemo {
	
	@Given("^: thoses will have the infintive stone$")
	public void thoses_will_have_the_infintive_stone() throws Throwable {
		
		System.out.println("thoses have infinity stone");
	    
	}

	@When("^: to destoye the world half$")
	public void to_destoye_the_world_half() throws Throwable {
		
		System.out.println("thones will destoryed half of the world");
	   
	}

	@Then("^: he went to his plante$")
	public void he_went_to_his_plante() throws Throwable {
		
		System.out.println("thones went to his plante");
	   
	}


}
