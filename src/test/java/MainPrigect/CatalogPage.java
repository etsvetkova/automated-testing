package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage extends BasePage  {
    private static final By createCatalog = By.xpath(".//*[@class='mml_subcat_li __menu-item']");

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public CreateCatalogPage clickToCreateCatalog () {
        driver.findElement(createCatalog).click();
        return new CreateCatalogPage(driver);
    }

    public void check() {
        checkVisibleElement("No element create catalog", createCatalog);
    }
}
