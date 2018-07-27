package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.PropertiesLoader;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;
import utilities.UtilitiesFunctions;

import java.util.Properties;

public abstract class BasePage {
    private static String baseUrl;
    private static String language;
    protected String relativeUrl;
    protected static final Logger log = LogManager.getLogger(Logger.class.getName());
    private static String baseUrl;
    private static String language;
    protected String relativeUrl;
    private PropertiesLoader propertiesLoader;
    private WebDriver driver;


    public BasePage(WebDriver driver) {
        propertiesLoader = new PropertiesLoader();
        baseUrl = propertiesLoader.getBaseUrl();
        language = propertiesLoader.getLanguage();
        this.driver = driver;

        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);

        log.debug(getClass().getName() + " -> Initializing elements");
    }

    public abstract boolean isInitialized();

    public void goTo() {
        driver.navigate().to(getUrl());
        log.info("Navigating to: " + getClass().getName());
    }

    public String getUrl() {
        return baseUrl + "/" + language + "/" + relativeUrl;
    }
}