package pages;

import elements.ComparePageElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ComparePage extends ComparePageElements {

    public ComparePage(WebDriver driver) {
        super(driver);
    }

    @Step("Click add more button.")
    public ComparePage clickAddMoreButton() {
        getAddMoreButton().click();
        return this;
    }

    @Step("Click compare button.")
    public ComparePage clickCompareButton() {
        getCompareButton().click();
        return this;
    }

    @Step("Click those that different button.")
    public ComparePage clickThoseThatDifferButton() {
        getThoseThatDifferButton().click();
        return this;
    }

    @Step("Click add model button.")
    public ComparePage clickAddModelButton() {
        getAddModelButton().click();
        return this;
    }

    @Step("Click clear list button.")
    public ComparePage clickClearListButton() {
        getClearListButton().click();
        return this;
    }
}
