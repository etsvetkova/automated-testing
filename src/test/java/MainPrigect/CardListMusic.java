package MainPrigect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CardListMusic {
    public WebElement element;
    private final By NAME = By.className("mml_cat_n");

    public CardListMusic (WebElement element) {
        this.element = element;
    }

    public String getName() {
        return element.findElement(NAME).getText();
    }

}
