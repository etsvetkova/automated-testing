package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CardListMyCatalog {
    public WebElement elements;
    private static final By NAME_My_CARD = By.className("mml_ucard_n_f");

    public CardListMyCatalog (WebElement element) {
        this.elements = element;
    }

    public String getName() {
        return elements.findElement(NAME_My_CARD).getText();
    }
}
