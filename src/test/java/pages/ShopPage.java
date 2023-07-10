package pages;

import elements.ShopElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.waitUrlContains;

public class ShopPage extends ShopElements {

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click on category {category}.")
    public ShopPage clickOnCategory(String category) {
        getCategoryByDataAlt(category).click();
        return this;
    }

    @Step("Click on product brand {brand}.")
    public ShopPage clickOnProductBrand(String brand, String brandUrl) {
        getProductBrand(brand).click();
        waitUrlContains(driver, brandUrl);
        return this;
    }

    @Step("Select minimum price on the sorting panel.")
    public ShopPage entryMinPrice(String price) {
        scrollForElement(getMinPriceInput(), driver);
        getMinPriceInput().clear();
        getMinPriceInput().sendKeys(price);
        waitUrlContains(driver, "/price-base-from-" + price);
        return this;
    }

    @Step("Select maximum price on the sorting panel.")
    public ShopPage entryMaxPrice(String price) {
        getMaxPriceInput().clear();
        getMaxPriceInput().sendKeys(price);
        waitUrlContains(driver, "to-" + price);
        return this;
    }

    @Step("Open spin speed drop-down menu.")
    public ShopPage openSpinSpeedMenu() {
        getSpinSpeedDropDown().click();
        sleep(1000);
        return this;
    }

    @Step("Choose spin speed parameter {speed}")
    public ShopPage selectSpinSpeed(String speed) {
        scrollForElement(getSpinSpeedSelect(speed), driver);
        getSpinSpeedSelect(speed).click();
        sleep(1200);
        return this;
    }

    @Step("Click on the first product in the displayed list.")
    public ShopPage clickOnFirstProductCard() {
        getFirstProductCardName().click();
        sleep(1200);
        return this;
    }

    @Step("Click on Close Regional Banner button.")
    public ShopPage clickCloseRegionalBannerBtn() {
        getCloseRegionalBannerBtn().click();
        return this;
    }

    @Step("Click on Profitably Buy button.")
    public ShopPage clickProfitablyBuyBtn() {
        getProfitablyBuyBtn().click();
        return this;
    }

    @Step("Click on subcategory {subcategory} on the catalog.")
    public ShopPage clickOnSubcategoryTitleBtn(String subcategory) {
        getSubcategoryTitleBtn(subcategory).click();
        return this;
    }

    @Step("Click on section {section} of subcategory on the catalog.")
    public ShopPage clickSectionTitleOfSubcategoryBtn(String section) {
        getSectionTitleOfSubcategoryBtn(section).click();
        return this;
    }

    @Step("Click on Close Action Slider button.")
    public ShopPage clickCloseActionSliderBtn() {
        sleep(1000);
        getCloseActionSliderBtn().click();
        return this;
    }

    @Step("Click on {option} button of sorting panel.")
    public ShopPage clickOnSortingPanelOptionBtn(String option) {
        getSortingPanelOptionBtn(option).click();
        return this;
    }

    @Step("Click on next pagination button.")
    public ShopPage clickNextPaginationBtn() {
        getNextPaginationBtn().click();
        return this;
    }

    @Step("Click on the first page button.")
    public ShopPage clickFirstPageBtn() {
        getFirstPageBtn().click();
        return this;
    }
}
