package Pages;

import Utils.UserInfo;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.net.MalformedURLException;

public class SelWebOtoMethods extends BasePage {

    UserInfo userInfo = new UserInfo(); //UserInfo class is created to keep username and password.
    String price; //I needed to use 'price' value in different methods. Defined it as global variable.

    //Created objects from pages to get web elements.
    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    public SelWebOtoMethods() throws MalformedURLException {
    }

    public void goPage() throws InterruptedException {
        Thread.sleep(1000);
        goToUrl(Url); //www.gittigidiyor.com is defined in BasePage class.
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println("Current Url is: "+CurrentUrl); //Printed values on console for basic check since I could not use log4j library.
        System.out.println("Expected Url is: "+Url); //Printed values on console for basic check since I could not use log4j library.
        Assert.assertEquals(CurrentUrl, Url ); //Assertions are used for check case result.
    }

    public void login() throws InterruptedException{
        homePage.getLoginButton().click();
        Thread.sleep(1000);
        homePage.getSignInButton().click();
        loginPage.getUsernameInput().sendKeys(userInfo.getUsername());
        loginPage.getPasswordInput().sendKeys(userInfo.getPassword());
        Thread.sleep(1000);
        loginPage.getLoginButton().click();
        Assert.assertFalse(driver.getPageSource().contains("Giriş Yap")); //Assertions are used for check case result.
    }

    public void search(String str){
        homePage.getSearchInput().sendKeys(str + Keys.ENTER); //Search string is defined as String value in Test Scenario in feature file.
    }

    public void changePage(){
        String CurrentUrl = driver.getCurrentUrl();
        driver.navigate().to(CurrentUrl + "&sf=2"); //Went to second page from URL.
        String currentPageIndex = searchPage.getSelectedPage().getText(); //Get current page index from web element. Called element from searchPage class.
        System.out.println("Current page index is: "+currentPageIndex); //Printed values on console for basic check since I could not use log4j library.
        System.out.println("Page index should be: 2"); //Printed values on console for basic check since I could not use log4j library.
        Assert.assertEquals(currentPageIndex, "2"); //Assertions are used for check case result.
    }

    public void randomItemSelect() throws InterruptedException {
        Thread.sleep(5000);
        int a = searchPage.randomNumber(3); //RandomNumber function is created in searchPage and called with parameter: 3. Max item index value is 3 because I could not scroll on page so only visible elements are selectable.
        WebElement randomItem = driver.findElement(By.xpath("(//li[@product-index='"+a+"'])")); //This xpath is not called from searchPage class because I used index parameter.
        randomItem.click();
    }

    public void addToCart()  throws InterruptedException {
        Thread.sleep(5000);
        price = productPage.getProductPrice().getText();
        System.out.println("Product price is :"+price); //Printed values on console for basic check since I could not use log4j library.
        productPage.getAddCartButton().click();
        Thread.sleep(2000);
        driver.get("https://www.gittigidiyor.com/sepetim"); //User is navigated to cart by Url.
    }

    public void comparePrices(){
        System.out.println("On product page, price was "+price); //Printed values on console for basic check since I could not use log4j library.
        System.out.println("On cart, price is: "+cartPage.getPriceOnCart().getText()); //Printed values on console for basic check since I could not use log4j library.
        Assert.assertEquals(price,cartPage.getPriceOnCart().getText());
    }

    public void incProductCount() throws InterruptedException {
        cartPage.getDropdownList().click();
        Thread.sleep(2000);
        cartPage.getCountElement().click();
        Thread.sleep(2000);
        //WebElement actualCount = driver.findElement(By.xpath("//option[@selected]")); //Tried to get count of product from web element but returned data is not in expected format and value.
        //String actualCountValue=actualCount.getText();
        //Assert.assertEquals(actualCountValue, "2");
    }

    public void cleanCart() throws InterruptedException {
        cartPage.getCleanCartButton().click();
        Assert.assertTrue(driver.getPageSource().contains("Sepetinizde ürün bulunmamaktadır."));
        Thread.sleep(5000);
    }

    public void tearDown(){
        //Close driver
        driver.quit();
    }

}
