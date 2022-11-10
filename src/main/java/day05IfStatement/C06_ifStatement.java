package day05IfStatement;

import java.util.Scanner;

public class C06_ifStatement {
    //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
// Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
// Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
// Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
// Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("4 basamaklı sayı gir:");
        int sayi = input.nextInt();
        if (sayi<1000 && sayi>9999){
            System.out.println("4 basamaklı sayı gir:");
        } else if (sayi%5==0) {
            if (sayi%10==0){
                System.out.println("5 e bölünebilen çift sayı");
            }else {
                System.out.println("5 e bölünebilen tek sayı");
            }
            System.out.println("");
        }else {
            System.out.println("tekrar deneyin");
        }



    }
}
