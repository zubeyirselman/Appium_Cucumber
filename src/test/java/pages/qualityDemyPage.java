package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserDriver;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class qualityDemyPage {

    public qualityDemyPage(){

        PageFactory.initElements((WebDriver) BrowserDriver.getBrowserDriver(),this);

    }


    @FindBy(xpath = "//*[@class='mobile-nav-trigger']")
    public WebElement menuBar;

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement menuLoginButon;

    @FindBy(xpath = "//*[text()='Provide your valid login credentials']")
    public WebElement loginTextKontrol;

    @FindBy(xpath = "//*[@type='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement sifreBox;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement loginButon;

    @FindBy(xpath = "//*[text()='Invalid login credentials']")
    public WebElement hataliGirisYazisi;

    public void hataliGirisKontrolu(String mail, String sifre) throws InterruptedException {

        Thread.sleep(1000);
        emailBox.sendKeys(ConfigReader.getProperty(mail));
        Thread.sleep(1000);
        sifreBox.sendKeys(ConfigReader.getProperty(sifre));
        Thread.sleep(1000);
        ReusableMethods.browserKoordinatTiklama(756,338,1000);
        loginButon.click();
        Assert.assertTrue(hataliGirisYazisi.isDisplayed());
        Thread.sleep(1000);

    }


}
