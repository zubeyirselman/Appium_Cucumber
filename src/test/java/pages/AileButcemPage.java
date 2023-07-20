package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class AileButcemPage {

    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofMillis(15)), this);
    }

    @FindBy(xpath = "//*[@text='Giriş Yap']")
    public MobileElement girisYapButon;

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    public MobileElement emailButon;

    @FindBy(xpath = "//*[@text='Şifre']")
    public MobileElement sifreButon;



}
