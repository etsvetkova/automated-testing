package test;

import MainPrigect.*;
import org.junit.Test;

public class TestAddCatalog  extends TestBase{
    private String albumName1;

    @Test
    public void testAddCatalog() throws Exception {

        albumName1 = "лето";

        LoginPage loginPage = new LoginPage(driver);
        UserMainPage userMainPage = loginPage.login();
        MusicPage musicPage = userMainPage.clickToMusic();
        CatalogPageSearch catalogPageSearch = musicPage.clickCatalogSearch();
        FoundedCatalog foundedCatalog = catalogPageSearch.openCatalog(albumName1);
        foundedCatalog.AddNewCatalog();
    }
}