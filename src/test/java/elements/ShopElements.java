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

    protected WebElement getCloseRegionalBannerBtn() {
        return waitUntilElementToBeClickable(CLOSE_REGIONAL_BANNER_BTN);
    }

    protected WebElement getProfitablyBuyBtn() {
        return waitUntilElementToBeClickable(PROFITABLY_BUY_BTN);
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
        int lastPage = Integer.parseInt(waitUntilElementToBeVisibleByXpath(LAST_PAGE_BTN).getText());
        return lastPage - 1;
    }

    protected WebElement getFirstPageBtn() {
        return waitUntilElementToBeClickable(FIRST_PAGE_BTN);
    }
}
