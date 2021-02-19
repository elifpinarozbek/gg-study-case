package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Driver {

    private static final String DEFAULT = "chrome";
    private static WebDriver driver;

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\e84156428\\Desktop\\CaseStudyWorkGG\\env\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        FluentWait<WebDriver> wait;

        return driver;
    }

}
