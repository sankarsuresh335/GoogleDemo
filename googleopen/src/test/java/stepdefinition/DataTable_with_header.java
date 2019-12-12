package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DataTable_with_header {
	
	WebDriver driver;
	
	@Given("^:  user should be in login page$")
	public void user_should_be_in_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();

	    
	}

	@When("^: the user to give the correct crendtial for with datatable with hearder$")
	public void the_user_to_give_the_correct_crendtial_for_with_datatable_with_hearder(DataTable datawith) throws Throwable {
		
		List  <Map<String,String>>datas=datawith.asMaps(String.class, String.class);
		
		String username=datas.get(0).get("username");
		
		String password=datas.get(0).get("password");
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		System.out.println("hiii");

	    
	}

	@When("^: the user should be click the login button and see the homepage$")
	public void the_user_should_be_click_the_login_button_and_see_the_homepage() throws Throwable {
		
		driver.findElement(By.id("btnLogin")).click();
	    
	}

	@Then("^: the user should be in home page and see$")
	public void the_user_should_be_in_home_page_and_see() throws Throwable {
		
		WebElement linktext = driver.findElement(By.linkText("Welcome Admin"));

		linktext.click();

		String excaptedtittle = linktext.getText();

		Assert.assertEquals("Welcome Admin", excaptedtittle);

	   
	}


	
	
	

}
