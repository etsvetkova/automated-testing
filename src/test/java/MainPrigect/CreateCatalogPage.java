package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCatalogPage extends BasePage {
    private static final By newCatalogName = By.xpath(".//*[@class='mus_playlist-add_placeholder']");
    private static final By buttonCreate = By.xpath(".//*[@id='gwt-uid-1720']");
    private static final String CATALOG_NAME = "MY NEW CATALOG";

    public CreateCatalogPage(WebDriver driver) {
        super(driver);
    }

    public void createNewCatalog () {
        driver.findElement(newCatalogName).sendKeys(CATALOG_NAME);
        driver.findElement(buttonCreate).click();
    }

    public void check() {
        //checkVisibleElement("No field with new Name", newCatalogName);
       checkVisibleElement("No button create", buttonCreate);
    }
}
