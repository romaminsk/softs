import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import step.StartStep;

public class StartPageTest extends BaseTest {

    private StartStep startStep;

    @BeforeClass
    public void preparationForTest() {
        startStep = new StartStep();
    }

    @Test
    public void checkStartPageElements() {
        Assert.assertTrue(startStep.isWhyGoDisplayed());
        Assert.assertTrue(startStep.isGettingStartedDisplayed());
        Assert.assertTrue(startStep.isDiscoverPackagesDisplayed());
        Assert.assertTrue(startStep.isAboutDisplayed());
    }
}
