package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Description;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ShopPage;

import java.util.ArrayList;
import java.util.List;

public class SortingOfGoodsTest extends AbstractBaseTest {

    @Test
    @Description("/ TR-13 / Test Case 3. Сheck the sorting of goods.")
    public void sortingOfGoodsTest() {
        HomePage homePage = new HomePage(driver);
        ShopPage shopPage = new ShopPage(driver);
        SoftAssert softAssert = new SoftAssert();

        homePage
                .сlickConformationOfLocationBtn()
                .catalogOpenBtnClick()
                .clickOnCategoryTittleBtn("Ремонт");

        shopPage
                .clickOnSubcategoryTitleBtn("Будівельні матеріали")
                .clickSectionTitleOfSubcategoryBtn("Цегла");

        softAssert.assertTrue(getCurrentUrl().contains("shop/kirpich/"),
                "User is redirected on the wrong page");

        if (shopPage.getCloseActionSliderBtn().isDisplayed()) {
            shopPage.clickCloseActionSliderBtn();
        }

        shopPage
                .clickSectionTitleOfSubcategoryBtn("Цегла облицювальна")
                .clickOnSortingPanelOptionBtn("дешеві");

        int lastPage = shopPage.getLastPageBtn();

        List<WebElement> listPrice;

        for (int i = 0; i < lastPage - 1; i++) {
            try {
                listPrice = shopPage.getListOfProductPriceRow();
            } catch (TimeoutException e) {
                break;
            }
            List<Double> dLPrice = new ArrayList<>();

            for (WebElement wElementOfPriceList : listPrice) {
                dLPrice.add(Double.valueOf(wElementOfPriceList.getAttribute("title")
                        .replace("Ціна: ", "").replace(" ₴", "")));
            }

            for (int j = 0; j < dLPrice.size() - 1; j++) {
                softAssert.assertTrue(dLPrice.get(j) <= dLPrice.get(j + 1));
                System.out.println("Сортування від дешевих до дорогих: " + dLPrice.get(j) + "<=" + dLPrice.get(j + 1));
            }

            shopPage.clickNextPaginationBtn();
        }

        shopPage
                .clickFirstPageBtn()
                .clickOnSortingPanelOptionBtn("дорогі");

        for (int i = 0; i < lastPage - 1; i++) {
            try {
                listPrice = shopPage.getListOfProductPriceRow();
            } catch (TimeoutException e) {
                break;
            }

            List<Double> dLPrice = new ArrayList<>();

            for (WebElement wElementOfPriceList : listPrice) {
                dLPrice.add(Double.valueOf(wElementOfPriceList.getAttribute("title")
                        .replace("Ціна: ", "").replace(" ₴", "")));
            }

            for (int j = 0; j < dLPrice.size() - 1; j++) {
                softAssert.assertTrue(dLPrice.get(j) >= dLPrice.get(j + 1));
                System.out.println("Сортування від дорогих до дешевих: " + dLPrice.get(j) + ">=" + dLPrice.get(j + 1));
            }

            shopPage.clickNextPaginationBtn();
        }

        softAssert.assertAll();
    }
}
