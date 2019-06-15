package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    //TODO: вставить свой, бот не работает
    private String USER_NAME = "";
    private String USER_PASSWORD = "";

    private static final By LOGIN_FIELD = By.id("field_email");
    private static final By PASSWORD_FIELD = By.id("field_password");
    private static final By SUBMIT_BUTTON = By.xpath(".//input[@value='Войти']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public UserMainPage login() {

        driver.findElement(LOGIN_FIELD).sendKeys(USER_NAME);
        driver.findElement(PASSWORD_FIELD).sendKeys(USER_PASSWORD);
        driver.findElement(SUBMIT_BUTTON).click();
        return new UserMainPage(driver);
    }

    @Override
    public void check() {
       checkVisibleElement("not button", SUBMIT_BUTTON);
    }

}
