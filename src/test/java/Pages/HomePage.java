package Pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@title='Giriş Yap']")
    private WebElement LoginButton;

    @FindBy(xpath = "//a[@data-cy='header-login-button']")
    private WebElement SignInButton;

    @FindBy(xpath = "//input[@data-cy='header-search-input']")
    private WebElement SearchInput;

    public HomePage() {
        PageFactory.initElements(webDriver, this);
    }
}
