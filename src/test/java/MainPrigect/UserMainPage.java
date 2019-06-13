package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserMainPage extends BasePage {

    private static final By MUSIC_LOCATOR = By.xpath("//*[contains(text(), 'Музыка')]");

    public UserMainPage(WebDriver driver) {
        super(driver);
    }

    public MusicPage clickToMusic() {
        driver.findElement(MUSIC_LOCATOR).click();
        return new MusicPage(driver);
    }

    @Override
    public void check() {
        checkVisibleElement("No button Music", MUSIC_LOCATOR);
    }
}
