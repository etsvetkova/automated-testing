package MainPrigect;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioPage extends BasePage {
    private static final By BUTTON_PLAY = By.className("mus_album_i_play");
    private static final By PLAYER_CONTROLS_BUTTON_PAUSE = By.xpath(".//*[@class='mus_player-controls_i __pause']");
    private static final By ALBUM_BUTTON_PAUSE = By.xpath(".//*[@class='mus_album_i_play mus_album_i_play__pause']");

    private static final By ACTIVATY_SONG = By.xpath(".//*[@class = 'mus-tr_i soh-s __active']");
    private static final By BUTTON_PAUSE_ON_SONG = By.xpath(".//*[@class='mus-tr_play __pause']");


    public RadioPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnButtonPlay() {
        driver.findElement(BUTTON_PLAY).click();
    }

    public boolean checkVisibleControlsButtonPause() {
        return isElementVisible(PLAYER_CONTROLS_BUTTON_PAUSE);
    }

    public  boolean checkVisibleAlbumButtonPause() {
        return isElementVisible(ALBUM_BUTTON_PAUSE);
    }

    public boolean checkVisibleButtonPause() {
        return driver.findElement(ACTIVATY_SONG).findElement(BUTTON_PAUSE_ON_SONG).isDisplayed();
    }

   /* public void checkVisibleButtonsPause() {
        checkVisibleElement("No button1", PLAYER_CONTROLS_BUTTON_PAUSE);
        checkVisibleElement("No button2", ALBUM_BUTTON_PAUSE);
        Assert.assertTrue("No button 3",driver.findElement(ACTIVATY_SONG).findElement(BUTTON_PAUSE_ON_SONG).isDisplayed());
    }*/

    public void check() {
        checkVisibleElement("No button Play", BUTTON_PLAY);
    }
}
