package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.aspectj.weaver.patterns.ExactTypePattern;
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

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public MobileElement basariliGiris;

    @FindBy(xpath = "(//*[@index='0'])[17]")
    public MobileElement nameBox;

    @FindBy(xpath = "(//*[@index='1'])[5]")
    public MobileElement surnameBox;

    @FindBy(xpath = "(//*[@index='2'])[2]")
    public MobileElement cityBox;

    @FindBy(xpath = "//*[@index='4']")
    public MobileElement ageBox;

    @FindBy(xpath = "//*[@index='5']")
    public MobileElement jobBox;

    @FindBy(xpath = "//*[@text='Açıklama']")
    public MobileElement aciklamaButon;

    @FindBy(xpath = "//*[@text='Gelir Tipi']")
    public MobileElement gelirTipiButon;

    @FindBy(xpath = "//*[@text='Kategori']")
    public MobileElement kategoriButon;

    @FindBy(xpath = "//*[@text='Gelir Periyodu']")
    public MobileElement gelirPeriyoduButon;

    @FindBy(xpath = "//*[@text='Tutar']")
    public MobileElement tutarButon;

    @FindBy(xpath = "//*[@text='Kaydet']")
    public MobileElement kaydetButon;

    @FindBy(xpath = "//*[@text='Gelir eklendi.']")
    public MobileElement degisiklikDogrulama;



}
