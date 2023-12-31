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
    private static final String TITLE_OF_SUBCATEGORY = "//a[contains(text(), '%s')]";
    private static final String SECTION_TITLE_OF_SUBCATEGORY_BTN = "//section/a[contains(text(), '%s')]";
    private static final String CLOSE_ACTION_SLIDER_BTN = "//button[@class='action-slider__close']";
    private static final String SORTING_PANEL_OPTION_BTN = "//div[@class='show-for-large']//a[contains(text(), '%s')]";
    private static final String LIST_OF_PRODUCT_PRICE_ROW = "//div[@class='card__price']//p[@class='card__price-actual ']";
    private static final String LIST_OF_PAGINATION_BTN = "//a[@class='pagination__item ']";
    private static final String NEXT_PAGINATION_BTN = "//a[@class='pagination__button pagination__button--next']";
    private static final String LAST_PAGE_BTN = "//a[@href='/ua/shop/kirpich-oblitsovochnyy/deshevie/?PAGEN_1=11']";
    private static final String FIRST_PAGE_BTN = "//a[@title='1']";

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
    private static final String FIRST_IPHONE_ITEM_IN_LIST_COMPARE = "//a[@data-compare='003265676']";
    private static final String FIRST_SAMSUNG_ITEM_IN_LIST_COMPARE = "//a[@data-compare='003364310']";
    private static final String SECOND_ITEM_IN_LIST_COMPARE = "(//div[@class='card__add'])[2]/a[@data-tooltip='bottom']";
    private static final String COMPARE_ICON_BTN = "//span[@class='header__compare-link-icon']";

    protected WebElement getCategoryByDataAlt(String category) {
        return waitUntilElementToBeClickable(String.format(CATEGORY_BY_DATA_ALT, category));
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


    public WebElement getFirstIphoneItemInListCompare() {
        return waitUntilElementToBeClickable(FIRST_IPHONE_ITEM_IN_LIST_COMPARE);
    }

    protected WebElement getCloseRegionalBannerButton() {
        return waitUntilElementToBeClickable(CLOSE_REGIONAL_BANNER_BTN);
    }

    protected WebElement getSubcategoryTitleBtn(String subcategory) {
        return waitUntilElementToBeClickable(String.format(TITLE_OF_SUBCATEGORY, subcategory));
    }

    protected WebElement getSectionTitleOfSubcategoryBtn(String section) {
        return waitUntilElementToBeClickable(String.format(SECTION_TITLE_OF_SUBCATEGORY_BTN, section));
    }

    public WebElement getCloseActionSliderBtn() {
        return waitUntilElementToBeClickable(CLOSE_ACTION_SLIDER_BTN);
    }

    protected WebElement getSortingPanelOptionBtn(String option) {
        return waitUntilElementToBeClickable(String.format(SORTING_PANEL_OPTION_BTN, option));
    }

    public List<WebElement> getListOfProductPriceRow() {
        sleep(4000);
        return waitUntilPresenceOfAllElementsByXpath(LIST_OF_PRODUCT_PRICE_ROW);
    }

    protected WebElement getNextPaginationBtn() {
        return waitUntilElementToBeClickable(NEXT_PAGINATION_BTN);
    }

    public int getLastPageBtn() {
        sleep(3000);
        int lastPage = Integer.parseInt(waitUntilElementToBeVisibleByXpath(LAST_PAGE_BTN).getText());
        return lastPage;
    }

    protected WebElement getFirstPageBtn() {
        return waitUntilElementToBeClickable(FIRST_PAGE_BTN);
    }

    protected WebElement getProfitablyBuyButton() {
        return waitUntilElementToBeClickable(PROFITABLY_BUY_BTN);
    }

    public WebElement getFirstSamsungItemInListCompare() {
        return waitUntilElementToBeClickable(FIRST_SAMSUNG_ITEM_IN_LIST_COMPARE);
    }

    public WebElement getSecondItemInListCompare() {
        return waitUntilElementToBeClickable(SECOND_ITEM_IN_LIST_COMPARE);
    }

    public WebElement getCompareIconButton() {
        return waitUntilElementToBeClickable(COMPARE_ICON_BTN);
    }

    protected WebElement getCloseRegionalBannerBtn() {
        return waitUntilElementToBeClickable(CLOSE_REGIONAL_BANNER_BTN);
    }

    protected WebElement getProfitablyBuyBtn() {
        return waitUntilElementToBeClickable(PROFITABLY_BUY_BTN);
    }
}
