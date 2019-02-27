package qa.com.CuteCumberTest;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Websites.HomePage;
import Websites.MenuPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition {

	WebDriver driver;

	
	@Before
	public void startup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown ()
	{
		driver.close();
	}
	
	@Given("^the correct web address$")
	public void the_correct_web_address() {
		driver.get("http://www.practiceselenium.com/welcome.html");
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.clickmenulink();
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() 
	{
		assertEquals("Wrong End Page ","http://www.practiceselenium.com/menu.html" , driver.getCurrentUrl());
		MenuPage menupage = PageFactory.initElements(driver, MenuPage.class);
		menupage.clickbothimages();
	}

	

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.cliccheckoutlink();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() 
	{
		assertEquals("Wrong End Page ","http://www.practiceselenium.com/check-out.html" , driver.getCurrentUrl());
	}

}
