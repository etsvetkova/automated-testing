package test;

import MainPrigect.*;
import org.junit.Assert;
import org.junit.Test;

public class TestPlayRadio extends TestBase {
    @Test
    public void testPlayRadio() {
        LoginPage loginPage = new LoginPage(driver);;
        UserMainPage userMainPage = loginPage.login();
        MusicPage musicPage = userMainPage.clickToMusic();
        RadioPage radioPage = musicPage.clickRadio();
        radioPage.clickOnButtonPlay();
        Assert.assertTrue("Нет кнопки паузы на контроллере", radioPage.checkVisibleControlsButtonPause());
        Assert.assertTrue("Нет кнопки паузы на альбоме", radioPage.checkVisibleAlbumButtonPause());
        Assert.assertTrue("Нет кнопки паузы на песне", radioPage.checkVisibleButtonPause());
    }
}
