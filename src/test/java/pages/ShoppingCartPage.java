package pages;

import elements.ShoppingCartElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends ShoppingCartElements {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click on Complete Purchase button.")
    public ShoppingCartPage clickCompletePurchaseBtn() {
        getCompletePurchaseBtn().click();
        return this;
    }
}
