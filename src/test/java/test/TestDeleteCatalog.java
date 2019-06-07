package test;

import MainPrigect.*;
import org.junit.Test;

public class TestDeleteCatalog extends TestBase {
    private String albumName;

    @Test
    public void testDelete(){
        albumName = "Лето";
        LoginPage loginPage = new LoginPage(driver);
        UserMainPage userMainPage = loginPage.login();
        MusicPage musicPage = userMainPage.clickToMusic();
        MyMusicPage myMusicPage = musicPage.clickMyMusic();
        FoundedCatalog foundedCatalog = myMusicPage.clickChooseCatalog(albumName);
        DeleteLayer deleteLayer = foundedCatalog.DeleteNewCatalog();
        foundedCatalog = deleteLayer.sendDelete();
    }

}
