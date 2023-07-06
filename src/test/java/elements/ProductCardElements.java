package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCardElements extends AbstractBasePage {
    public ProductCardElements(WebDriver driver) {
        super(driver);
    }

    private static final String WISHLIST_BTN = "//button[@data-text='У бажання']";

    protected WebElement getWishlistBtn() {
        return waitUntilElementToBeClickable(WISHLIST_BTN);
    }
}
