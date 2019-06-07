package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MusicPage extends BasePage {
    private static final By partOfMusic = By.className("mml_cat_li");

    public MusicPage(WebDriver driver) {
        super(driver);
    }

    public List<CardListMusic> findMenu() {
        List<WebElement> elements = driver.findElements(partOfMusic);
        return CardListTransformer.wrap(elements);
    }

    private void clickOnMenu (String name) {
        for (CardListMusic element : findMenu()) {
            if (name.equals(element.getName())) {
                element.element.click();
            }
            //System.out.println(element.getName());
        }
    }
    public MyMusicPage clickMyMusic(){
        clickOnMenu(BasePage.NAME_MUSIC);
        return new MyMusicPage(driver);
    }

    public CatalogPage clickCatalog() {

        clickOnMenu(BasePage.NAME_MUSIC);
        return new CatalogPage(driver);
    }

    public CatalogPageSearch clickCatalogSearch(){
        clickOnMenu(BasePage.NAME_CATALOG);
        return new CatalogPageSearch(driver);
    }

    public RadioPage clickRadio() {
        clickOnMenu(BasePage.NAME_RADIO);
        return new RadioPage(driver);
    }



    @Override
    public void check() {
        checkVisibleElement("no element in Music menu", partOfMusic);
    }

}
