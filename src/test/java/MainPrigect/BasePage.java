package MainPrigect;

import com.google.common.base.Preconditions;
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
    protected static final String NAME_CATALOG = "Сборники";


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
                new WebDriverWait(driver, 20).until(new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver d) {
                        return isElementVisible(el);
                    }
                }));
    }

    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    public boolean explicitWait(final ExpectedCondition<?> condition,
                                long maxCheckTimeInSeconds,
                                long millisecondsBetweenChecks) {
        Preconditions.checkNotNull(condition, "Condition must be not null");
        Preconditions.checkArgument(TimeUnit.MINUTES.toSeconds(1) > maxCheckTimeInSeconds,
                "Max check time in seconds should be less than 3 minutes");
        checkConditionTimeouts(maxCheckTimeInSeconds, millisecondsBetweenChecks);

        try {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            WebDriverWait explicitWait = new WebDriverWait(driver, maxCheckTimeInSeconds, millisecondsBetweenChecks);
            explicitWait.until(condition);
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (driver != null) {
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            } else {
                throw new IllegalArgumentException("Driver shouldnt be null");
            } }
    }
    private void checkConditionTimeouts(long maxCheckTimeInSeconds, long millisecondsBetweenChecks) {
        Preconditions.checkState(maxCheckTimeInSeconds > 0,
                "maximum check time in seconds must be not 0");
        Preconditions.checkState(millisecondsBetweenChecks > 0,
                "milliseconds count between checks must be not 0");
        Preconditions.checkState(millisecondsBetweenChecks < (maxCheckTimeInSeconds * 1000),
                "Millis between checks must be less than max seconds to wait");
    }



}
