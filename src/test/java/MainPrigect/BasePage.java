package MainPrigect;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public  abstract class BasePage {
    protected static WebDriver driver;

    protected static final String baseUrl = "https://ok.ru";
    protected static final String NAME_RADIO = "Моё радио";
    protected static final String NAME_MUSIC = "Моя музыка";


    public BasePage(WebDriver driver) {
        this.driver = driver;
        check();
    }

    protected abstract void check();

    protected static boolean isElementVisible(By by) {
        try {
            return driver.findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected static void checkVisibleElement(String message, By element) {
        final By el = element;
        Assert.assertTrue(message,
                new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver d) {
                        return isElementVisible(el);
                    }
                }));
    }

}
