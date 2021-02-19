package Pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

@Getter
public class SearchPage extends BasePage {
    @FindBy(className = "current")
    private WebElement selectedPage;


    public SearchPage() {
        PageFactory.initElements(webDriver, this);
    }

    public int randomNumber(int size) {
        Random random = new Random();
        int a;
        a = random.nextInt(size);
        System.out.println(a);
        return a;
    }
}


