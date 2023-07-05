package pages;

import elements.ShopElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.waitUrlContains;

public class ShopPage extends ShopElements {
    public ShopPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click on category {category}")
    public ShopPage clickOnCategory(String category) {
        getCategoryByDataAlt(category).click();
        return this;
    }

    @Step("Click on product brand {brand}")
    public ShopPage clickOnProductBrand(String brand, String brandUrl) {
        getProductBrand(brand).click();
        waitUrlContains(driver, brandUrl);
        return this;
    }

    @Step("")
    public ShopPage entryMinPrice(String price) {
        scrollForElement(getMinPriceInput(), driver);
        getMinPriceInput().clear();
        getMinPriceInput().sendKeys(price);
        waitUrlContains(driver, "/price-base-from-" + price);
        return this;
    }

    @Step("")
    public ShopPage entryMaxPrice(String price) {
        getMaxPriceInput().clear();
        getMaxPriceInput().sendKeys(price);
        waitUrlContains(driver, "to-" + price);
        return this;
    }

    @Step("Open spin speed drop-down menu")
    public ShopPage openSpinSpeedMenu() {
        getSpinSpeed().click();
        sleep(1000);
        return this;
    }

    @Step("Click on spin speed 1100-1200")
    public ShopPage clickOnSpinSpeedF(String speed) {
        scrollForElement(getSpinSpeedF(speed), driver);
        getSpinSpeedF(speed).click();
        sleep(1000);
        return this;
    }
    @Step("")
    public ShopPage clickOnProductCard() {
        getProductCard().click();
        sleep(800);
        return this;
    }
}

