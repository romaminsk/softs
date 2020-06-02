package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProtocPage extends BasePage {

    public ProtocPage() {
    }

    @FindBy(xpath = "//a[contains(@role, 'tab')and normalize-space(text()) = 'Doc']")
    private WebElement docTab;

    @FindBy(xpath = "//a[contains(@role, 'tab')and normalize-space(text()) = 'Overview']")
    private WebElement overviewTab;

    @FindBy(xpath = "//a[contains(@role, 'tab')and normalize-space(text()) = 'Subdirectories']")
    private WebElement subdirectoriesTab;

    @FindBy(xpath = "//a[contains(@role, 'tab')and normalize-space(text()) = 'Versions']")
    private WebElement versionsTab;

    @FindBy(xpath = "//a[contains(@role, 'tab')and normalize-space(text()) = 'Imports']")
    private WebElement importsTab;

    @FindBy(xpath = "//a[contains(@role, 'tab')and normalize-space(text()) = 'Imported By']")
    private WebElement importedByTab;

    @FindBy(xpath = "//a[contains(@role, 'tab')and normalize-space(text()) = 'Licenses']")
    private WebElement licensesTab;

    @FindBy(xpath = "//span[contains(@class, 'DetailsHeader-infoLabelTitle') and text() = 'Published:']/following-sibling::strong")
    private WebElement publishedText;

    @FindBy(xpath = "//div[@class='DetailsHeader-version']")
    private WebElement versionText;

    @FindBy(xpath = "//span[contains(@class, 'DetailsHeader-infoLabelTitle') and text() = 'Module: ']/following-sibling::span/a")
    private WebElement moduleText;

    public WebElement getDocTab() {
        return docTab;
    }

    public WebElement getOverviewTab() {
        return overviewTab;
    }

    public WebElement getSubdirectoriesTab() {
        return subdirectoriesTab;
    }

    public WebElement getVersionsTab() {
        return versionsTab;
    }

    public WebElement getImportsTab() {
        return importsTab;
    }

    public WebElement getImportedByTab() {
        return importedByTab;
    }

    public WebElement getLicensesTab() {
        return licensesTab;
    }

    public WebElement getPublishedText() {
        return publishedText;
    }

    public WebElement getVersionText() {
        return versionText;
    }

    public WebElement getModuleText() {
        return moduleText;
    }

}
