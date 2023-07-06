package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.InformationPage;

public class LiveChatWindowTest extends AbstractBaseTest {

    @Test
    @Description("TR-14/Test Case 2. Check live chat window.")
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

        softAssert.assertTrue(informationPage.getSupportServicePopUp().get(0).isDisplayed(),
                "Expert support pop-up is not displayed");

        informationPage
                .entryNameOnSupportServiceInput("")
                .entryPhoneOnSupportServiceInput("+7 (654) 237-87-65")
                .entryEmailOnSupportServiceInput("vadremail")
                .clickSendFormBtn();

        softAssert.assertTrue(informationPage.getErrorMessageMustEntryName().isDisplayed(),
                "Message 'Поле обовязкове для заповнення' did not appear!");
        softAssert.assertTrue(informationPage.getErrorMessageWrongPhone().isDisplayed(),
                "Message 'Поле заповнене неправильно' did not appear!");
        softAssert.assertTrue(informationPage.getErrorMessageEntryWrongEmail().isDisplayed(),
                "Message 'Введено неправильний email' did not appear!");

        informationPage
                .closeSupportServicePopup();

        softAssert.assertEquals(informationPage.getSupportServicePopUp().size(), 0);

        softAssert.assertAll();
    }
}
