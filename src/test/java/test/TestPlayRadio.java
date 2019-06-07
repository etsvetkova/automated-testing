package test;

import MainPrigect.*;
import org.junit.Test;

public class TestPlayRadio extends TestBase {
    @Test
    public void TestPlayRadio() {

        LoginPage loginPage = new LoginPage(driver);;
        UserMainPage userMainPage = loginPage.login();
        MusicPage musicPage = userMainPage.clickToMusic();
        RadioPage radioPage = musicPage.clickRadio();
        radioPage.clickOnButtonPlay();
        radioPage.checkVisibleButtonsPause();
    }
}
