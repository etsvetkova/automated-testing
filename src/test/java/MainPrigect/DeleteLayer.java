package MainPrigect;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeleteLayer extends BasePage {
    private static final By BUTTON_DELETE = By.xpath(".//span[@class='vl_btn']");
    private static final By BUTTON_CANCEL = By.xpath(".//span[@class='vl_a-sw ml-4x curPointer js-close-layer']");
    public DeleteLayer(WebDriver driver) {super(driver);}

    public FoundedCatalog sendDelete(){
        Assert.assertTrue("Нет кнопки удаления ",isElementVisible(BUTTON_DELETE));
        driver.findElement(BUTTON_DELETE).click();
        return new FoundedCatalog(driver);
    }

    @Override
    public void check(){
        /*Assert.assertTrue("Не прогрузилась кнопка Удалить",
                explicitWait(ExpectedConditions.visibilityOfElementLocated(BUTTON_DELETE),
                        5,300));
        Assert.assertTrue("Не прогрузилась кнопка Отменить",
                explicitWait(ExpectedConditions.visibilityOfElementLocated(BUTTON_CANCEL),
                        5,300));*/
    }
}
