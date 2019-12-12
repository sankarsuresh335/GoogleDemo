package hookes;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BackgroundExapmel {
	
	@Before
	public void medical() {
		
		System.out.println("he should be first");
		
	}
	@After
	public void engg() {
		
		System.out.println("he should be in second");
		
	}
	
	@Before(order=1)
	public void school() {
		
		System.out.println("must be in high school");
		
	}
	@After(order=0)
	public void college() {
		
		System.out.println("this in college");
		
	}

}
