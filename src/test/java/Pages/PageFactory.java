package Pages;

import org.openqa.selenium.WebDriver;
import webDriver.Driver;

import java.net.MalformedURLException;

public class PageFactory extends org.openqa.selenium.support.PageFactory {

    public static WebDriver driver;
    public BaseMethods baseMethods;
    public SelWebOtoMethods methods;


    public PageFactory() throws MalformedURLException {
        driver          = Driver.getDriver();

        baseMethods       = PageFactory.initElements(driver, BaseMethods.class);
        methods           = PageFactory.initElements(driver, SelWebOtoMethods.class);
    }
}
