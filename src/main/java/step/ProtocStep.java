package step;

import org.openqa.selenium.WebElement;
import pageobject.ProtocPage;
import util.CustomLogger;
import util.WaitUtils;

public class ProtocStep extends BaseStep {

    public ProtocStep() {
    }

    ProtocPage protocPage = new ProtocPage();

    public boolean isDocDisplayed() {
        WebElement docTab = protocPage.getDocTab();
        WaitUtils.waitForElementVisible(docTab);
        CustomLogger.info("Checking is Doc displayed");
        return docTab.isDisplayed();
    }

    public boolean isOverviewDisplayed() {
        WebElement overviewTab = protocPage.getOverviewTab();
        WaitUtils.waitForElementVisible(overviewTab);
        CustomLogger.info("Checking is Overview displayed");
        return overviewTab.isDisplayed();
    }

    public boolean isSubdirectoriesDisplayed() {
        WebElement subdirectoriesTab = protocPage.getSubdirectoriesTab();
        WaitUtils.waitForElementVisible(subdirectoriesTab);
        CustomLogger.info("Checking is Subdirectories displayed");
        return subdirectoriesTab.isDisplayed();
    }

    public boolean isVersionsDisplayed() {
        WebElement versionsTab = protocPage.getVersionsTab();
        WaitUtils.waitForElementVisible(versionsTab);
        CustomLogger.info("Checking is Versions displayed");
        return versionsTab.isDisplayed();
    }

    public boolean isImportsDisplayed() {
        WebElement importsTab = protocPage.getImportsTab();
        WaitUtils.waitForElementVisible(importsTab);
        CustomLogger.info("Checking is Imports displayed");
        return importsTab.isDisplayed();
    }

    public boolean isImportedByDisplayed() {
        WebElement importedByTab = protocPage.getImportedByTab();
        WaitUtils.waitForElementVisible(importedByTab);
        CustomLogger.info("Checking is Imported By displayed");
        return importedByTab.isDisplayed();
    }

    public boolean isLicensesDisplayed() {
        WebElement licensesTab = protocPage.getLicensesTab();
        WaitUtils.waitForElementVisible(licensesTab);
        CustomLogger.info("Checking is Licenses displayed");
        return licensesTab.isDisplayed();
    }

    public String getPublishedText() {
        WebElement published = protocPage.getPublishedText();
        WaitUtils.waitForElementVisible(published);
        String publishedText = published.getText();
        CustomLogger.info("Getting published text: " + publishedText);
        return publishedText;
    }

    public String getVersionText() {
        WebElement version = protocPage.getVersionText();
        WaitUtils.waitForElementVisible(version);
        String versionText = version.getText();
        CustomLogger.info("Getting version text: " + versionText);
        return versionText;
    }

    public String getModuleText() {
        WebElement module = protocPage.getModuleText();
        WaitUtils.waitForElementVisible(module);
        String moduleText = module.getText();
        CustomLogger.info("Getting module text: " + moduleText);
        return moduleText;
    }

}
