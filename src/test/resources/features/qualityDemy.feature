
@qd
  Feature:
    Scenario Outline: Kullanici olarak siteye basarili bir sekilde giris yapabilememeliyim

      * Kullanici browserDriver kurulumlarini gerceklestirir
      * Kullanici qualitydemy sayfasina gider
      * Kullanici cookies' i kabul eder
      * Ardindan sol taraftaki menuden Login butonuna tiklayarak login sayfasina ulastigini dogrular
      * Kullanici yanlis bilgilerle "<mail>" "<sifre>" siteye giris yapamadigini dogrular
      * Kullanici browser' i kapatir
      Examples:
      | mail | sifre |
      | yanlisEmail  | yanlisSifre  |
      | yanlisEmail1 | yanlisSifre1 |
      | yanlisEmail2 | yanlisSifre2 |