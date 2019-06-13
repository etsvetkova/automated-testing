package MainPrigect;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPageSearch extends BasePage {
    public CatalogPageSearch(WebDriver driver) {
        super(driver);
    }

    private static final By SEARCH = By.xpath(".//*[@class='search-input_it it']" );
    private static final By SEARCH_CATALOG = By.xpath(".//*[@class='vl_btn']");

    public CatalogPageSearch searchCatalog (String name) {
        Assert.assertTrue("Нет поля поиска ",isElementVisible(SEARCH));
        driver.findElement(SEARCH).clear();
        driver.findElement(SEARCH).sendKeys(name);
        driver.findElement(SEARCH_CATALOG).click();

        return this;
    }

    public FoundedCatalog openCatalog(String catalogName){
        searchCatalog(catalogName);
        return new FoundedCatalog(driver);
    }



    public void check() {
       checkVisibleElement("No element search", SEARCH);
    }
}

