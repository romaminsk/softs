package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

    public StartPage() {
    }

    @FindBy(xpath = "//li[@class='Header-menuItem ']//following-sibling::a[@title='Solutions']")
    private WebElement whyGoHref;

    @FindBy(xpath = "//li[@class='Header-menuItem ']//following-sibling::a[@title='Learn']")
    private WebElement gettingStartedHref;

    @FindBy(xpath = "//li[@class='Header-menuItem ']//following-sibling::a[@title='Explore']")
    private WebElement discoverPackagesHref;

    @FindBy(xpath = "//li[@class='Header-menuItem ']//following-sibling::a[contains(@href, 'https://go.dev/about') and text() = 'About']")
    private WebElement aboutHref;

    @FindBy(xpath = "//input[@class='SearchForm-input SearchForm-input--white']")
    private WebElement searchField;

    public WebElement getWhyGoHref() {
        return whyGoHref;
    }

    public WebElement getGettingStartedHref() {
        return gettingStartedHref;
    }

    public WebElement getDiscoverPackagesHref() {
        return discoverPackagesHref;
    }

    public WebElement getAboutHref() {
        return aboutHref;
    }

    public WebElement getSearchField() {
        return searchField;
    }

}
