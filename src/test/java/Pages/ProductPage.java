package Pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ProductPage extends BasePage{
    @FindBy(id="add-to-basket")
    private WebElement addCartButton;

    @FindBy(id="sp-price-lowPrice")
    private WebElement productPrice;

    public ProductPage() {
        PageFactory.initElements(webDriver, this);
}}
