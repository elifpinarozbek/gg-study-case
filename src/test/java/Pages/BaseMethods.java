package Pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;

public class BaseMethods {
    public final WebDriver driver;
    protected static String Url = "";

    public BaseMethods(){

        this.driver = PageFactory.driver;

    }
@Inject
    public void goToUrl(String url) throws InterruptedException {
        //driver.get(url);
        Thread.sleep(1000);
        driver.get(url);
    }


}
