package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreateCatalogPage extends BasePage {
    private static final By NEW_CATALOG_NAME = By.xpath(".//*[@class='it vl_it']");
    private static final By BUTTON_CREATE_CATALOG_NEW = By.xpath(".//*[@class='vl_btn']");
    private static final By FORM = By.xpath(".//*[@class='form-actions']");

    private final String CATALOG_NAME = "MY NEW CATALOG";

    public CreateCatalogPage(WebDriver driver) {
        super(driver);
    }

    public WorkWithCatalogPage createNewCatalog () {
        driver.findElement(NEW_CATALOG_NAME).sendKeys(CATALOG_NAME);
        driver.findElement(FORM).findElement(BUTTON_CREATE_CATALOG_NEW).click();
        return new WorkWithCatalogPage(driver);
    }


    public WorkWithCatalogPage checkCatalog () {
        return new WorkWithCatalogPage(driver);
    }

    public void check() {
        checkVisibleElement("No field with new Name", NEW_CATALOG_NAME);
        checkVisibleElement("No button create", FORM);
    }
}
