package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CucumberExample {

	WebDriver driver;

	@Given("^:  user should be in login page with ans$")
	public void user_should_be_in_login_page_with_ans() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();

	}

	@When("^: the user enters  \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void the_user_enters_and_password(String username, String password) throws Throwable {

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

		System.out.println("hiii");

	}

	@When("^: clicked button$")
	public void clicked_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();

	}

}