package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorkWithCatalogPage extends BasePage {
    private static final By deleteCatalog = By.xpath(".//*[@class='mus-dl']//*[contains(text(),'Удалить сборник')]");
    private static final By partOfBox = By.xpath(".//*[@class='mml_subcat_btn ']");

    private final String CATALOG_NAME = "MY NEW CATALOG";

    public WorkWithCatalogPage(WebDriver driver) {
        super(driver);
    }

    public List<CardBoxMusic> findAllCatalogs() {
        List<WebElement> elements = driver.findElements(partOfBox);
        System.out.println(elements.size());
        return CardBoxTransformer.wrap(elements);
    }

    public boolean che() {
        boolean check = false;
        for (CardBoxMusic element : findAllCatalogs()) {
            if (CATALOG_NAME.equals(element.getName())) {
                check = element.element.isDisplayed();
                element.element.click();
            }
            System.out.println(element.getName());
        }
        return check;
    }

    public boolean checkCreateCatalog() {
        driver.navigate().refresh();
        if (!findAllCatalogs().isEmpty()) {
            return che();
        } else {
            System.out.println("я зашёл сюда");
            return false;
        }
    }

    public DeleteCatalogPage setDeleteCatalog() {
        driver.findElement(deleteCatalog).click();
        return new DeleteCatalogPage(driver);
    }

    public void check() {
        System.out.println("метод check");
        checkVisibleElement("No element Delete", deleteCatalog);
    }
}
