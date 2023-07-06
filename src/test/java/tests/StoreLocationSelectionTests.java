package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

public class StoreLocationSelectionTests extends AbstractBaseTest {

    @Test
    @Description("/ TR-8 / Test case 1.Сheck store location selection")
    public void checkStoreLocationSelection() {
        HomePage homePage = new HomePage(driver);
        LocalityPage localityPage = new LocalityPage(driver);
        ShopPage shopPage = new ShopPage(driver);
        ProductCardPage productCardPage = new ProductCardPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        OrderMakingPage orderMakingPage = new OrderMakingPage(driver);
        SoftAssert softAssert = new SoftAssert();

        homePage
                .clickConfirmationOfAnotherLocationButton();
        localityPage
                .enterCityName("Рівне")
                .clickLocalityOfCity("1");

        softAssert.assertTrue(localityPage.getStoreAddressOfSelectedLocality().getText().contains("Рівне"),
                "Location filter doesn't work correctly 1.");

        localityPage
                .enterCityName("Вінниця")
                .clickLocalityOfCity("1");

        softAssert.assertTrue(localityPage.getStoreAddressOfSelectedLocality().getText().contains("Вінниц"),
                "Location filter doesn't work correctly 2.");

        String selectStoreAddress = localityPage.getStoreAddressOfSelectedLocality().getText();

        localityPage
                .clickSelectStoreBtn("1");

        softAssert.assertEquals(localityPage.getTextActualSelectedStoreAddress(),
                selectStoreAddress, "Selected store address is not matching");

        shopPage
                .clickCloseRegionalBannerBtn()
                .clickProfitablyBuyBtn();

        String storeAddressForDelivery = productCardPage.getTextFromYourStoreAddressForDelivery();

        softAssert.assertEquals(storeAddressForDelivery,
                productCardPage.getActualSelectedStoreAddress().getAttribute("title"),
                "Store Address for delivery is not matching");

        productCardPage
                .clickBuyBtn("1");

        softAssert.assertEquals(shoppingCartPage.getStoreAddressInCart().getAttribute("title"),
                storeAddressForDelivery, "Store Address in cart is not matching");

        shoppingCartPage
                .clickCompletePurchaseBtn();

        softAssert.assertEquals(orderMakingPage.getPlaceholderStoreAddressForOrdering().getAttribute("placeholder"),
                "Вінниця", "Address is not matching");
        softAssert.assertAll();
    }
}
