package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComparePageElements extends AbstractBasePage {
    public ComparePageElements(WebDriver driver) {
        super(driver);
    }

    private static final String ADD_MORE_BUTTON = "(//a[@class='btn btn--compare btn--blue '])[1]";
    private static final String COMPARE_BUTTON = "(//a[@class='btn btn--compare btn--blue '])[1]";
    private static final String THOSE_THAT_DIFFER_BTN = "//span[@class='radio__text'][text()='Тільки ті, що розрізняються']";
    private static final String ADD_MODEL = "//a[@class='link link--inverted table-controls__link table-controls__link--add']";
    private static final String CLEAR_LIST = "//a[@class='link link--inverted table-controls__link table-controls__link--remove']";

    public WebElement getAddMoreButton() {
        return waitUntilElementToBeClickable(ADD_MORE_BUTTON);
    }

    public WebElement getCompareButton() {
        return waitUntilElementToBeClickable(COMPARE_BUTTON);
    }

    public WebElement getThoseThatDifferBtn() {
        return waitUntilElementToBeClickable(THOSE_THAT_DIFFER_BTN);
    }

    public WebElement getAddModel() {
        return waitUntilElementToBeClickable(ADD_MODEL);
    }

    public WebElement getClearList() {
        return waitUntilElementToBeClickable(CLEAR_LIST);
    }
}
