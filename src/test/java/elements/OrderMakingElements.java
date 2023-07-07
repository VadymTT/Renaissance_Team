package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderMakingElements extends AbstractBasePage {

    public OrderMakingElements(WebDriver driver) {
        super(driver);
    }

    private static final String PLACEHOLDER_STORE_ADDRESS_FOR_ORDERING = "//div[@class='_ijOwLq']/input";

    public WebElement getPlaceholderStoreAddressForOrdering() {
        return waitUntilElementToBeVisibleByXpath(PLACEHOLDER_STORE_ADDRESS_FOR_ORDERING);
    }
}
