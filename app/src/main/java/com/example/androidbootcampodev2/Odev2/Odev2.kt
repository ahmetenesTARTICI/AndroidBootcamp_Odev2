package com.example.androidbootcampodev2.Odev2

class Odev2 {

    //Paremetre olarak girilen dereceyi fahrenhiet a dönüştürdükten sonra geri döndüren bir method yazınız.(F=CX1.8+32)
    //Soru 1 fonksyonu
    fun soru1Fonksyon(derece: Double): Double {
        val fahrenhiet = (derece * 1.8) + 32
        return fahrenhiet
    }

    //Kenarları paremetre olarak girilen ve dikdörtgenin çevresini hesaplayan bir method yazınız.
    //Soru 2 fonksyonu

    fun soru2Fonksyon(kisaKenar: Int, uzunKenar: Int) {
        if (kisaKenar <= 0 && uzunKenar <= 0) {                // Kenar uzunluklarının 0 veya negatif olup olmadığını kontrol ediyoruz.
            println("Soru 2 : uzunluk değerleri negatif veya sıfır olamaz")
        } else {
            val cevre = (kisaKenar * 2) + (uzunKenar * 2)
            println("Soru 2 : Kısa kenarı $kisaKenar , uzun kenarı $uzunKenar olan dikdörtgenin çevresi :  $cevre dir")
        }
    }


    //Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri döndüren methodu yazınız.
    //Soru 3 fonksyonu

    fun soru3Fonksyon(sayi: Int): Int {
        var faktoriyelSayi = 1
        if (sayi == 0) {              //Faktöriyeli alınacak olan sayının 0 veya negatif olma kontrolünü yapıyoruz.
            faktoriyelSayi = 1

        } else if (sayi < 0) {
            faktoriyelSayi = 0

        } else {
            for (i in sayi downTo 1) {
                faktoriyelSayi *= i
            }

        }
        return faktoriyelSayi
    }

    //Paremetre olarak girilen kelime içinde kaç adet a harfi olduğunu gösteren bir method yazınız.
    //Soru 4

    fun soru4Fonksyon(kelime: String) {
        var sayac = 0
        for (i in kelime) {   //Kelimenin tüm harflerini tek tek dolaşıyoruz ve her a gördüğümüzde sayacı bir arttırıyoruz.
            if (i == 'a') {
                sayac++
            }
        }
        println("Soru 4 : $kelime kelimesinde $sayac adet a harfi vardır.")
    }

    //Paremetre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri döndüren method yazınız.(iç açılar toplamı =(kenar sayısı - 2) X 180)
    //Soru 5

    fun soru5Fonksyon(kenarSayisi: Int): Int {
        var icAciToplami = 0
        if (kenarSayisi < 3) {    //En az 3 kenara sahip olması gerektiğinden 3 kenarı varmı diye kontrol sağlıyoruz
            icAciToplami = 0
        } else {
            icAciToplami = (kenarSayisi - 2) * 180
            return icAciToplami
        }
        return icAciToplami
    }

    //Paremetre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren method yazınız.
    //    - 1 günde 8 saat çalışılabilir
    //    - Çalışma saat ucreti 10 tl
    //    - Mesai saat ücreti 20 tl
    //    - 160 saat üzeri mesai sayılır

    //Soru 6

    fun soru6Fonksyon(gun: Int): Int {

        var ucret = 0
        var sayac = 0
        if (gun > 30) {//çalıştığı gün 1 aydan fazla ise
            var yeniGun = gun
            for (i in 1..12) {
                if (yeniGun >= 30) {
                    yeniGun -= 30
                    sayac++

                } else {

                    if (yeniGun <= 20) { //20 gun ve altı çalışma için
                        ucret = ((yeniGun * 8) * 10) + (sayac * 3200)
                        break

                    } else { //20 gun ustü çalışma için
                        val fazlaGun = yeniGun - 20
                        val gunlukMesaiUcreti1 = (fazlaGun * 8) * 20
                        ucret = 1600 + gunlukMesaiUcreti1 + (sayac * 3200)
                        break

                    }

                }

            }

        } else {
            if (gun <= 20) { //20 gun ve altı çalışma için
                ucret = (gun * 8) * 10

            } else {
                val fazlaGun = gun - 20//20 gun ustü çalışma için
                val gunlukMesaiUcreti2 = (fazlaGun * 8) * 20
                ucret = 1600 + gunlukMesaiUcreti2

            }
        }
        return ucret
    }

    //Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren methodu yazınız.
    // - 50gb=100 tl
    // - Kota aşımından sonra her 1gb 4 tl dir
    //Soru 7

    fun soru7Fonksyon(kota: Int): Int {
        var kotaUcreti = 0
        var yeniKota = 0
        if (kota == 0) {            //Kota kullanım miktarına göre sınıflandırılıyor.
            kotaUcreti = 0
        } else if (kota < 0) {
            kotaUcreti = -1
        } else if (kota <= 50) {
            kotaUcreti = 100
        } else {
            yeniKota = kota - 50
            kotaUcreti = 100 + (yeniKota * 4)
        }
        return kotaUcreti
    }


}