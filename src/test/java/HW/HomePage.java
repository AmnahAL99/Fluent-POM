package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By welcomeMessageLocator = By.xpath("//h1[@class='page-title my-3']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoaded() {
        return driver.findElement(welcomeMessageLocator).isDisplayed();
    }
}

