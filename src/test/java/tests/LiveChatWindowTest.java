package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.InformationPage;

public class LiveChatWindowTest extends AbstractBaseTest {

    @Test
    @Description("")
    public void checkLiveChatWindow() {
        HomePage homePage = new HomePage(driver);
        InformationPage informationPage = new InformationPage(driver);
        SoftAssert softAssert = new SoftAssert();

        homePage
                .clickExpertSupportBtn();

        softAssert.assertTrue(informationPage.getSupportServiceBtn().isDisplayed(),
                "Expert support button is not displayed");

        informationPage
                .clickSupportServiceBtn()
                .clickSupportServiceChatBtn();

        softAssert.assertTrue(informationPage.getSupportServicePopUp().isDisplayed(),
                "Expert support pop-up is not displayed");

        informationPage
                .entryNameOnSupportServiceInput("")
                .entryPhoneOnSupportServiceInput("+7 (654) 237-87-65")
                .entryEmailOnSupportServiceInput("vadremail");
        softAssert.assertTrue(informationPage.getErrorMessageMustEntryName().isDisplayed(),
                "Message 'Поле обовязкове для заповнення' did not appear!");
        softAssert.assertTrue(informationPage.getErrorMessageMustEntryPhone().isDisplayed(),
                "Message 'Поле обовязкове для заповнення' did not appear!");
        softAssert.assertTrue(informationPage.getErrorMessageEntryWrong().isDisplayed(),
                "Message 'Введено неправильний email' did not appear!");




    }
}
