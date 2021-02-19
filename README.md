## Gittigidiyor Test Senaryosu
* www.gittigidiyor.com sitesi açılır
* Anasayfanın açıldığı kontrol edilir ve siteye login olunur
* Login işlemi kontrol edilir
* Arama kutucuğuna bilgisayar kelimesi girilir
* Arama sonuçları sayfasından ikinci sayfa açılır
* İkinci sayfanın açıldığı kontrol edilir
* Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir
* Seçilen ürün sepete eklenir
* Ürün sayfasındaki fiyat ile sepetteki fiyat karşılaştırılır
* Adet arttırılarak ürün adedinin 2 olduğu doğrulanır
* Ürün sepetten silinerek sepetin boş olduğu kontrol edilir

## Dependencies
* Selenium
* JUnit
* Log4j
* Cucumber
* TestNG
* Lombok

## Build

* Maven ayarlarından setting.xml dosyanızın path'ini güncellemeniz gerekebilir. Bilgisayarınızın proxy ayarlarınıza uygun setting dosyasının pathini maven-settings altında tanımlamanız gerekir. 
* Projenin başarılı bir şekilde ayağa kalkması için kullandığınız chromedriver'ın chrome tarayıcınızın versiyonu ile uyumlu olduğundan emin olmalısınız. 
* chromedriver dosyanızı webdriver-> Driver.java altında bulunan path'e eklemeniz gerekmektedir.
```sh
    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\e84156428\\Desktop\\CaseStudyWorkGG\\env\\chromedriver.exe");
        .
        .
        .
    }
```
