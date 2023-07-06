package pages;

import elements.HomeElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage catalogOpenBtnClick() {
        getCatalogBtn().click();
        return this;
    }

    @Step("Click on Another Btn in Location Conformation pop-up window.")
    public HomePage clickConfirmationOfAnotherLocationBtn() {
        getConfirmationOfAnotherLocationBtn().click();
        return this;
    }

    @Step("Click on category on the main drop-down menu {category}")
    public HomePage clickOnCategoryTittle(String category) {
        getCategoryTittle(category).click();
        return this;
    }
    public HomePage clickSearchField(String product) {
        getSearchField().sendKeys(product);
        return this;
    }

    public HomePage clickSearchBtn() {
        getSearchBtn().click();
        return this;
    }
}
