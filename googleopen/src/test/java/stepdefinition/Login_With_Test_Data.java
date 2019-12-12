package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login_With_Test_Data {
	
	WebDriver driver;
	
	

@Given("^: the user should be in login pagehome page$")
public void the_user_should_be_in_login_pagehome_page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();

   
}

@When("^: To given the user name crential data \"([^\"]*)\" and password \"([^\"]*)\"$")
public void to_given_the_user_name_crential_data_and_password(String Username , String Password ) throws Throwable {
	
	driver.findElement(By.id("txtUsername")).sendKeys(Username);
	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	
	System.out.println("hiii");

    
}

@When("^: to click the submitbutton$")
public void to_click_the_submitbutton() throws Throwable {
	
	driver.findElement(By.id("btnLogin")).click();
    
}

@Then("^: the suer should be in home page with correct creditial$")
public void the_suer_should_be_in_home_page_with_correct_creditial() throws Throwable {
	
	WebElement linktext = driver.findElement(By.linkText("Welcome Admin"));

	linktext.click();

	String excaptedtittle = linktext.getText();

	Assert.assertEquals("Welcome Admin", excaptedtittle);

    
}


	
}
