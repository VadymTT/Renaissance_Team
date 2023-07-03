package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class StoreLocationSelectionTests extends AbstractBaseTest {

    @Test
    public void checkStoreLocationSelection() {
        HomePage homePage = new HomePage(driver);

        homePage
                .clickConfirmationOfLocationButton();
    }

}
