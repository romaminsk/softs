package step;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pageobject.StartPage;
import util.CustomLogger;
import util.WaitUtils;

public class StartStep extends BaseStep {

    public StartStep() {
    }

    StartPage startPage = new StartPage();

    public boolean isWhyGoDisplayed() {
        WebElement whyGo = startPage.getWhyGoHref();
        WaitUtils.waitForElementVisible(whyGo);
        CustomLogger.info("Checking is Why Go displayed");
        return whyGo.isDisplayed();
    }

    public boolean isGettingStartedDisplayed() {
        WebElement getStart = startPage.getGettingStartedHref();
        WaitUtils.waitForElementVisible(getStart);
        CustomLogger.info("Checking is Getting Started displayed");
        return getStart.isDisplayed();
    }

    public boolean isDiscoverPackagesDisplayed() {
        WebElement discover = startPage.getDiscoverPackagesHref();
        WaitUtils.waitForElementVisible(discover);
        CustomLogger.info("Checking is Discover Packages displayed");
        return discover.isDisplayed();
    }

    public boolean isAboutDisplayed() {
        WebElement about = startPage.getAboutHref();
        WaitUtils.waitForElementVisible(about);
        CustomLogger.info("Checking is About displayed");
        return about.isDisplayed();
    }

    public void fillSearchField(String searchWord) {
        WebElement search = startPage.getSearchField();
        WaitUtils.waitForElementVisible(search);
        CustomLogger.info("Setting search field");
        search.sendKeys(searchWord);
    }

    public void clickSearchField() {
        WebElement search = startPage.getSearchField();
        WaitUtils.waitForElementVisible(search);
        CustomLogger.info("Clicking ENTER");
        search.sendKeys(Keys.ENTER);
    }

}
