package stepdefinition;

import cucumber.api.java.en.Given;

public class Symbolshort {
	
	@Given("^:  I have a (\\d+) laptop$")
	public void i_have_a_laptop(int arg1) throws Throwable {
		
		System.out.println(arg1);
	   
	}

	@Given("^: i have done with (\\d.\\d) CGP in my college leavel$")
	public void i_have_done_with_CGP_in_my_college_leavel(float arg1) throws Throwable {
		
		System.out.println(arg1);
		
		
	    	}
	@Given("^: My friend \"([^\"]*)\" is better then \"([^\"]*)\" and  \"([^\"]*)\"$")
	public void my_friend_is_better_then_and(String arg1, String arg2, String arg3) throws Throwable {

		
		System.out.println(arg1+"better then"+arg2  + ": and :" +arg3 );
	
		
	  }


}
