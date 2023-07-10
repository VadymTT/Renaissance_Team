package pages;

import elements.HomeElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickCatalogOpenBtn() {
        getCatalogBtn().click();
        return this;
    }

    @Step("Click on Another Btn in Location Conformation pop-up window.")
    public HomePage clickConfirmationOfAnotherLocationBtn() {
        getConfirmationOfAnotherLocationBtn().click();
        return this;
    }

    @Step("Click on category on the main drop-down menu {category}")
    public HomePage clickOnCategoryTittleBtn(String category) {
        getCategoryTittle(category).click();
        return this;
    }

    @Step("Click on {yes} Btn in Location Conformation pop-up window.")
    public HomePage сlickConformationOfLocationBtn() {
        getConformationOfLocationBtn().click();
        return this;
    }
}
