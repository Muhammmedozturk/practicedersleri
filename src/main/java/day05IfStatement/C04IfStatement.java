package day05IfStatement;

import java.util.Scanner;

public class C04IfStatement {
    /*
    //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
// calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.
     */
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
        System.out.println("cinsiyetinizi yazınız:"+ "\n kadın için K erkek için E harfini giriniz");
        char cins=input.next().toUpperCase().charAt(0);
        System.out.println("yaşınızı giriniz:");
        double yas=input.nextDouble();
        if (cins=='K'){
            if (yas<0 || yas>120){
                System.out.println("lütfen doğru yaş değerini giriniz");
            } else if (yas>60) {
                System.out.println("emekliolabilirsin");
            }else{
                System.out.println("emekli olamazsın \n"+ (65-yas) +" yıl daha çalışmalısın");
            }
        } else if (cins=='E') {
            if (yas<0 || yas>120){
                System.out.println("doğru yaş değerini giriniz");
            }else if (yas>65){
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println((65-yas)+ "yıl daha çalışmalısın");
            }


        }else {
            System.out.println("Geçerli bir cinsiyet giriniz");
        }
    }
}