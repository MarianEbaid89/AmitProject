package steps;

import base.TestBase;
import pages.HomePage;
import pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SD01_RegistrationTestSteps extends TestBase {
    HomePage homePage = new HomePage(driver);
    RegistrationPage registrationPage = new RegistrationPage(driver);

    @Given("user is in home page")
    public void user_is_in_home_page() {
        homePage.navigateHomePage();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }
    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        homePage.clickOnRegister();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store. Register");
    }
    @When("select gender")
    public void select_gender() {
        registrationPage.selectGender();
    }
    @When("enter first name")
    public void enter_first_name() {
        registrationPage.enterFirstName();
    }
    @When("enter last name")
    public void enter_last_name() {
        registrationPage.enterLastName();
    }
    @When("enter date of birth")
    public void enter_date_of_birth() {
        registrationPage.selectDayOfBirth();
        registrationPage.selectMonthOfBirth();
        registrationPage.selectYearOfBirth();
    }
    @When("enter email")
    public void enter_email() {
        registrationPage.enterEmail();
    }
    @When("enter company")
    public void enter_company() {
        registrationPage.enterCompany();
    }
    @When("enter password")
    public void enter_password() {
        registrationPage.enterPassword();
    }
    @When("enter confirmed password")
    public void enter_confirmed_password() {
        registrationPage.enterConfirmPassword();
    }
    @When("clicks on register button")
    public void clicks_on_register_button() {
        registrationPage.clickRegister();
    }
    @Then("user registration success message is displayed")
    public void user_registration_success_message_is_displayed() {
        Assert.assertEquals(registrationPage.getSuccessMessage(),"Your registration completed");
    }




}
