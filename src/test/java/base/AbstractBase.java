package base;

import lombok.SneakyThrows;

abstract public class AbstractBase {

    @SneakyThrows
    protected static void sleep(double second) {
        Thread.sleep((long) (second * 1000L));
    }

//    @SneakyThrows
////    @Attachment(value = "Page screenshot", type = "image/png")
//    public static byte[] captureScreen(WebDriver driver) {
//        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenshot, new File("./target/allure-results/screenshots//" + screenshot.getName()));
//        return Files.toByteArray(screenshot);
//    }
}
