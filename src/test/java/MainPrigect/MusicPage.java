package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MusicPage extends BasePage {
    private static final By partOfMusic = By.className("mml_cat_li");
    private static final By BUTTON_MY_RADIO = By.xpath(".//*[@id='lmSecm_sec_my_radio']");
    private static final By BUTTON_MY_MUSIC = By.xpath(".//*[@id='lmSecm_sec_klass']");

    protected final String NAME_MUSIC = "Моя музыка";
    protected final String NAME_CATALOG = "Сборники";

    public MusicPage(WebDriver driver) {
        super(driver);
    }

    public RadioPage clickRadio() {
        driver.findElement(BUTTON_MY_RADIO).click();
        return new RadioPage(driver);
    }

    public CatalogPage clickCatalog() {
        driver.findElement(BUTTON_MY_MUSIC).click();
        return new CatalogPage(driver);
    }

    @Override
    public void check() {
        checkVisibleElement("no element My radio", BUTTON_MY_RADIO);
        checkVisibleElement("no element My music", BUTTON_MY_MUSIC);
        checkVisibleElement("no", By.xpath(".//*[@class='layer_scr mus-custom-scrolling']"));
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



    public CatalogPageSearch clickCatalogSearch(){
        clickOnMenu(NAME_CATALOG);
        return new CatalogPageSearch(driver);
    }



}
