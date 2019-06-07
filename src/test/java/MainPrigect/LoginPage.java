package MainPrigect;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    //TODO: вставить свой, бот не работает
    private String userName = "89818031004";
    private String userPassword = "15spgpfo";

    private static final By loginField = By.id("field_email");
    private static final By passwordField = By.id("field_password");
    private static final By submitButton = By.xpath(".//input[@value='Войти']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public UserMainPage login() {

        driver.findElement(loginField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(userPassword);
        driver.findElement(submitButton).click();
        return new UserMainPage(driver);
    }

    @Override
    public void check() {
       checkVisibleElement("not button", submitButton);
    }

}
