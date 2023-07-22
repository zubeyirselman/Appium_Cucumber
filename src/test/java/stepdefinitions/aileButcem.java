package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class aileButcem {
    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    TouchAction touchAction = new TouchAction<>(driver);
    AileButcemPage aileButcemPage = new AileButcemPage();
    @Given("kullanici driver kurulumlarini yapar")
    public void kullanici_driver_kurulumlarini_yapar() {
        Driver.getAndroidDriver();
    }

    @Given("ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() throws InterruptedException {

        Thread.sleep(2000);
        for (int i = 0; i < 6 ; i++) {
            ReusableMethods.ekranSagaKaydir(905,983,500,100,983, 1000);
        }

        aileButcemPage.girisYapButon.click();

    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail, String sifre) {

        aileButcemPage.emailButon.sendKeys(ConfigReader.getProperty(mail));
        aileButcemPage.sifreButon.sendKeys(ConfigReader.getProperty(sifre));
        aileButcemPage.girisYapButon.click();
    }

    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {
        Assert.assertTrue(aileButcemPage.basariliGiris.isDisplayed());
    }
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(String hesabim) throws InterruptedException {
        Thread.sleep(6000);
        ReusableMethods.koordinatTiklama(113,153,1000);
        //ReusableMethods.koordinatTiklama(367,760,1000);
        ReusableMethods.scrollWithUiScrollable(hesabim);
        Thread.sleep(1000);
    }

    @Given("hesabim sayfasindaki bilgileri degistirerek {int} {string} {string} {string} {int} {int} {string} {string} {string} {string} degisikleri kaydedin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin(Integer bekleme, String name, String surName, String city, Integer xKoordinat, Integer yKoordinat, String Erkek, String yas, String meslek, String kaydet) throws InterruptedException {

        Thread.sleep(bekleme);
        aileButcemPage.nameBox.clear();
        aileButcemPage.surnameBox.clear();
        aileButcemPage.cityBox.clear();
        aileButcemPage.ageBox.clear();
        aileButcemPage.jobBox.clear();

        aileButcemPage.nameBox.sendKeys(ConfigReader.getProperty(name));
        aileButcemPage.surnameBox.sendKeys(ConfigReader.getProperty(surName));
        aileButcemPage.cityBox.sendKeys(ConfigReader.getProperty(city));
        ReusableMethods.koordinatTiklama(xKoordinat,yKoordinat,bekleme);
        ReusableMethods.scrollWithUiScrollable(Erkek);
        aileButcemPage.ageBox.sendKeys(ConfigReader.getProperty(yas));
        aileButcemPage.jobBox.sendKeys(ConfigReader.getProperty(meslek));
        ReusableMethods.scrollWithUiScrollable(kaydet);

    }

    @Given("ardindan degisiklerin yapildigini {string} {string} {string} {string} {string} dogrulayin")
    public void ardindan_degisiklerin_yapildigini_dogrulayin(String isim, String soyisim, String sehir, String yas, String meslek) {

        Assert.assertTrue(aileButcemPage.nameBox.getText().contains(ConfigReader.getProperty(isim)));
        Assert.assertTrue(aileButcemPage.surnameBox.getText().contains(ConfigReader.getProperty(soyisim)));
        Assert.assertTrue(aileButcemPage.cityBox.getText().contains(ConfigReader.getProperty(sehir)));
        Assert.assertTrue(aileButcemPage.ageBox.getText().contains(ConfigReader.getProperty(yas)));
        Assert.assertTrue(aileButcemPage.jobBox.getText().contains(ConfigReader.getProperty(meslek)));

    }

    @Given("kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {
        Driver.quitAppiumDriver();
    }

    @Given("anasayfadaki arti butonuna tiklayin")
    public void anasayfadaki_arti_butonuna_tiklayin() throws InterruptedException {
        ReusableMethods.koordinatTiklama(538,1665,1000);
    }
    @Given("{string} bolumune tiklayin")
    public void gelir_ekle_bolumune_tiklayin(String artiIcerik) {
        ReusableMethods.scrollWithUiScrollable(artiIcerik);
    }

    @Given("aciklama, gelir tipi, kategori, tarih ve tutari belirleyin ve kaydedin")
    public void aciklama_gelir_tipi_kategori_tarih_ve_tutari_belirleyin_ve_kaydedin() throws InterruptedException {
        aileButcemPage.aciklamaButon.sendKeys("Maas");
        Thread.sleep(1000);
        ReusableMethods.koordinatTiklama(989,1687,1000);
        Thread.sleep(1000);
        ReusableMethods.scrollWithUiScrollable("Gelir Tipi");
        Thread.sleep(1000);
        ReusableMethods.scrollWithUiScrollable("Düzenli");
        Thread.sleep(1000);
        ReusableMethods.scrollWithUiScrollable("Gelir Periyodu");
        Thread.sleep(1000);
        ReusableMethods.scrollWithUiScrollable("Aylık");
        Thread.sleep(1000);
        ReusableMethods.scrollWithUiScrollable("Kategori");
        Thread.sleep(1000);
        ReusableMethods.scrollWithUiScrollable("Maaş Geliri");
        Thread.sleep(1000);
        ReusableMethods.koordinatTiklama(975,1367,1000);
        Thread.sleep(1000);
        ReusableMethods.koordinatTiklama(800,1484,1000);
        Thread.sleep(1000);
        aileButcemPage.tutarButon.sendKeys("50000");
        Thread.sleep(1000);
        aileButcemPage.kaydetButon.click();
    }

    @Given("basariyla eklendigini dogrulayin")
    public void basariyla_eklendigini_dogrulayin() {
        Assert.assertTrue(aileButcemPage.degisiklikDogrulama.isDisplayed());
    }

}
