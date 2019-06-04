package MainPrigect;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserMainPage extends BasePage {

    private static final By musicLocator = By.xpath("//*[contains(text(), 'Музыка')]");

    public UserMainPage(WebDriver driver) {
        super(driver);
    }

    public MusicPage clickToMusic() {
        driver.findElement(musicLocator).click();
        return new MusicPage(driver);
    }

    @Override
    public void check() {
        checkVisibleElement("No button Music", musicLocator);
    }
}
