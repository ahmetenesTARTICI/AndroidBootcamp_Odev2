package com.example.androidbootcampodev2.Odev2

fun main() {

    val odevFonksyonlari =
        Odev2()          //Odev 2 clsassından odevFonksyonlari isiminde bir nesne ürettik

    //Soru 1
    val derece = 18.0
    println("Soru 1: $derece derece ->  ${odevFonksyonlari.soru1Fonksyon(derece)} fahrenhiettır")

    //Soru 2
    val kisaKenar = 9
    val uzunKenar = 15
    odevFonksyonlari.soru2Fonksyon(kisaKenar, uzunKenar)

    //Soru 3
    val sayi = 7
    val faktoriyelSayi = odevFonksyonlari.soru3Fonksyon(sayi)
    if (faktoriyelSayi == 0) {                                 //Yazdığımız sayının hatalı(negatif) olup olmadığı kontrolünü yapıyoruz ve ona göre kullanıcıya geri dönüş sağlıyoruz.
        println("Soru 3 : Faktoriyeli alınacak sayı negatif olamaz.")
    } else {
        println("Soru 3 : $sayi! = $faktoriyelSayi")
    }

    //Soru 4
    val kelime = "Kaptan"
    odevFonksyonlari.soru4Fonksyon(kelime)

    //Soru 5
    val kenarSayisi = 3
    val toplamAci = odevFonksyonlari.soru5Fonksyon(kenarSayisi)
    if (toplamAci == 0) {          // Kenar sayınısın kontrolü yapıldı.
        println("Soru 5: Yanlış değer girildi. Kenar sayısı en az 3 olmalıdır.")
    } else {
        println(
            "Soru 5: $kenarSayisi kenarlı bir şekilin iç açısı ${
                odevFonksyonlari.soru5Fonksyon(
                    kenarSayisi
                )
            } dir"
        )
    }

    //Soru 6
    val gun = 78
    var gunUcret = odevFonksyonlari.soru6Fonksyon(gun)
    var ay = 0
    var i = 0
    while (i == 0) {                    //Ücretin ay üzerinden hesabı yapılıyor.
        if (gunUcret >= 3200) {
            ay++
            gunUcret -= 3200
        } else {
            i = 1
        }
    }
    if (ay > 0) {
        println("Soru 6 : $ay aylık tam ucret(1 aylık tam ucret = 3200 tl) ve son ay için $gunUcret tl")
    } else {
        println("Soru 6 : Ücreti : $gunUcret tl")
    }


    //Soru 7

    val kota = 100
    val ucret = odevFonksyonlari.soru7Fonksyon(kota)
    if (ucret == 0) {
        println("Soru 7: Herhangi bir kullanım olmadığından ucret alınmamaktadır")
    } else if (ucret == -1) {
        println("Soru 7 :Kota kullanımı negatif olamaz")
    } else {
        println("Soru 7 : Kota kullanımınız $kota GB olduğundan ucretiniz :$ucret tl dir ")
    }


}