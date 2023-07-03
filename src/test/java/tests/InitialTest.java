package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class InitialTest extends AbstractBaseTest {

    @Test
    public void elementaryTest() {
    HomePage homePage = new HomePage(driver);

        homePage.logoBtnClick();

    }
}
