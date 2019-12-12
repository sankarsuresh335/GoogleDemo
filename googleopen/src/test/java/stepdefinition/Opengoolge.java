package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Opengoolge {
	
	WebDriver driver;
	

	@Given("^: to entre the google\\.co\\.in$")
	public void to_entre_the_google_co_in() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		
	}

	@When("^:  to serch the value as \"([^\"]*)\"$")
	public void to_serch_the_value_as(String arg1) throws Throwable {
		
		driver.findElement(By.name("q")).sendKeys(arg1);

	}

	@When("^:   to wait for the result$")
	public void to_wait_for_the_result() throws Throwable {
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("^: user should see the actual reslut$")
	public void user_should_see_the_actual_reslut() throws Throwable {
		
		Boolean status=driver.findElement(By.partialLinkText("Exception")).isDisplayed();
		
		if(status) {
			
			System.out.println("dispaly te value");
		}
		else {
			
			System.out.println("not dispaly");
		}
		
		

	}

}
