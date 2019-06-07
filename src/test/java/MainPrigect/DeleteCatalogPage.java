package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteCatalogPage extends BasePage {

    private static final By deleteButton = By.xpath(".//*[@class='layer_hld mus_playlist-remove']//*[@class='form']//*[contains(text(),'Удалить')]");

    public DeleteCatalogPage(WebDriver driver) {
        super(driver);
    }

    public void delete() {
        driver.findElement(deleteButton).click();
    }

    public void check() {
        checkVisibleElement("No delete button", deleteButton);
    }
}
