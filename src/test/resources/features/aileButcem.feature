

Feature: AILE BUTCEM


  Background:
    * kullanici driver kurulumlarini yapar
    * ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
    * "mail" ve "sifre" bilgilerini girerek kullanici bilgileriyle giris yapin
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin

  Scenario: Verilen gorevler yerine getirilerek kullanicinin gorevleri tamamlanir
  * sol kisimdaki menuden "Hesabım" bolumune gidin
  * hesabim sayfasindaki bilgileri degistirerek 1000 "isim" "soyisim" "sehir" 513 1211 "Erkek" "yas" "meslek" "Kaydet" degisikleri kaydedin
  * ardindan degisiklerin yapildigini "isim" "soyisim" "sehir" "yas" "meslek" dogrulayin
  * kullanici uygulamayi kapatir

  @ab
  Scenario: Verilen gorevler belirtilen sekilde gerceklestirilir
  * anasayfadaki arti butonuna tiklayin
  * "Gelir Ekle" bolumune tiklayin
  * aciklama, gelir tipi, kategori, tarih ve tutari belirleyin ve kaydedin
  * basariyla eklendigini dogrulayin
  * kullanici uygulamayi kapatir