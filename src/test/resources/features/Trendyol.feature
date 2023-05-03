Feature: Trendyol

  @Trendyol
  Scenario: test 01
    Given user should see the Gender Page
    When taps Gender "ERKEK" on Gender Page
    Then should Popup Close Button on Home Page
    Then should see the Home Page
    When taps Search Area on Home Page
    Then should see the Search Page
    When sendkeys Search Area "tshirt" on Search Page
    Then should see the Result Page
    When taps Filter on Result Page
    Then should see the Filter Page
    When taps Filter "Kargo Bedava" on Filter Page
    When taps List Products "ÜRÜNLERİ LİSTELE" on Filter Page
    Then should see the Result Page
    When taps Order on Result Page
    Then should see the Order Page
    When taps Option "En Çok Değerlendirilen" on Order Page
    Then should see the Result Page
    When taps second Product on Result Page
    Then should see the Product Page
    When save Product Name on Product Page
    And taps Add To Basket "Sepete Ekle" on Product Page
    And taps Size "M" on Product Page
    And taps Size Add to Basket on Product Page
    Then should see the Cart Page
    And should see Same Product Name on Cart Page
    When taps Delete Button on Cart Page
    And taps Delete Popup on Cart Page
    Then should see Empty Message "Sepetinizde ürün bulunmamaktadır" on





