Feature: Functionality on login page of Application


  Scenario: Verification of Login button


    Given Open the Chrome and launch the application

    Given Güncel fırsatlar pop-up'ında daha sonra butonu tıklanır

    Then hover on moda
    Then click on kadın
    Then click price filter
    Given click on ücretsiz kargo
    Then click on first saat
    Given click on sepete ekle
    Given click on alışverişi tamamla
    Given kullanıcı adına 'merve.yenice@testinium.com' yaz
    Then şifreye '1234Merve' yaz
    Then Devam et tıkla
    Given Name 'Merve' yaz
    Then SurName 'Yenice' yaz
    Then Address 'dnfjdbjhdfbghjfdbvhjdbfvh vdfdjnv  vdfnjvbdhjvb' yaz
    Then il '1' seç
    Then Telefon '5438816048' yaz
    Then ilçe '1' seç
    Then kaydet tıkla
#
#    * Enter the key