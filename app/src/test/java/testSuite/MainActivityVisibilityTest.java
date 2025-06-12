package testSuite;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import edu.upb.lp.test.activities.MainActivity;
import io.appium.java_client.AppiumDriver;
import test.session.Session;
import org.junit.Assert;
public class MainActivityVisibilityTest {
    private AppiumDriver driver;
    private MainActivity mainActivity;

    @Before
    public void setUp() {
        driver = Session.getInstance().getDevice();
        mainActivity = new MainActivity(driver);
    }

    @Test
    public void testButtonsVisibility() {
        Assert.assertTrue("Los botones no son visibles", mainActivity.isButtonsVisible());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
