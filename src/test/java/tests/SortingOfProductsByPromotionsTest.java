package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.HomePage;

public class SortingOfProductsByPromotionsTest extends AbstractBaseTest {
    @Test
    @Description("TR-15/Test Case 3. Sorting of products by promotions.")
    public void checkSortingOfProductByPromotions() {

        HomePage homePage = new HomePage(driver);
        homePage
                .clickSearchField("глобус")
                .clickSearchBtn();

    }
}