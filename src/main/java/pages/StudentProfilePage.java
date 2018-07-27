package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ngelements.NGTextBlock;
import org.openqa.selenium.support.FindBy;

public final class StudentProfilePage extends BasePage {

    @FindBy(id = "consumer-teaching-group")
    private NGTextBlock studentProfileDescription;

    public StudentProfilePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isInitialized() {
        return studentProfileDescription.isDisplayed();
    }
}
