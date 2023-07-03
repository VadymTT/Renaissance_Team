package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractBasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String LOGO_BUTTON = "//div[@class='nav']//a[@href='/store/man']";
    private static final String CATALOG_OPEN_BTN = "/..//a[@class='nav__heading'][contains(@href,'vzutta')]";

    public WebElement getLogoBtn() {
        return waitUntilElementToBeClickable(LOGO_BUTTON);
    }

    public WebElement catalogOpenerBtn() {
        return waitUntilElementToBeClickable(CATALOG_OPEN_BTN);
    }

    public HomePage catalogOpenBtnClick(){
        catalogOpenerBtn().click();
        return this;
    }

    public HomePage logoBtnClick(){
        getLogoBtn().click();
        return this;
    }
}
