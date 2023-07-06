package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LocalityPage;

public class StoreLocationSelectionTests extends AbstractBaseTest {

    @Test
    @Description("/ TR-8 / Test case 1.Сheck store location selection")
    public void checkStoreLocationSelection() {
        HomePage homePage = new HomePage(driver);
        LocalityPage localityPage = new LocalityPage(driver);
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

        softAssert.assertEquals(localityPage.getActualSelectedStoreAddress().getAttribute("title"),
                selectStoreAddress, "Selected store address is not matching");

        localityPage
                .clickCloseRegionalBannerBtn()
                .clickProfitablyBuyBtn();

        String storeAddressForDelivery = localityPage.getYourStoreAddressForDelivery().getText();

        softAssert.assertEquals(storeAddressForDelivery,
                localityPage.getActualSelectedStoreAddress().getAttribute("title"),
                "Store Address for delivery is not matching");

        localityPage
                .clickBuyBtn("1");

        softAssert.assertEquals(localityPage.getStoreAddressInCart().getAttribute("title"),
                storeAddressForDelivery, "Store Address in cart is not matching");

        localityPage
                .clickCompletePurchaseBtn();

        softAssert.assertEquals(localityPage.getPlaceholderStoreAddressForOrdering().getAttribute("placeholder"),
                "Вінниця", "Address is not matching");
        softAssert.assertAll();
    }
}
