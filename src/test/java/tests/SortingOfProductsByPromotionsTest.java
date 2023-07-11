package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ShopPage;

import java.util.List;

public class SortingOfProductsByPromotionsTest extends AbstractBaseTest {
    
    @Test
    @Description("TR-15/Test Case 3. Sorting of products by promotions.")
    public void checkSortingOfProductByPromotions() {
        HomePage homePage = new HomePage(driver);
        ShopPage shopPage = new ShopPage(driver);
        SoftAssert softAssert = new SoftAssert();

        homePage
                .clickConsentLocationBtn()
                .entryOnSearchField("глобус")
                .clickSearchBtn();
        
        for (WebElement element : shopPage.getListOfProduct()) {
            softAssert.assertTrue(element.getText().contains("Глобус"),
                    "Search field doesn't work correctly");
        }
        shopPage
                .clickPromotionsBtn();

        List<WebElement> newAmountOfDiscountList = shopPage.getAmountOfDiscount();

        for (int i = 0; i < newAmountOfDiscountList.size() - 1; i++) {
            double priceFirst = Double.parseDouble(newAmountOfDiscountList.get(i).getText().
                    replace("%", "").replace("АКЦІЯ ","").
                    replace("-", ""));
            double priceSecond = Double.parseDouble(newAmountOfDiscountList.get(i + 1).getText().
                    replace("%", "").replace("АКЦІЯ ","").
                    replace("-", ""));

            softAssert.assertTrue(priceFirst >= priceSecond);
            softAssert.assertAll();
        }
    }
}
