package pages;

import elements.ProductCardElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ProductCardPage extends ProductCardElements {

    public ProductCardPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click on wishlist button on product cart page.")
    public ProductCardPage clickWishlistBtn() {
        getWishlistBtn().click();
        return this;
    }

    @Step("Get {text} from chosen store address for delivery.")
    public String getTextFromYourStoreAddressForDelivery() {
        return getYourStoreAddressForDelivery().getText();
    }

    @Step("Click on {number} Buy button.")
    public ProductCardPage clickBuyBtn(String number) {
        getBuyBtn(number).click();
        return this;
    }

}
