package pages;

import elements.ProductCardElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ProductCardPage extends ProductCardElements {
    public ProductCardPage(WebDriver driver) {
        super(driver);
    }

    @Step("")
    public ProductCardPage clickWishlistBtn() {
        getWishlistBtn().click();
        return this;
    }
}
