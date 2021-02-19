Feature:  Gittigidiyor SeleniumWebOtomasyon Senaryosu

  @Test
  Scenario: Gittigidiyor SeleniumWebOtomasyon Senaryosu
    Given www.gittigidiyor.com sitesi acilir
    And login olunur
    And arama kutucuguna "bilgisayar" kelimesi girilir
    And arama sonuclari sayfasindan ikinci sayfa acilir
    And rastgele bir urun secilir
    And urun sepete eklenir
    And fiyat karsilastirmasi yapilir
    And urun adedi arttirilir
    And urun sepetten silinir ve sepet kontrol edilir
    Then kapat
