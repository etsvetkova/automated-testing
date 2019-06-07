package test;

import MainPrigect.*;
import org.junit.Test;

public class TestCreateCatalog extends TestBase{
    @Test
    public void TestCreateCatalog() {
        LoginPage loginPage = new LoginPage(driver);
        UserMainPage userMainPage = loginPage.login();
        MusicPage musicPage = userMainPage.clickToMusic();
        CatalogPage catalogPage = musicPage.clickCatalog();
        CreateCatalogPage createCatalogPage = catalogPage.clickToCreateCatalog();
        createCatalogPage.createNewCatalog();
        WorkWithCatalogPage workWithCatalogPage = createCatalogPage.checkCatalog();
        DeleteCatalogPage deleteCatalogPage = workWithCatalogPage.setDeleteCatalog();
        deleteCatalogPage.delete();
    }
}
