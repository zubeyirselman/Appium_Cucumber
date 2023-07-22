package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.qualityDemyPage;
import utilities.BrowserDriver;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class qualitydemy {
    AndroidDriver<AndroidElement> driver = BrowserDriver.getBrowserDriver();
    qualityDemyPage qualityDemyPage = new qualityDemyPage();

    @Given("Kullanici qualitydemy sayfasina gider")
    public void kullanici_qualitydemy_sayfasina_gider() {
        BrowserDriver.getBrowserDriver().get("https://www.qualitydemy.com");
    }

    @Given("Kullanici cookies' i kabul eder")
    public void kullanici_cookies_i_kabul_eder() throws InterruptedException {
        ReusableMethods.browserKoordinatTiklama(193,1700,1000);
    }

    @Given("Ardindan sol taraftaki menuden Login butonuna tiklayarak login sayfasina ulastigini dogrular")
    public void ardindan_sol_taraftaki_menuden_login_butonuna_tiklayarak_login_sayfasina_ulastigini_dogrular() throws InterruptedException {
        qualityDemyPage.menuBar.click();
        Thread.sleep(1000);
        qualityDemyPage.menuLoginButon.click();
        Thread.sleep(1000);
        Assert.assertTrue(qualityDemyPage.loginTextKontrol.isDisplayed());
        Thread.sleep(1000);
    }

    @Given("Kullanici yanlis bilgilerle {string} {string} siteye giris yapamadigini dogrular")
    public void kullanici_yanlis_bilgilerle_siteye_giris_yapamadigini_dogrular(String mail, String sifre) throws InterruptedException {
        qualityDemyPage.hataliGirisKontrolu(mail,sifre);
    }

    @Given("Kullanici browser' i kapatir")
    public void kullanici_browser_i_kapatir() {
        BrowserDriver.quitAppiumDriver();
    }



}
