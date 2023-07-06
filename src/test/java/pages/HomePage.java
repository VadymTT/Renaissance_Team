package pages;

import elements.HomePageElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomePage extends HomePageElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage catalogOpenBtnClick() {
        getCatalogBtn().click();
        return this;
    }

    public HomePage clickCartIconButton() {
        getCartIconButton().click();
        return this;
    }

    public HomePage clickConfirmationOfLocationButton() {
        getConfirmationOfLocationButton().click();
        return this;
    }

    public HomePage sendKeysSearchField(String send) {
        getSearchField().sendKeys(send);
        return this;
    }

    public HomePage clickSearchButton() {
        getSearchButton().click();
        return this;
    }

    @Step("Click on category on the main drop-down menu {category}")
    public HomePage clickOnCategoryTittle(String category) {
        getCategoryTittle(category).click();
        return this;
    }
}
