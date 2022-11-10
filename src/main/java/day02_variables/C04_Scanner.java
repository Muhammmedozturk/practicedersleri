package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini
        // ekrana yazdiran programi yazdiriniz
        Scanner input=new Scanner(System.in);
        System.out.println("4 basamaklı sayı giriniz..:");
        int sayi= input.nextInt();
        int birbasamak=sayi%10;//bir sayının birler basamağındaki rakamı %10 ile bulabiliriz
        int sonbasamak=sayi/1000;
        System.out.println("birinci basamak ile son basamak toplamı "+(birbasamak+sonbasamak));

        ///  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler
        // ,onlar ve yuzler basamagi olarak yazdirin
        Scanner input1=new Scanner(System.in);
        System.out.println("3 basamaklı sayı giriniz..:");
        int say =input1.nextInt();
        int bir=say%10;//birler basamağındaki sayıyı bulabilmek için sayıyı 10 abölebiliriz
        int on=(say/10)%10;//onlar basamağındaki sayıyı bulabilmek için sayıyı önce 10 bölüp sonra macılıs 10 alırız
        int yuz=say/100;//yuzler basamağını bulabilmek için 100 e böleriz
        System.out.println(bir+on+yuz);
        ////  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //        //         *   Ex :
        //        //         *   input  : 12345==>1+2+4+5=12
        //        //         *   output : 12
        Scanner input2=new Scanner(System.in);
        System.out.println("5 basamaklı sayı giriniz..:");
        int besbSayi=input2.nextInt();
        int sonIkı=besbSayi%100;//son iki basamaklı sayıyı bulmak için 100 e böldüm
        int birler=sonIkı%10;//bulduğum iki basamaklı sayıyı birler basamağını buldum
        int onlar=sonIkı/10;//10 lar basamağındaki rakamı bulmak için 10 a böldüm
        System.out.println("Sayının son iki basamağı toplamı:"+(birler+onlar));
        int ilkIkı=besbSayi/1000;//ilk iki basamağı bulmak için 1000 e böldüm
        int binler=ilkIkı%10;// bulduğum iki basamaklı sayının birler basamağını buldum
        int yuzbinler=ilkIkı/10;//bulduğum iki basamaklı sayıyı 10 a bölerek ilk rakamını buldum
        System.out.println("Sayının ilk iki basamağı toplamı:"+(binler+yuzbinler));


    }
}
