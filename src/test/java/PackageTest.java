import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import step.ProtocStep;
import step.StartStep;
import util.JsonDataReader;

import java.util.Map;

public class PackageTest extends BaseTest {

    private static Map<String, String> testData;

    private StartStep startStep;
    private ProtocStep protocStep;

    @BeforeClass
    public void preparationForTest() {
        testData = JsonDataReader.getTestData();
        startStep = new StartStep();
        protocStep = new ProtocStep();
    }

    @Test
    public void checkPackage() {
        startStep.fillSearchField(testData.get("package"));
        startStep.clickSearchField();
        Assert.assertTrue(protocStep.isDocDisplayed());
        Assert.assertTrue(protocStep.isOverviewDisplayed());
        Assert.assertTrue(protocStep.isSubdirectoriesDisplayed());
        Assert.assertTrue(protocStep.isVersionsDisplayed());
        Assert.assertTrue(protocStep.isImportsDisplayed());
        Assert.assertTrue(protocStep.isImportedByDisplayed());
        Assert.assertTrue(protocStep.isLicensesDisplayed());
        String published = String.valueOf(testData.get("published"));
        Assert.assertEquals(protocStep.getPublishedText(), published);
        String version = String.valueOf(testData.get("version"));
        Assert.assertEquals(protocStep.getVersionText(), version);
        String packageData = String.valueOf(testData.get("package"));
        Assert.assertEquals(protocStep.getModuleText(), packageData);
    }

}
