import driver.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void preparationForTest() {
        driver = WebDriverManager.getDriver();
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.closeDriver();
    }

}
