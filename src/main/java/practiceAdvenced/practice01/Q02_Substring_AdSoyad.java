package practiceAdvenced.practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {
    public static void main(String[] args) {
       /*
        Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
                ad ayrı soyad ayrı sekilde ekrana yazdırınız.
        Örn:
        Ad: Ali
        Soyad: Can
                */

        Scanner input=new Scanner(System.in);
        System.out.println(" ad soyad giriniz");
        String isim= input.nextLine();
        String ad=isim.substring(0,isim.indexOf(" "));
        String soyad=isim.substring(isim.indexOf(" ")+1);
        System.out.println(ad);
        System.out.println(soyad);
    }
}
