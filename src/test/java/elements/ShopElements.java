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
    private static final String CARD_CHARACTERISTICS = "//div[@class='columns']//ul[@class='card__characteristics']/li[last()]";
    private static final String PRICE_OF_ALL_PRODUCTS = "//div[@class='columns']//p[@class='card__price-actual" +
            " card__price-actual--action']";
    private static final String FIRST_PRODUCT_CARD_NAME = "(//div[@class='card__name'])[1]//a";
    private static final String CLOSE_REGIONAL_BANNER_BTN = "//div[@class='_lf1rdL']";
    private static final String PROFITABLY_BUY_BTN = "//a[contains(text(), 'Вигідно купити')]";

    //shop page
    private static final String PRODUCT_PRICE = "(//p[@class='card__price-actual card__price-actual--action']/span[@class='card__price-sum'])[1]";
    private static final String SECOND_PRODUCT_PRICE = "(//p[@class='card__price-actual card__price-actual--action']/span[@class='card__price-sum'])[2]";
    private static final String PRODUCT_PRICE_IN_CART = "(//p[@class='basket-product__price-main'])[1]";
    private static final String SECOND_PRODUCT_PRICE_IN_CART = "(//p[@class='basket-product__price-main'])[2]";
    private static final String SUMMARY_PRODUCT_PRICE = "//span[@class='basket-purchase__send-sum--new']";

    //mobile page
    private static final String BUY_BTN = "(//button[@class='add-product card__button btn btn--yellow  js-btn--buy '])[1]";
    private static final String SECOND_BUY_BTN = "(//button[@class='add-product card__button btn btn--yellow  js-btn--buy '])[2]";
    private static final String CARD_INFO = "(//div[@class='card__info'])[1]";
    private static final String SECOND_CARD_INFO = "(//div[@class='card__info'])[2]";
    private static final String CONTINUE_PURCHASING = "//button[@class='btn btn--3 btn--white']";

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

    //shop page
    protected WebElement getProductPrice() {
        return waitUntilElementToBeVisibleByXpath(PRODUCT_PRICE);
    }

    protected WebElement getSecondProductPrice() {
        return waitUntilElementToBeVisibleByXpath(SECOND_PRODUCT_PRICE);
    }

    protected WebElement getProductPriceInCart() {
        return waitUntilElementToBeVisibleByXpath(PRODUCT_PRICE_IN_CART);
    }

    protected WebElement getSecondProductPriceInCart() {
        return waitUntilElementToBeVisibleByXpath(SECOND_PRODUCT_PRICE_IN_CART);
    }

    protected WebElement getSummaryProductPrice() {
        return waitUntilElementToBeVisibleByXpath(SUMMARY_PRODUCT_PRICE);
    }

    //mobile page
    public WebElement getBuyButton() {
        return waitUntilElementToBeClickable(BUY_BTN);
    }

    public WebElement getSecondBuyButton() {
        return waitUntilElementToBeClickable(SECOND_BUY_BTN);
    }

    public WebElement getCardInfo() {
        return waitUntilElementToBeVisibleByXpath(CARD_INFO);
    }

    public WebElement getSecondCardInfo() {
        return waitUntilElementToBeVisibleByXpath(SECOND_CARD_INFO);
    }

    public WebElement getContinuePurchasing() {
        return waitUntilElementToBeVisibleByXpath(CONTINUE_PURCHASING);
    }

        protected WebElement getCloseRegionalBannerButton () {
            return waitUntilElementToBeClickable(CLOSE_REGIONAL_BANNER_BTN);
        }

        protected WebElement getProfitablyBuyButton () {
            return waitUntilElementToBeClickable(PROFITABLY_BUY_BTN);
        }
    }
