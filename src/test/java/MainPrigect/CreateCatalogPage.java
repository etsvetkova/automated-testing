package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreateCatalogPage extends BasePage {
    private static final By newCatalogName = By.xpath(".//*[@class='it vl_it']");
    private static final By buttonCreate = By.xpath(".//*[@class='vl_btn']");
    private static final By form = By.xpath(".//*[@class='form-actions']");

    private static final String CATALOG_NAME = "MY NEW CATALOG";

    private static final By partOfBox = By.xpath(".//*[@class='mml_subcat_btn ']");


    public CreateCatalogPage(WebDriver driver) {
        super(driver);
    }

    public void createNewCatalog () {
        driver.findElement(newCatalogName).sendKeys(CATALOG_NAME);
        driver.findElement(form).findElement(buttonCreate).click();
    }

    public List<CardBoxMusic> findAllCatalogs() {
        List<WebElement> elements = driver.findElements(partOfBox);
        System.out.println(elements.size());
        return CardBoxTransformer.wrap(elements);
    }

    public WorkWithCatalogPage checkCatalog () {
        for (CardBoxMusic element : findAllCatalogs()) {
            if (CATALOG_NAME.equals(element.getName())) {
                element.element.isDisplayed();
                element.element.click();
                //
                //
                System.out.println("OK");
            }
        }
        return new WorkWithCatalogPage(driver);
    }

    public void check() {
        checkVisibleElement("No field with new Name", newCatalogName);
        checkVisibleElement("No button create", form);
    }
}
