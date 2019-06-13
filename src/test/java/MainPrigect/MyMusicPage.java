package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyMusicPage extends BasePage {
    private static final By CATALOG_CARD =  By.xpath(".//div[@class='mml_subcat_btn ']");

    public MyMusicPage(WebDriver driver) {
        super(driver);
    }

    public List<CardListMyCatalog> deletemusic() {
        List<WebElement> element_music = driver.findElements(CATALOG_CARD);

        return CardListMyTransformer.wrapMyCtalog(element_music);
    }
    private void clickOnMyCatalog(String name) {
        for (CardListMyCatalog element : deletemusic()) {
            if (name.equals(element.getName())) {
                element.elements.click();
            }
        }
    }
    public FoundedCatalog clickChooseCatalog(String name) {
        clickOnMyCatalog(name);
        return new FoundedCatalog(driver);
    }


    @Override
    public void check(){
        checkVisibleElement("не видно карту коллекции",CATALOG_CARD);

    }
}
