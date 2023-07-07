package pages;

import elements.ComparePageElements;
import org.openqa.selenium.WebDriver;

public class ComparePage extends ComparePageElements {

    public ComparePage(WebDriver driver) {
        super(driver);
    }

    public ComparePage clickAddMoreButton() {
        getAddMoreButton().click();
        return this;
    }

    public ComparePage clickCompareButton() {
        getCompareButton().click();
        return this;
    }

    public ComparePage clickThoseThatDifferBtn() {
        getThoseThatDifferBtn().click();
        return this;
    }

    public ComparePage clickAddModel() {
        getAddModel().click();
        return this;
    }

    public ComparePage clickClearList() {
        getClearList().click();
        return this;
    }
}
