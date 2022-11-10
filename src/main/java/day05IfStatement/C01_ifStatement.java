package day05IfStatement;

import java.util.Scanner;

public class C01_ifStatement {
    /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/
    public static void main(String[] args) {


    Scanner inpt=new Scanner(System.in);
        System.out.println("lütfen ilk sayıyı giriniz..:");
        double sayi1= inpt.nextDouble();
        System.out.println("lütfen ikinci sayıyı giriniz..:");
        double sayi2= inpt.nextDouble();
        if (sayi1>0 && sayi2>0) {
            System.out.println("sayıların toplamı:" + (sayi1 + sayi2));
        } else if (sayi1<0 && sayi2<0) {
            System.out.println("sayıların çarpımı:"+(sayi1*sayi2));
        }else if (sayi1*sayi2<0){
            System.out.println("farklı işaretlerde sayılarla işlem olmaz");
        } else if (sayi1*sayi2==0) {
            System.out.println("sıfır yutan elemandır");

        }
    }
}