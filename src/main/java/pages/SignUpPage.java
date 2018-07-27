package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ngelements.NGTextInput;
import org.openqa.selenium.support.FindBy;

public final class SignUpPage extends BasePage {

    @FindBy(id = "user_email")
    private NGTextInput emailInput;

    public SignUpPage(WebDriver driver) {
        super(driver);
        relativeUrl = "register/new";
    }

    @Override
    public boolean isInitialized() {
        return emailInput.isDisplayed();
    }
}
