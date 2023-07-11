package pages;

import elements.HomeElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.waitUrlContains;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage catalogOpenBtnClick() {
        getCatalogBtn().click();
        return this;
    }

    @Step("Click car icon button.")
    public HomePage clickCartIconButton() {
        getCartIconButton().click();
        return this;
    }

    public HomePage clickConfirmationOfLocationButton() {
        getConfirmationOfLocationButton().click();
        return this;
    }

    @Step("Click on Another Btn in Location Conformation pop-up window.")
    public HomePage clickConfirmationOfAnotherLocationBtn() {
        getConfirmationOfAnotherLocationBtn().click();
        return this;
    }

<<<<<<<<< Temporary merge branch 1
    @Step("Click on category on the main drop-down menu {category}.")
=========
    @Step("Send keys on search field.")
    public HomePage sendKeysSearchField(String send) {
        getSearchField().sendKeys(send);
        return this;
    }

    @Step("Click search button.")
    public HomePage clickSearchButton() {
        getSearchButton().click();
        return this;
    }

    @Step("Click on category on the main drop-down menu {category}")
>>>>>>>>> Temporary merge branch 2
    public HomePage clickOnCategoryTittle(String category) {
        getCategoryTittle(category).click();
        return this;
    }
    @Step("Entry {product} on the search field.")
    public HomePage entryOnSearchField(String product) {
        getSearchField().sendKeys(product);
        return this;
    }
    @Step("Click on the search button.")
    public HomePage clickSearchBtn() {
        getSearchBtn().click();
        waitUrlContains(driver, "/shop/");
        return this;
    }
    @Step("Click on consent location button.")
    public HomePage clickConsentLocationBtn() {
        getConsentLocationBtn().click();
        return this;
    }
}
