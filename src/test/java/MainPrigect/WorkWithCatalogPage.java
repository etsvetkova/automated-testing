package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkWithCatalogPage extends BasePage {
    private static final By deleteCatalog = By.xpath(".//*[@class='mus-dl']//*[contains(text(),'Удалить сборник')]");

    public WorkWithCatalogPage(WebDriver driver) {
        super(driver);
    }

    public DeleteCatalogPage setDeleteCatalog() {
        driver.findElement(deleteCatalog).click();
        return new DeleteCatalogPage(driver);
    }

    public void check() {
        checkVisibleElement("No element Delete", deleteCatalog);
    }
}
