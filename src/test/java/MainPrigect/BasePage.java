package MainPrigect;

import com.google.common.base.Preconditions;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    protected final WebDriver driver;
    protected final String baseUrl = "https://ok.ru";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        check();
    }

    protected abstract void check();

    protected boolean isElementVisible(By by) {
        try {
            driver.findElement(by).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected void checkVisibleElement(String message, By element) {
        final By el = element;
        Assert.assertTrue(message,
                new WebDriverWait(driver, 30).until(new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver d) {
                        return isElementVisible(el);
                    }
                }));
    }

}
