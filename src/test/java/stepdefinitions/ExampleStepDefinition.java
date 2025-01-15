package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import app.App_One;

public class ExampleStepDefinition {
	private App_One appOne;
	private WebDriver driver;
	@Given("I launch the browser") 
	public void i_launch_the_browser() {
		appOne = new App_One(); 
		driver = appOne.getDriver(); 
		} 
	@When("I open {string}") 
	public void i_open(String url) { 
		appOne.openWeb(url); 
		}
	@Then("the page title should contain {string}")
	public void the_page_title_should_contain(String titlePart) { 
		String pageTitle = appOne.getPageTitle(); 
		if (!pageTitle.contains(titlePart)) { 
			throw new AssertionError("Page title '" + pageTitle + "' does not contain '" + titlePart + "'"); } }
	}

