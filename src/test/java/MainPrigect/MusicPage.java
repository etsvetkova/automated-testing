package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MusicPage extends BasePage {
    private static final By partOfMusic = By.className("mml_cat_li");
    private static final By BUTTON_MY_RADIO = By.xpath(".//*[@id='lmSecm_sec_my_radio']");//.//*[@class='mml_cat_li']//*[contains(text(),'Моё радио')]");

    protected final String NAME_MUSIC = "Моя музыка";
    protected final String NAME_CATALOG = "Сборники";

    public MusicPage(WebDriver driver) {
        super(driver);
    }

    public RadioPage clickRadio() {
        driver.findElement(BUTTON_MY_RADIO).click();
        return new RadioPage(driver);
    }

    @Override
    public void check() {
        checkVisibleElement("no element in Music menu", BUTTON_MY_RADIO);
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
        clickOnMenu(NAME_MUSIC);
        return new MyMusicPage(driver);
    }

    public CatalogPage clickCatalog() {

        clickOnMenu(NAME_MUSIC);
        return new CatalogPage(driver);
    }

    public CatalogPageSearch clickCatalogSearch(){
        clickOnMenu(NAME_CATALOG);
        return new CatalogPageSearch(driver);
    }



}
