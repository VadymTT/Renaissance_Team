package tests;

import base.AbstractBaseTest;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ComparePage;
import pages.HomePage;
import pages.ShopPage;

public class ProductComparisonTest extends AbstractBaseTest {

    public static final String IPHONE = "iPhone 14 Pro Max";
    public static final String SAMSUNG = "Samsung Galaxy S23 Ultra";

    @Test
    @Description("TR-6 / Test Case 2.Verify the functionality of product comparison")
    public void checkStoreLocationSelection() {
        HomePage homePage = new HomePage(driver);
        ShopPage shopPage = new ShopPage(driver);
        ComparePage comparePage = new ComparePage(driver);

        homePage
                .clickConfirmationOfLocationButton()
                .sendKeysSearchField(IPHONE)
                .clickSearchButton();

        shopPage
                .clickFirstIphoneItemInListCompare()
                .clickCompareIcon();

        comparePage
                .clickAddMoreButton();

        homePage
                .sendKeysSearchField(SAMSUNG)
                .clickSearchButton();

        shopPage
                .clickFirstSamsungItemInListCompare()
                .clickCompareIcon();

        comparePage
                .clickCompareButton()
                .clickThoseThatDifferButton()
                .clickAddModelButton();

        shopPage
                .clickSecondItemInListCompare()
                .clickCompareIcon();

        comparePage
                .clickCompareButton()
                .clickClearListButton();

        String pageSource = getPageSource();

        Assert.assertTrue(pageSource.contains("Вибачте, але Ви ще нічого не додали в порівняння"), "Вибачте, але Ви ще нічого не додали в порівняння");
    }
}
