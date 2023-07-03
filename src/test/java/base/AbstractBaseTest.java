package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

abstract public class AbstractBaseTest extends AbstractBase{
    protected static WebDriver driver;
//    private final Dimension dimension = new Dimension(WIDTH, HEIGHT);
//    private static final int WIDTH = 1680;
//    private static final int HEIGHT = 1050;
//
    private static final String WEBDRIVER = "https://epicentrk.ua/";

    @BeforeMethod
    public void openBrowser() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get(WEBDRIVER);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
