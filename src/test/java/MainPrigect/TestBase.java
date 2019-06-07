package MainPrigect;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    protected static final String baseUrl = "https://ok.ru";
    protected WebDriver driver;


    @Before
    public void setUp() throws Exception{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseUrl + "/");
    }
    /*public WebDriver init() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
        return driver;
    }*/
}
