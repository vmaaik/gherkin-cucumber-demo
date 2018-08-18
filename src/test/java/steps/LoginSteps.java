package steps;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    private final LoginPage loginPage = new LoginPage();

    @Given("^web browser is at the github home page$")
    public void user_navigates_to_stackoverflow_website() {
        BasePage.start();
    }

    @And("^Click on the login button on the homepage$")
    public void click_on_the_login_button_on_the_homepage() {
        loginPage.navigateToLoginPage();
    }

    @And("^User enters a valid (.*?) and (.*?)$")
    public void userEntersAValidUsernameAndPassword(String username, String password) {
        loginPage.setUserName(username);
        loginPage.setPassword(password);
    }

    @When("^User click on login button$")
    public void user_click_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("^User should be taken to the successful login page$")
    public void user_should_be_taken_to_the_successful_login_page() {
        assertEquals(loginPage.getMessage(), "Incorrect username or password.");
    }

    @After
    public void stop() {
        BasePage.tearDown();
    }
}