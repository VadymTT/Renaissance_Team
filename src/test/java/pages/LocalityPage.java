package pages;

import elements.LocalityElements;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LocalityPage extends LocalityElements {
    public LocalityPage(WebDriver driver) {
        super(driver);
    }

    @Step("Clear and enter the {city name} in input field.")
    public LocalityPage enterCityName(String city) {
        getInputCityName().sendKeys(Keys.COMMAND + "A");
        getInputCityName().sendKeys(Keys.CLEAR);
        sleep(4);
        getInputCityName().sendKeys(city);
        sleep(4);
        return this;
    }

    @Step("Click on {number} the first one locality of city from the drop-down list.")
    public LocalityPage clickLocalityOfCity(String number) {
        getLocalityOfCity(number).click();
        sleep(4);
        return this;
    }

    @Step("Click on {number} Select Store button.")
    public LocalityPage clickSelectStoreBtn(String number) {
        getSelectStoreBtn(number).click();
        return this;
    }

    @Step("Click on Close Regional Banner button.")
    public LocalityPage clickCloseRegionalBannerBtn() {
        getCloseRegionalBannerBtn().click();
        return this;
    }

    @Step("Click on Profitably Buy button.")
    public LocalityPage clickProfitablyBuyBtn() {
        getProfitablyBuyBtn().click();
        return this;
    }

    @Step("Click on {number} Buy button.")
    public LocalityPage clickBuyBtn(String number) {
        getBuyBtn(number).click();
        return this;
    }

    @Step("Click on Complete Purchase button.")
    public LocalityPage clickCompletePurchaseBtn() {
        getCompletePurchaseBtn().click();
        return this;
    }
}
