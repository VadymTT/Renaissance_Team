package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import org.testng.asserts.SoftAssert;
import pages.ShopPage;

public class CheckCartTest extends AbstractBaseTest {
    public static final String MY_ACCOUNT_PAGE_LINK = "https://epicentrk.ua/ua/personal/order/make/";
    public static final String IPHONE = "iPhone 14 Pro Max";

    @Test
    public void checkStoreLocationSelection() {
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        SoftAssert softAssert = new SoftAssert();
        ShopPage shopPage = new ShopPage(driver);


        homePage
                .clickConfirmationOfLocationButton()
                .sendKeysSearchField(IPHONE)
                .clickSearchBtn();

        shopPage
                .moveToCardInfo()
                .clickBuyButton();

        String selectProductPrice = shopPage.getTextProductPrice();
        softAssert.assertEquals(selectProductPrice, shopPage.getTextProductPriceInCart());

        shopPage
                .clickContinuePurchasing()
                .moveToSecondCardInfo()
                .clickSecondBuyButton();

        String selectSecondProductPrice = shopPage.getTextSecondProductPrice();
        softAssert.assertEquals(selectSecondProductPrice, shopPage.getTextSecondProductPriceInCart());

        String getTextSummaryProductPrice = shopPage.getTextSummaryProductPrice();

        int integerValueProductPrice = Integer.parseInt(selectProductPrice);
        int integerValueSecondProductPrice = Integer.parseInt(selectSecondProductPrice);
        int integerValueSum = Integer.parseInt(getTextSummaryProductPrice);

        softAssert.assertTrue(integerValueProductPrice + integerValueSecondProductPrice == integerValueSum);

        cartPage.
                clickDeleteButton();

        softAssert.assertEquals(selectProductPrice, shopPage.getTextProductPriceInCart());

        cartPage
                .clickCloseButton();

        homePage.
                clickCartIcon();

        cartPage.
                clickDeleteAllProducts()
                .clickRemoveFromCartVerificationCloseBtn()
                .clickDeleteAllProducts()
                .clickNoButtonInVerificationDelete()
                .clickMakePurchase();

        String currentUrl = getCurrentUrl();
        softAssert.assertTrue(currentUrl.equals(MY_ACCOUNT_PAGE_LINK));
        softAssert.assertAll();
    }

}
