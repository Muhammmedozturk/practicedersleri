package day04_ifStatement;

import java.util.Scanner;

public class C03_IfStatement {
    //Kullanicidan bir gun alin
    // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
    // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
    // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun

    //Stringlerde neden == kullanılmaz. onun yerine equals kullanılır. çünkü javada 2 tane memory var
    //stack ve heap Stringte referans değerine bakıldığı için == yerine equals kullanılır

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("gün giriniz:");
        String gun= input.next();
        if (gun.equalsIgnoreCase("cuma")){
            System.out.println("muslümanlar için kutsal gün");
        } else if (gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("yahudiler için kutsal gün");
        } else if (gun.equalsIgnoreCase("pazar")) {
            System.out.println("hiristyanlar için kutsal gün");
        }else {
            System.out.println("kutsal değil");
        }


    }
}
