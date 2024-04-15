package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactListLogInPage;

public class LogInTest {

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("https://thinking-tester-contact-list.herokuapp.com");
        ContactListLogInPage logInPage = new ContactListLogInPage(driver);
    logInPage
            .enterEmail("sdatest@tester.com")
          .enterPassword("tester.123")
         .clickLoginButton()
            .clickLoginOut();
    }


//    @Test
//    public void test2(){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
//        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
//        RegistrationPage registrationPage = new RegistrationPage(driver);
//        registrationPage
//                .enterFirstName("q")
//                .enterLastName("wwwww")
//                .enterEmail("njcnjn@gmail.com")
//                .enterTelephone("+699543214707")
//                .enterPassword("12345")
//                .enterConfirmPassword("12345")
//                .clickPrivacyPolicyCheckbox()
//                .clickContinueButton()
//
//        ;
//    }
}


