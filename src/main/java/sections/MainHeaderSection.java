package sections;

import base.SectionBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class MainHeaderSection extends SectionBase {

    @FindBy(css = ".nav-link-holder--user-details .dropdown-toggle")
    WebElement profileDropdown;

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li/a[contains(text(), 'Logout')]")
    WebElement logOutButton;

    public void logOut() {
        clickProfileDropdown();
        logOutButton.click();
        log.info("Selecting Log Out button");
    }

    public void clickProfileDropdown() {
        profileDropdown.click();
        log.info("Expanding profile dropdown");
    }
}
