package MainPrigect;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgectTests {
    @Test
    public void Test1() {

        WebDriver driver = new ChromeDriver();
        driver.get(BasePage.baseUrl);

        LoginPage loginPage = new LoginPage(driver);
        UserMainPage userMainPage = loginPage.login();
        MusicPage musicPage = userMainPage.clickToMusic();
        RadioPage radioPage = musicPage.clickRadio(BasePage.NAME_RADIO);
        radioPage.clickOnButtonPlay();
        radioPage.checkVisibleButtonsPause();
    }

    @Test
    public void Test2() {
        WebDriver driver = new ChromeDriver();
        driver.get(BasePage.baseUrl);

        LoginPage loginPage = new LoginPage(driver);
        UserMainPage userMainPage = loginPage.login();
        MusicPage musicPage = userMainPage.clickToMusic();
        CatalogPage catalogPage = musicPage.clickCatalog(BasePage.NAME_MUSIC);
        CreateCatalogPage createCatalogPage = catalogPage.clickToCreateCatalog();
        //createCatalogPage.createNewCatalog();
    }



}
