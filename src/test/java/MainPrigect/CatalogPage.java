package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage extends BasePage  {
    private static final By CREATE_CATALOG = By.xpath(".//*[@class='mml_subcat_li __menu-item']");

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public CreateCatalogPage clickToCreateCatalog () {
        driver.findElement(CREATE_CATALOG).click();
        return new CreateCatalogPage(driver);
    }

    public void check() {
        checkVisibleElement("No element create catalog", CREATE_CATALOG);
    }
}
