package steps;


import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.drive", "/Users/michal.gebarowski/Documents/GitProject/gherkin-cucumber-demo/src/test/resources/drivers/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    }

    @Given("^User navigates to stackoverflow website$")
    public void user_navigates_to_stackoverflow_website() throws Exception {

    }

    @And("^Click on the login buton on the homepage$")
    public void click_on_the_login_buton_on_the_homepage() throws Exception {

    }

    @And("^User enters a valid username$")
    public void user_enters_a_valid_username() throws Exception {

    }

    @And("^User enters a valid password$")
    public void user_enters_a_valid_password() throws Exception {

    }

    @When("^User click on login button$")
    public void user_click_on_login_button() throws Exception {

    }

    @Then("^User should be taken to the successful login page$")
    public void user_should_be_taken_to_the_successful_login_page() throws Exception {

    }

}