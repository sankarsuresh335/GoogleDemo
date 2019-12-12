package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginHRM {

	WebDriver driver;

	@Given("^: user is on login page$")
	public void user_is_on_login_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();

	}

	@When("^: To user entre the username and password$")
	public void to_user_entre_the_username_and_password() throws Throwable {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	}

	@When("^: the user click the login page$")
	public void the_user_click_the_login_page() throws Throwable {

		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^: The user should be in homepage$")
	public void the_user_should_be_in_homepage() throws Throwable {

		WebElement linktext = driver.findElement(By.linkText("Welcome Admin"));

		linktext.click();

		String excaptedtittle = linktext.getText();

		Assert.assertEquals("Welcome Admin", excaptedtittle);

	}

}
