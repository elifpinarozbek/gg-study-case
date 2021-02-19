package Pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends BasePage {
    @FindBy(id = "L-UserNameField")
    private WebElement UsernameInput;

    @FindBy(id = "L-PasswordField")
    private WebElement PasswordInput;

    @FindBy(id = "gg-login-enter")
    private WebElement LoginButton;

    public LoginPage() {
        PageFactory.initElements(webDriver, this);
    }
}
