package pages;

import elements.LocalityElements;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LocalityPage extends LocalityElements {

    public LocalityPage(WebDriver driver) {
        super(driver);
    }

    @Step("Clear and enter the {city name} in input field.")
    public LocalityPage enterCityName(String city) {
        getCityNameField().sendKeys(Keys.COMMAND + "A");
        getCityNameField().sendKeys(Keys.CLEAR);
        sleep(4000);
        getCityNameField().sendKeys(city);
        sleep(2000);
        return this;
    }

    @Step("Click on {number} the first one locality of city from the drop-down list.")
    public LocalityPage clickLocalityOfCityRow(String number) {
        getLocalityOfCityRow(number).click();
        sleep(4000);
        return this;
    }

    @Step("Click on {number} Select Store button.")
    public LocalityPage clickSelectStoreBtn(String number) {
        getSelectStoreBtn(number).click();
        return this;
    }

    @Step("Get {title} attribute of actual selected store address in the header.")
    public String getTextActualSelectedStoreAddress() {
        sleep(4000);
        return getActualSelectedStoreAddressRow().getAttribute("title");
    }
}
