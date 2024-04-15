package HW.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import HW.HomePage;
import HW.RegistrationPage;

import static org.junit.Assert.assertTrue;

public class RegisterAccountSteps {
    private WebDriver driver;
    private RegistrationPage registrationPage;

    @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() {
        driver = new ChromeDriver();
        registrationPage = new RegistrationPage(driver);
        registrationPage.navigateTo();
    }

    @When("I fill in the registration form with valid details")
    public void iFillInTheRegistrationFormWithValidDetails() {
        registrationPage.enterFirstName()
                .enterLastName()
                .enterEmail()
                .enterTelephone()
                .enterPassword()
                .clickPrivacyPolicyCheckbox()
                //.clickContinueButton()

        ;

    }

    @And("I submit the registration form")
    public void iSubmitTheRegistrationForm() {
        registrationPage.clickContinueButton();
    }

    @Then("I should be registered successfully")
    public void iShouldBeRegisteredSuccessfully() {
        HomePage homePage = new HomePage(driver);
       Assert.assertTrue("Registration successful", homePage.isPageLoaded());
        driver.quit();
    }
}

