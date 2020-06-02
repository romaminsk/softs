package step;

import driver.WebDriverManager;
import org.openqa.selenium.WebDriver;

public abstract class BaseStep {
    
public static WebDriver driver;

    protected BaseStep(){
        driver = WebDriverManager.getDriver();
    }
}
