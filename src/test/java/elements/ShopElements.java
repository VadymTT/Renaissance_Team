package elements;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShopElements extends AbstractBasePage {
    public ShopElements(WebDriver driver) {
        super(driver);
    }

    private final String CATEGORY_BY_DATA_ALT = "//a[@data-alt='%s']";
    private final String PRODUCT_BRAND = "//div[@data-filter-name='%s']/a";
    private static final String LIST_OF_PRODUCT = "//span[@class='font-weight-700 nc']";
    private static final String MIN_PRICE_INPUT = "(//input[@data-slider-id='price'])[1]";
    private static final String MAX_PRICE_INPUT = "(//input[@data-slider-id='price'])[2]";
    private static final String SPIN_SPEED_DROPDOWN = "//div[@data-sort='700']/span";
    private static final String SPIN_SPEED_SELECT = "//input[@data-filter-name='%s об./хв']//following-sibling::span";
    private static final String CARD_CHARACTERISTICS= "//div[@class='columns']//ul[@class='card__characteristics']/li[last()]";
    private static final String PRICE_OF_ALL_PRODUCTS = "//div[@class='columns']//p[@class='card__price-actual" +
            " card__price-actual--action']";
    private static final String FIRST_PRODUCT_CARD_NAME = "(//div[@class='card__name'])[1]//a";

    protected WebElement getCategoryByDataAlt(String category) {
        return waitUntilElementToBeVisibleByXpath(String.format(CATEGORY_BY_DATA_ALT, category));
    }

    protected WebElement getProductBrand(String brand) {
        return waitUntilElementToBeVisibleByXpath(String.format(PRODUCT_BRAND, brand));
    }

    public List<WebElement> getPriceOfProducts() {
        return waitUntilPresenceOfAllElementsByXpath(PRICE_OF_ALL_PRODUCTS);
    }

    public List<WebElement> getListOfProduct() {
        return driver.findElements(new By.ByXPath(LIST_OF_PRODUCT));
    }

    protected WebElement getMinPriceInput() {
        return waitUntilElementToBeClickable(MIN_PRICE_INPUT);
    }

    protected WebElement getMaxPriceInput() {
        return waitUntilElementToBeVisibleByXpath(MAX_PRICE_INPUT);
    }

    protected WebElement getSpinSpeedDropDown() {
        return waitUntilElementToBeClickable(SPIN_SPEED_DROPDOWN);
    }

    protected WebElement getSpinSpeedSelect(String speed) {
        return waitUntilElementToBeClickable(String.format(SPIN_SPEED_SELECT, speed));
    }

    public List<WebElement> getCardCharacteristics() {
        return waitUntilPresenceOfAllElementsByXpath(CARD_CHARACTERISTICS);
    }
    protected WebElement getFirstProductCardName() {
        return waitUntilElementToBeClickable(FIRST_PRODUCT_CARD_NAME);
    }
}
