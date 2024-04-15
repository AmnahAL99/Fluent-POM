package HW;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
      WebDriver driver;
         Faker faker = new Faker();
        String password;
        // By locators
         By firstNameLocator = By.id("input-firstname");
         By lastNameLocator = By.id("input-lastname");
         By emailLocator = By.id("input-email");
         By telephoneLocator = By.id("input-telephone");
         By passwordLocator = By.id("input-password");
         By confirmPasswordLocator = By.id("input-confirm");
         By privacyPolicyCheckboxLocator = By.xpath("//label[@for='input-agree']");
         By continueButtonLocator = By.xpath("//input[@value='Continue']");


        public RegistrationPage(WebDriver driver) {
            this.driver = driver;
        }

        public RegistrationPage navigateTo() {
            driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
            return this;
        }

        public RegistrationPage enterFirstName() {
            WebElement firstNameInput = driver.findElement(firstNameLocator);
            firstNameInput.sendKeys(faker.name().firstName());
            return this;
        }

        public RegistrationPage enterLastName() {
            WebElement lastNameInput = driver.findElement(lastNameLocator);
            lastNameInput.sendKeys(faker.name().lastName());
            return this;
        }

        public RegistrationPage enterEmail() {
            WebElement emailInput = driver.findElement(emailLocator);
            emailInput.sendKeys(faker.internet().emailAddress());
            return this;
        }

        public RegistrationPage enterTelephone() {
            WebElement telephoneInput = driver.findElement(telephoneLocator);
            telephoneInput.sendKeys(faker.phoneNumber().cellPhone());
            return this;
        }

        public RegistrationPage enterPassword() {
            password = faker.internet().password(8, 16);
            WebElement passwordInput = driver.findElement(passwordLocator);
            passwordInput.sendKeys(password);
            WebElement confirmPasswordInput = driver.findElement(confirmPasswordLocator);
            confirmPasswordInput.sendKeys(password);
            return this;
        }


        public RegistrationPage clickPrivacyPolicyCheckbox() {
            WebElement privacyPolicyCheckbox = driver.findElement(privacyPolicyCheckboxLocator);
            privacyPolicyCheckbox.click();
            return this;
        }

        public void clickContinueButton() {
            WebElement continueButton = driver.findElement(continueButtonLocator);
            continueButton.click();
        }

    }




