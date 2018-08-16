package steps;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.LoginPage;

public class Login {


    @Before
    public void setup() {
        BasePage.setupProperties();
    }

    @Given("^User navigates to stackoverflow website$")
    public void user_navigates_to_stackoverflow_website() throws Exception {
        BasePage.start();
    }

    @And("^Click on the login buton on the homepage$")
    public void click_on_the_login_buton_on_the_homepage() throws Exception {
        LoginPage.navigateToLoginPage();

    }

    @And("^User enters a valid username$")
    public void user_enters_a_valid_username() throws Exception {
        System.out.println("test");
    }

    @And("^User enters a valid password$")
    public void user_enters_a_valid_password() throws Exception {
        System.out.println("test");
    }

    @When("^User click on login button$")
    public void user_click_on_login_button() throws Exception {
        System.out.println("test");
    }

    @Then("^User should be taken to the successful login page$")
    public void user_should_be_taken_to_the_successful_login_page() throws Exception {
        System.out.println("test");
    }

    @After
    public void stop() {

    }
}