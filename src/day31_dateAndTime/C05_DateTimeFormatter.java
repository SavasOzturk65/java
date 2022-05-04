package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {
    public static void main(String[] args) {
        // Eger tarih veya saati kendi istedigimiz bicimde yazdirmak istersek
        // gun / ay / yil  saat:dakika
        LocalDateTime tarihsaat = LocalDateTime.now();
        System.out.println(tarihsaat);//2022-03-30T11:00:54.952471200

        DateTimeFormatter düzenle = DateTimeFormatter.ofPattern("dd / MM/ YYYY  HH/mm");
        System.out.println(düzenle.format(tarihsaat));//30 / 03/ 2022  11/09
            /*
		 format olustururken
		 GUN
		 d : basta 0 varsa onu yazmadan gun numarasi
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan ay numarasi
		 MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini


		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati

		 a yazarsak AM veya PM degerini yazar


		 */




    }
}
