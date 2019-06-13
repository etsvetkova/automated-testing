package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CardBoxMusic {
    WebElement element;
    private final By NAME = By.xpath(".//*[@class='mml_ucard_n_f']");

    public CardBoxMusic (WebElement element) {
        this.element = element;
    }

    public String getName() {
        return element.findElement(NAME).getText();
    }
}
