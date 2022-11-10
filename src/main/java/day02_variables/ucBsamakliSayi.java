package day02_variables;

import java.util.Scanner;

public class ucBsamakliSayi {
    public static void main(String[] args) {

        //  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         /* Ornek : Inputs : 853
         Output : Girdiginiz sayinin birler basamagi : 3
                  Girdiginiz sayinin onlar basamagi : 5
                  Girdiginiz sayinin yuzler basamagi : 8
     */
        Scanner input = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi = input.nextInt();
        // 1) 1 ler basamagindaki sayiyi bulun
        int birler = sayi % 10;
        System.out.println("girdiginiz sayinin birler basamagi " + birler);//3
        sayi=sayi / 10;
        //sayi /= 10;
        System.out.println("ikiBas = " + sayi);//85
        // 2) 10 lar basamagindaki sayiyi bulun
        int onlar = sayi % 10;
        System.out.println("girdiginiz sayinin onlar basamagi " + onlar);//5
        sayi = sayi / 10;
        // 3) 100 ler basamagindaki sayiyi bulun
        int yuzler = sayi;
        System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);
    }
}
