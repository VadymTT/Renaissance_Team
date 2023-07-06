package pages;

import elements.RegisterElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends RegisterElements {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @Step("Close pop-up button on the register page.")
    public RegisterPage closePopUpBtn() {
        getClosePopUpBtn().click();
        return this;
    }
}
