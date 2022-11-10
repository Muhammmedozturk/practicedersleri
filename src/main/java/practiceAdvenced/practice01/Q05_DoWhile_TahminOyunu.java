package practiceAdvenced.practice01;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {
    /*
    /0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!!.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        int rastgeleSayi = (int) (Math.random() * 100 + 1);
        int sayac = 0;
        do {
            System.out.println("1 ile 100 arasında numara giriniz:");
            sayac++;

            sayi = input.nextInt();
            if (sayi == rastgeleSayi) {
                System.out.println("tebrikler");
            } else if (sayi < rastgeleSayi) {
                System.out.println("Daha büyük sayı giriniz");
                System.out.println(10 - sayac + " hakkınız kaldı");
            } else
                System.out.println("Daha küçük bir sayı giriniz");
            System.out.println(10 - sayac + " hakkınız kaldı");
            if (sayac == 10) {
                System.out.println("hakkınız bitti oyunu kaybettiniz\n tekrar oynamak için 1 çıkmak için herhangi bir sayı  girin");
                int secenek = input.nextInt();
                if (secenek == 1) {
                    sayac = 0;
                    rastgeleSayi = (int) (Math.random() * 100 + 1);
                } else
                    break;
                }
                System.out.println(10 - sayac + " hakkınız kaldı");
            }
            while (sayi != rastgeleSayi) ;
        }
    }
