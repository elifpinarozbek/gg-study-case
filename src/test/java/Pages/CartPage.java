package Pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CartPage extends BasePage {
    @FindBy(xpath = "//p[@class='new-price']")
    private WebElement priceOnCart;

    @FindBy(xpath = "(//select[@class='amount'])")
    private WebElement dropdownList;

    @FindBy(xpath = "(//option[@value='2'])")
    private WebElement countElement;

    @FindBy(xpath = "(//i[@class='gg-icon gg-icon-bin-medium'])[1]")
    private WebElement cleanCartButton;

    public CartPage() {
        PageFactory.initElements(webDriver, this);
}}
