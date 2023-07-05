package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ProductCardPage;
import pages.RegisterPage;
import pages.ShopPage;

public class FilteringOfProductsTest extends AbstractBaseTest {

    @Test
    @Description("/TR-1 / Test Case 1. Filtering of products according to certain parameters.")
    public void checkFilteringOfProducts() {
        HomePage homePage = new HomePage(driver);
        ShopPage shopPage = new ShopPage(driver);
        ProductCardPage productCardPage = new ProductCardPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        SoftAssert softAssert = new SoftAssert();

        homePage
                .catalogOpenBtnClick()
                .clickOnCategoryTittle("Побутова техніка");

        shopPage
                .clickOnCategory("Пральні машини")
                .clickOnProductBrand("Samsung", "/brand-samsung/");

        for (WebElement element : shopPage.getListOfProduct()) {
            softAssert.assertTrue(element.getText().contains("Samsung"),
                    "Product filtering by the selected brand doesn't work correctly");
        }

        shopPage
                .entryMinPrice("17000")
                .entryMaxPrice("25000");

        int minRange = 17000;
        int maxRange = 25000;

        for (WebElement element : shopPage.getPriceOfProducts()) {
            String str = element.getAttribute("title").replace("Ціна:", "")
                    .replace("₴", "").replaceAll(" ", "");
            int price = Integer.parseInt(str);
            softAssert.assertTrue(minRange <= price && price <= maxRange,
                    "Product filtering by price doesn't work correctly");
        }

        shopPage
                .openSpinSpeedMenu()
                .selectSpinSpeed("1100-1200");

        for (WebElement el : shopPage.getCardCharacteristics()) {
            String s = el.getText().replace("Швидкість віджимання (max): ", "")
                    .replaceAll(" ", "");
            int speed = Integer.parseInt(s);
            softAssert.assertTrue(1100 <= speed && speed <= 1200,
                    "Product filtering by speed doesn't work correctly");
        }

        shopPage.clickOnFirstProductCard();
        productCardPage.clickWishlistBtn();

        softAssert.assertTrue(registerPage.getLoginPopUp().isDisplayed(), "Login popup is not displayed");

        registerPage.closePopUpBtn();

        softAssert.assertTrue(homePage.getHeaderLogo().isDisplayed(), "Login popup is not closed");

        softAssert.assertAll();
    }
}
