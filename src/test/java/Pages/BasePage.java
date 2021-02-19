package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage extends BaseMethods{
   public final WebDriver webDriver;
   protected static String Url = "https://www.gittigidiyor.com/";
   public BasePage(){
       this.webDriver = PageFactory.driver;
   }
}

