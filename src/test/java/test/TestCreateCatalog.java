package test;

import MainPrigect.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestCreateCatalog extends TestBase{
    @Test
    public void testCreateCatalog() {
        LoginPage loginPage = new LoginPage(driver);
        UserMainPage userMainPage = loginPage.login();
        MusicPage musicPage = userMainPage.clickToMusic();
        CatalogPage catalogPage = musicPage.clickCatalog();
        CreateCatalogPage createCatalogPage = catalogPage.clickToCreateCatalog();
        WorkWithCatalogPage workWithCatalogPage = createCatalogPage.createNewCatalog();
        Assert.assertTrue("Cборник не был создан", workWithCatalogPage.checkCreateCatalog());

       // WorkWithCatalogPage workWithCatalogPage = createCatalogPage.checkCatalog();
         DeleteCatalogPage deleteCatalogPage = workWithCatalogPage.setDeleteCatalog();
         deleteCatalogPage.delete();
    }
}
