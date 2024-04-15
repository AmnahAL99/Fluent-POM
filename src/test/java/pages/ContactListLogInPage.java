package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListLogInPage {
WebDriver ldriver;
By emailById = By.id("email");
By passwordById = By.id("password");

By submitById = By.id("submit");
public ContactListLogInPage(WebDriver gdriver){
    ldriver = gdriver;
}

    public ContactListLogInPage enterEmail(String email) {
        ldriver.findElement(emailById).sendKeys(email);
        return this;
    }

    public ContactListLogInPage enterPassword(String password) {
         ldriver.findElement(passwordById).sendKeys(password);
        return this;
    }

    public ContactListHomePage clickLoginButton() {
         ldriver.findElement(submitById).click();
         return new ContactListHomePage(ldriver);
    }



}
