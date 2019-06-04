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
        }
    }

    public RadioPage clickRadio(String name) {
        clickOnMenu(name);
        return new RadioPage(driver);
    }

    public CatalogPage clickCatalog(String name) {
        clickOnMenu(name);
        return new CatalogPage(driver);
    }

    @Override
    public void check() {
        checkVisibleElement("no element in Music menu", partOfMusic);
    }

}
