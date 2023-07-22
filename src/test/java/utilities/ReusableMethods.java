package utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class ReusableMethods {

    public static void koordinatTiklama(int xKoordinat, int yKoordinat, int bekleme) throws InterruptedException {
        TouchAction touchAction = new TouchAction<>(Driver.getAndroidDriver());
        touchAction.press(PointOption.point(xKoordinat, yKoordinat)).release().perform();
        Thread.sleep(bekleme);
    }
    public static void browserKoordinatTiklama(int xKoordinat, int yKoordinat, int bekleme) throws InterruptedException {
        TouchAction touchAction = new TouchAction<>(BrowserDriver.getBrowserDriver());
        touchAction.press(PointOption.point(xKoordinat, yKoordinat)).release().perform();
        Thread.sleep(bekleme);
    }

    public static void ekranSagaKaydir(int sagxKoordinat, int sagyKoordinat, int wait, int solxKoordinat, int solyKoordinat, int bekle) throws InterruptedException {
        TouchAction touchAction = new TouchAction<>(Driver.getAndroidDriver());

        touchAction.press(PointOption.point(905,983))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(100,983))
                .release()
                .perform();
        Thread.sleep(bekle);
    }

    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver driver = (AndroidDriver)Driver.getAndroidDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))");
        driver.findElementByXPath("//*[@text='" + elementText + "']").click();
    }

    public static void scrollWithUiScrollableIsDisplayed(String elementText) {
        AndroidDriver driver = (AndroidDriver)Driver.getAndroidDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))");
        driver.findElementByXPath("//*[@text='" + elementText + "']").isDisplayed();
    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhssmm").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot)Driver.getAndroidDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

}
