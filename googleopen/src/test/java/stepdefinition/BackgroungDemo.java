package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroungDemo {
	
	@Given("^:  he should finshed high school$")
	public void he_should_finshed_high_school() throws Throwable {
		
		System.out.println("he should finshed high school");
	   }

	@Given("^:   he should finsh higher secondery school level$")
	public void he_should_finsh_higher_secondery_school_level() throws Throwable {
		
		System.out.println(" he should finsh higher secondery school level");
	    }

	@Given("^: he should write entrcen exam$")
	public void he_should_write_entrcen_exam() throws Throwable {
		System.out.println("he should write entrcen exam");
	    }

	@When("^: he should clear the exam$")
	public void he_should_clear_the_exam() throws Throwable {
		
		System.out.println("he should clear the exam");
	    
	}

	@Then("^: he should join medical college$")
	public void he_should_join_medical_college() throws Throwable {
		
		System.out.println("he should join medical college");
	    }

	@Then("^: he should join engg college$")
	public void he_should_join_engg_college() throws Throwable {
		
		System.out.println("he should join engg college");
	    }



}
