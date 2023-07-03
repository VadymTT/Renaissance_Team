package base;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

@Slf4j
abstract public class AbstractBasePage extends AbstractBase {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    private int BASE_WAIT = 5000;

    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofMillis(BASE_WAIT));
        this.actions = new Actions(driver);
    }

    protected WebElement waitUntilElementToBeVisibleByXpath(String locator) {
        return wait.until(visibilityOfElementLocated(By.xpath(locator)));
    }

    protected WebElement waitUntilElementToBeClickable(String locator) {
        return wait.until(elementToBeClickable(By.xpath(locator)));
    }

    public boolean isCurrentUrlDisplayed(WebDriver driver, String url) {
        try {
            wait.until(ExpectedConditions.urlContains(url));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void waitUntilNumberOfTabToBe(int tabNumber) {
        wait.until(ExpectedConditions.numberOfWindowsToBe(tabNumber));
    }

    public void goToNextTab(int tabNumber) {
        waitUntilNumberOfTabToBe(tabNumber);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabNumber - 1));
    }

    protected void moveCursor(WebElement element) {
        actions.moveToElement(element).build().perform();
    }

    protected void doubleClick(WebElement element) {
        actions.doubleClick(element).build().perform();
    }

    public void waitUntiUrlToBe(String expectedURL) {
        wait.until(ExpectedConditions.urlToBe(expectedURL));
    }

    public static void scrollForElement(WebElement element, WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
