package MainPrigect;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioPage extends BasePage {
    private static final By buttonPlay = By.className("mus_album_i_play");
    private static final By playerControlsButtonPause = By.xpath(".//*[@class='mus_player-controls_i __pause']");
    private static final By albumButtonPause = By.xpath(".//*[@class='mus_album_i_play mus_album_i_play__pause']");

    private static final By activatySong = By.xpath(".//*[@class = 'mus-tr_i soh-s __active']");
    private static final By buttonPauseOnSong = By.xpath(".//*[@class='mus-tr_play __pause']");


    public RadioPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnButtonPlay() {
        driver.findElement(buttonPlay).click();
    }

    public void checkVisibleButtonsPause() {
        checkVisibleElement("No button1", playerControlsButtonPause);
        checkVisibleElement("No button2", albumButtonPause);
        Assert.assertTrue("No button 3",driver.findElement(activatySong).findElement(buttonPauseOnSong).isDisplayed());
    }

    public void check() {
        checkVisibleElement("No button Play", buttonPlay);
    }
}
