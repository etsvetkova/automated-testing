package MainPrigect;

import MainPrigect.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FoundedCatalog extends BasePage {
    private static final By buttonAdd = By.xpath(".//*[@class='m_c_col-data_add']");
    private static final By buttonDelete = By.className("m_c_col-data_remove");

    public FoundedCatalog(WebDriver driver) {
        super(driver);
    }

    public void AddNewCatalog(){

        checkVisibleElement("Не видит кнопки добавления",buttonAdd);
        driver.findElement(buttonAdd).click();
    }

    public DeleteLayer DeleteNewCatalog(){
        checkVisibleElement("не видит кнопки удаления",buttonDelete);
        driver.findElement(buttonDelete).click();
        return new DeleteLayer(driver);
    }
    @Override
    public void check(){
        }
}
