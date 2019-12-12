package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DataTable_Without {
	
	WebDriver driver;
	
	
	@Given("^: the user should be in login page$")
	public void the_user_should_be_in_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();

	    
	}

	@When("^: the user to give the correct crendtial$")
	public void the_user_to_give_the_correct_crendtial(DataTable datatable) throws Throwable {
		
		
		List<String> str=datatable.asList(String.class);
		
		String Username=str.get(0);
		String Password=str.get(1);
		
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		
	   
	}

	@When("^: the user should be click the login button$")
	public void the_user_should_be_click_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	   
	}

	@Then("^: the user should be in home page$")
	public void the_user_should_be_in_home_page() throws Throwable {
		
		WebElement linktext = driver.findElement(By.linkText("Welcome Admin"));

		linktext.click();

		String excaptedtittle = linktext.getText();

		Assert.assertEquals("Welcome Admin", excaptedtittle);

		
	}



}
