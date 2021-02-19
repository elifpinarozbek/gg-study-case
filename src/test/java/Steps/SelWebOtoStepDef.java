package Steps;

import Pages.BaseMethods;
import Pages.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class SelWebOtoStepDef extends PageFactory {

    public SelWebOtoStepDef() throws MalformedURLException {
    }

    @Given("www.gittigidiyor.com sitesi acilir")
    public void siteAcilir() throws InterruptedException {
        methods.goPage();
    }

    @And("login olunur")
    public void loginOlunur() throws InterruptedException {
        methods.login();
    }

    @And("arama kutucuguna {string} kelimesi girilir")
    public void aramaKutucugunaKelimesiGirilir(String str) {
        methods.search(str);
    }

    @And("arama sonuclari sayfasindan ikinci sayfa acilir")
    public void aramaSonuclariSayfasindanIkinciSayfaAcilir() {
        methods.changePage();
    }

    @And("rastgele bir urun secilir")
    public void rastgeleBirUrunSecilir()  throws InterruptedException {
        methods.randomItemSelect();
    }

    @And("urun sepete eklenir")
    public void urunSepeteEklenir() throws InterruptedException {
        methods.addToCart();
    }

    @And("fiyat karsilastirmasi yapilir")
    public void fiyatKarsilastirmasiYapilir() {
        methods.comparePrices();
    }

    @And("urun adedi arttirilir")
    public void urunAdediArttirilir() throws InterruptedException {
        methods.incProductCount();
    }

    @And("urun sepetten silinir ve sepet kontrol edilir")
    public void urunSepettenSilinirVeSepetKontrolEdilir() throws InterruptedException {
        methods.cleanCart();
    }

    @Then("kapat")
    public void kapat() {
        methods.tearDown();
    }
}
