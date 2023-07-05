package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ShopPage;

public class ProductComparisonTest extends AbstractBaseTest {
    public static final String IPHONE = "iPhone 14 Pro Max";
    public static final String SAMSUNG = "Samsung Galaxy S23 Ultra";

    @Test
    public void checkStoreLocationSelection() {
        HomePage homePage = new HomePage(driver);
        ShopPage shopPage = new ShopPage(driver);

        homePage
                .clickConfirmationOfLocationButton()
                .sendKeysSearchField(IPHONE)
                .clickSearchBtn();

        shopPage
                .clickFirstIphoneItemInListCompare()
                .clickCompareIcon()
                .clickAddMoreButton();

        homePage
                .sendKeysSearchField(SAMSUNG)
                .clickSearchBtn();

        shopPage
                .clickFirstSamsungItemInListCompare()
                .clickCompareIcon()
                .clickCompareButton()
                .clickThoseThatDifferBtn()
                .clickAddModel()
                .clickSecondItemInListCompare()
                .clickCompareIcon()
                .clickCompareButton()
                .clickClearList();

        String pageSource = getPageSource();
        Assert.assertTrue(pageSource.contains("Вибачте, але Ви ще нічого не додали в порівняння"), "Вибачте, але Ви ще нічого не додали в порівняння");
    }
}
